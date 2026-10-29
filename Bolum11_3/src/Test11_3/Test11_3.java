package Test11_3;

import tr.edu.istiklal.Account;
import tr.edu.istiklal.CheckingAccount;
import tr.edu.istiklal.SavingsAccount;

public class Test11_3 {

    public static void main(String[] args) {
        Account account = new Account(1001, 5000);
        account.setAnnualInterestRate(4.5);

        SavingsAccount savings = new SavingsAccount(2002, 10000);
        savings.setAnnualInterestRate(5.0);

        CheckingAccount checking = new CheckingAccount(3003, 2000, 1000);
        checking.setAnnualInterestRate(1.5);

        System.out.println(account.toString());
        System.out.println(savings.toString());
        System.out.println(checking.toString());

     
        savings.withdraw(12000);   
        checking.withdraw(2500);
        checking.withdraw(1000);   
        System.out.println("Tasarruf hesabı bakiyesi: " + savings.getBalance());
        System.out.println("Vadesiz hesap bakiyesi: " + checking.getBalance());
    }
}