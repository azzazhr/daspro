package minggu11;

import java.util.Scanner;

public class NestedLoop_2341720224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temps[][] = new double[5][7];
        double rerata[] = new double[5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                temps[i][j] = sc.nextDouble();
                rerata[i] += temps[i][j];
            }
        }

        for (int i = 0; i < rerata.length; i++) {
            rerata[i] /= 7;
        }

        int k = 1;
        for (double[] kota : temps) {
            System.out.print("Kota ke-" + k + " : ");
            for (double hari : kota) {
                System.out.print(hari + " ");
            }
            System.out.println();
            k++;
        }

        for (int i = 0; i < rerata.length; i++) {
            System.out.println("Rata-rata kota ke-" + (i + 1) + " : " + rerata[i]);
        }

    }
}
