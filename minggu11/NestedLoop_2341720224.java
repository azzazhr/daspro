package minggu11;

import java.util.Scanner;

public class NestedLoop_2341720224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.println("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
        }

        int i = 1;
        for (double[] kota : temps) {
            System.out.print("Kota ke-" + i + " : ");
            for (double hari : kota) {
                System.out.print(hari + " ");
            }
            System.out.println();
            i++;

        }
    }
}
