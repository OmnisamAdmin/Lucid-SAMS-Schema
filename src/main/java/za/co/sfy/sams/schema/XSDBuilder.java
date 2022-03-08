package za.co.sfy.sams.schema;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import za.co.sfy.sams.exception.LucidSamsExecutionException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class XSDBuilder {

    private static final java.util.logging.Logger LOGGER = Logger.getLogger(XSDBuilder.class.getName());

    private static final String OPENING_TAG = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "\n<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:od=\"urn:schemas-microsoft-com:officedata\">";
    private static final String CLOSING_TAG = "\n</xsd:schema>";

    private String hostedLocation= "http://omnisam.co.za/sasams21.3.0/";

    private String outputLocation = "./SASAMS_Schemas.xsd";

    public void build() throws LucidSamsExecutionException {

        long start = new Date().getTime();
        LOGGER.info("Generating Combined XSD");

        createNewFile();
        ArrayList<URL> fileLocations = readDirectory();
        for (URL fileLocation : fileLocations) {
            buildFileContents(fileLocation);
            LOGGER.info("Finished appending: " + fileLocation);
        }

        addClosingTag();
        long end = new Date().getTime();

        double diff = (end - start) * 0.001;
        LOGGER.info("Completed in: " + diff + " Seconds");
    }

    private void buildFileContents(URL fileLocation) throws LucidSamsExecutionException {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(fileLocation.openStream()));
            String inputLine;
            Path path = Paths.get(outputLocation);

            while ((inputLine = bufferedReader.readLine()) != null) {

                if (inputLine.contains("version=\"1.0\" encoding=\"UTF-8\"") || inputLine.contains("xsd:schema xmlns:xsd")) {
                    continue;
                }

                if (inputLine.equalsIgnoreCase("<xsd:element name=\"dataroot\">")) {
                    while ((inputLine = bufferedReader.readLine()) != null) {
                        if (inputLine.equals("</xsd:element>")) {
                            inputLine = bufferedReader.readLine();
                            break;
                        }
                    }
                }

                if (inputLine.contains("</xsd:schema>")) {
                    continue;
                }
                try {
                    Files.write(path, inputLine.getBytes(), APPEND);
                } catch (IOException e) {
                    throw new LucidSamsExecutionException("Unable to open the SASAMS_Schemas.xsd to write the file contents." +
                            " and create the file.", e);
                }
            }
        } catch (IOException e) {
            throw new LucidSamsExecutionException("Unable to open the SASAMS_Schemas.xsd to populate all " +
                    "child XSD's.", e);
        } finally {
            try {
                if (null != bufferedReader) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new LucidSamsExecutionException("Unable to close streams after writing to SASAMS_Schemas.xsd.", e);
            }
        }
    }

    private void createNewFile() throws LucidSamsExecutionException {

        Path path = Paths.get(outputLocation);
        try {
            Files.write(path, OPENING_TAG.getBytes(), TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new LucidSamsExecutionException("Unable to open the SASAMS_Schemas.xsd to write the opening tag" +
                    " and create the file.", e);
        }
    }

    private void addClosingTag() throws LucidSamsExecutionException {

        Path path = Paths.get(outputLocation);
        try {
            Files.write(path, CLOSING_TAG.getBytes(), APPEND);
        } catch (IOException e) {
            throw new LucidSamsExecutionException("Unable to open the SASAMS_Schemas.xsd to write the closing tag.", e);
        }
    }

    private ArrayList<URL> readDirectory() throws LucidSamsExecutionException {

        ArrayList<URL> hostedFiles = new ArrayList<>();
        Document document;
        try {
            document = Jsoup.connect(hostedLocation).get();
        } catch (IOException e) {
            throw new LucidSamsExecutionException("Unable to establish connection to the hosted XSD directory", e);
        }

        // This foreach loop reads all files from the directory listing so that we can create the full file names to
        // read from.
        for (Element file : document.select("td a")) {
            String fileName = file.attr("href");
            if (fileName.contains("/")) {
                continue;
            }

            URL hostedFileLocationURL = null;
            try {
                hostedFileLocationURL = new URL(hostedLocation + fileName);
            } catch (MalformedURLException e) {
                throw new LucidSamsExecutionException("Unable to create hosted XSD location URL.", e);
            }
            hostedFiles.add(hostedFileLocationURL);
        }

        return hostedFiles;
    }
}