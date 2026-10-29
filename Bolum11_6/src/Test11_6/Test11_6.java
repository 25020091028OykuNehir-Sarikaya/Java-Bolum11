package Test11_6;

import java.util.ArrayList;
import java.util.Date;

import tr.edu.istiklal.Circle;
import tr.edu.istiklal.Loan;

public class Test11_6 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();

        list.add(new Loan(5.5, 10, 50000));
        list.add(new Date());
        list.add("---------------------------");
        list.add(new Circle(4.5));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}