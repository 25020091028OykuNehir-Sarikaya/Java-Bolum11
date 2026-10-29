package Test11_10;

import java.util.Scanner;

import tr.edu.istiklal.MyStack;

public class Test11_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.print("Beş kelime girin: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        System.out.print("Ters sırada: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        input.close();
    }
}