package Review13;

public class InsufficientAccountBalanceException extends Exception{

    public InsufficientAccountBalanceException(String message){
        super(message);
    }
}
