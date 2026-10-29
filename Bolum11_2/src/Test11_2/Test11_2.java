package Test11_2;

import tr.edu.istiklal.Employee;
import tr.edu.istiklal.Faculty;
import tr.edu.istiklal.MyDate;
import tr.edu.istiklal.Person;
import tr.edu.istiklal.Staff;
import tr.edu.istiklal.Student;

public class Test11_2 {

    public static void main(String[] args) {
        Person person = new Person("Oyku Nehir Sarikaya", "Malatya", "0553 455 67 89","25020091028@istiklal.edu.tr");

        Student student = new Student("Melike Torun", "Hatay", "0532 117 90 23","25020091010@istiklal.edu.tr", Student.SOPHOMORE);

        Employee employee = new Employee("Meryem Karakus", "Urfa ","0543 224 56 36", "26020091012@istiklal.edu.tr", "A-101", 25000, new MyDate());

        Faculty faculty = new Faculty("Dr. Ugur Demiroglu", "Elazig", "0534 455 32 98", "ugurdemiroglu@istiklal.edu.tr", "B-205", 45000,
        		 new MyDate(2010, 8, 1), "Cum 09.40-14:30", "Professor");

        Staff staff = new Staff("Sercan Dag", "Maras", "0535 446 32 27","sercandag@istiklal.edu.tr", "C-12", 18000, new MyDate(2018, 2, 15),"Secretary");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}