package Test11_8;

import tr.edu.istiklal.Account;
import tr.edu.istiklal.Transaction;

public class Test11_8 {

    public static void main(String[] args) {
        Account account = new Account("Nehir", 1122, 1000);
        account.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Hesap sahibi: " + account.getName());
        System.out.println("Yıllık faiz oranı:" + account.getAnnualInterestRate());
        System.out.println("Bakiye: " + account.getBalance());
        System.out.println();
        System.out.println("İşlemler:");

        for (Transaction t : account.getTransactions()) {
            System.out.println(t.getDate() + "  " + t.getType() + "  " + t.getAmount() + "  bakiye: " + t.getBalance()
             + "  (" + t.getDescription() + ")");
        }
    }
}