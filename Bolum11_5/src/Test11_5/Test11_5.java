package Test11_5;

import tr.edu.istiklal.Course;

public class Test11_5 {

    public static void main(String[] args) {
        Course course1 = new Course("Veri Yapıları");
        Course course2 = new Course("Veritabanı Sistemleri");

        course1.addStudent("Ahmet Yılmaz");
        course1.addStudent("Ayşe Demir");
        course1.addStudent("Mehmet Kaya");

        course2.addStudent("Ahmet Yılmaz");
        course2.addStudent("Zeynep Arslan");

        System.out.println("1. dersteki öğrenci sayısı: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }

        System.out.println();
        System.out.print("2. dersteki öğrenci sayısı: "
                + course2.getNumberOfStudents());

        course1.dropStudent("Ayşe Demir");
        System.out.println();
        System.out.println("Ayşe Demir 1. dersten çıkarıldıktan sonra: "
                + course1.getNumberOfStudents());
    }
}