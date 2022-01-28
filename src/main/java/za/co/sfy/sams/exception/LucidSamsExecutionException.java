package za.co.sfy.sams.exception;


public class LucidSamsExecutionException extends Exception{

    public LucidSamsExecutionException(String message) {
        super(message);
    }

    public LucidSamsExecutionException(String message, Throwable cause) {
        super(message, cause);
    }
}
