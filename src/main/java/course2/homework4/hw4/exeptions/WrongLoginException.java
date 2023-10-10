package course2.homework4.hw4.exeptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException (String message) {
        super(message);
    }
}
