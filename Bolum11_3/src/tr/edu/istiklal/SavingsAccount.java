package tr.edu.istiklal;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Yetersiz bakiye");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
    	return "Tasarruf Hesabı: id = " + getId() + ", bakiye = " + getBalance()
        + ", yıllık faiz oranı = " + getAnnualInterestRate()
        + ", oluşturulma tarihi = " + getDateCreated();
    }
}