package za.co.sfy.sams;

import za.co.sfy.sams.exception.LucidSamsExecutionException;
import za.co.sfy.sams.schema.XSDBuilder;

public class SchemaGenerator {

    public static void main(String[] args) throws LucidSamsExecutionException {

        XSDBuilder xsdBuilder = new XSDBuilder();
        xsdBuilder.build();
    }
}
