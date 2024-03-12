package Swed.it.academy.project;

public class UnknowShapeException extends Exception{
    private final String message;

    @Override
    public String getMessage() {
        return message;
    }

    public UnknowShapeException(String textMsg) {
        this.message = textMsg;

    }
}
