package Database;

/**
 * Created by User on 09.08.2016.
 */
public class IncorrectTitleException extends DataBaseException{
    public IncorrectTitleException() {
    }

    public IncorrectTitleException(String message) {
        super(message);
    }
}
