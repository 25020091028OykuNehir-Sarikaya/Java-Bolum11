package Test11_4;

import java.util.ArrayList;
import java.util.Scanner;

import tr.edu.istiklal.MaxFinder;

public class Test11_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Sayıları girin: ");
        int number = input.nextInt();

        while (number != 0) {
            list.add(number);
            number = input.nextInt();
        }

        Integer result = MaxFinder.max(list);

        if (result == null) {
            System.out.println("Liste boş");
        } else {
            System.out.println( result);
        }

        input.close();
    }
}