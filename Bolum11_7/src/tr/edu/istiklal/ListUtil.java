package tr.edu.istiklal;

import java.util.ArrayList;

public class ListUtil {

    public static void shuffle(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}