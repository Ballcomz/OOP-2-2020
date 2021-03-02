package Lexam;

public class Main {
    public static void main(String args[]) {
        BankAccount myAccount = new BankAccount(1000.00);

        Transaction viewBalance = new ViewBalance(); // Line X
        viewBalance.excute(myAccount, 0.00);

        Transaction withdraw = new Withdraw();
        Transaction deposit = new Deposit();
        withdraw.excute(myAccount, 100.00);
        viewBalance.excute(myAccount, 0.00);
        deposit.excute(myAccount, 500.00);
        viewBalance.excute(myAccount, 0.00);
    }

}
