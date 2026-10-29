package tr.edu.istiklal;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return  getName();
    }
}