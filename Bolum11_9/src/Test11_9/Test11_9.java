package Test11_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz : ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        System.out.println("Rastgele dizi:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        ArrayList<Integer> rowList = new ArrayList<Integer>();
        ArrayList<Integer> columnList = new ArrayList<Integer>();
        int maxRow = -1;
        int maxColumn = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                count += matrix[i][j];
            }
            if (count > maxRow) {
                maxRow = count;
                rowList.clear();
                rowList.add(i);
            } else if (count == maxRow) {
                rowList.add(i);
            }
        }

        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                count += matrix[i][j];
            }
            if (count > maxColumn) {
                maxColumn = count;
                columnList.clear();
                columnList.add(j);
            } else if (count == maxColumn) {
                columnList.add(j);
            }
        }

        System.out.print("En çok 1 içeren satır indeksi: ");
        for (int i = 0; i < rowList.size(); i++) {
            System.out.print(rowList.get(i));
            if (i < rowList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("En çok 1 içeren sütun indeksi: ");
        for (int i = 0; i < columnList.size(); i++) {
            System.out.print(columnList.get(i));
            if (i < columnList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        input.close();
    }
}