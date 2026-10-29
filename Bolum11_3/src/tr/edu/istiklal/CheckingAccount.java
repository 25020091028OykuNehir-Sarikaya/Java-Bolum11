package tr.edu.istiklal;

public class CheckingAccount extends Account {
    private double overdraftLimit = 0;

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < -overdraftLimit) {
            System.out.println("Limit aşıldı");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
    	return "Vadesiz Hesap: id = " + getId() + ", bakiye = " + getBalance()
        + ", kredili mevduat limiti = " + overdraftLimit
        + ", oluşturulma tarihi = " + getDateCreated();
    }
}