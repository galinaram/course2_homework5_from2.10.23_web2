package course2.homework4.hw4.exeptions;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException (String message) {
        super(message);
    }
}
