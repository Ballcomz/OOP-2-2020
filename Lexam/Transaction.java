package Lexam;

public class Transaction {
    public void excute(BankAccount acc, Double amount) {
        System.out.println("Perform Transaction");
    }

}

public class ViewBalance extends Transaction {

}

public class Withdraw extends Transaction {

}

public class Deposit extends Transaction {

}