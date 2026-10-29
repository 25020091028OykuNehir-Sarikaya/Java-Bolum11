package tr.edu.istiklal;

public class Student extends Person {
    public static  String FRESHMAN = "freshman";
    public static String SOPHOMORE = "sophomore";
    public static  String JUNIOR = "junior";
    public static  String SENIOR = "senior";

    private String status;

    public Student(String name, String address, String phone, String email,
            String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return  getName();
    }
}