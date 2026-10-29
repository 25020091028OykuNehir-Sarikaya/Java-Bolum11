package Test11_7;

import java.util.ArrayList;

import tr.edu.istiklal.ListUtil;

public class Test11_7 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Önce: " + list);
        ListUtil.shuffle(list);
        System.out.println("Sonra: " + list);
    }
}