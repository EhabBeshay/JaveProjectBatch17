package Review13;

public class Account {
    private  double accountBalance;
    Account(double accountBalance){
        this.accountBalance = accountBalance;
    }

    void transferFunds(double amount) throws InsufficientAccountBalanceException {
        if(amount>accountBalance){
            throw new InsufficientAccountBalanceException("You don't have enogh funds");
        }
    }
}

class AccountTester{
    public static void main(String[] args) throws InsufficientAccountBalanceException {
        Account account = new Account(100);
        account.transferFunds(12000);
    }
}
