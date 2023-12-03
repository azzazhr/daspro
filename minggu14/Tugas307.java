package minggu14;

import java.util.Scanner;

public class Tugas307 {
    static boolean bilPrima(int n, int pembagi) {
        if (n <= 1) {
            return false;
        }
        if (pembagi == 1) {
            return true;
        }

        if (n % pembagi == 0) {
            return false;
        } else {
            return bilPrima(n, pembagi - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan : ");
        int bilangan = sc.nextInt();

        if (bilPrima(bilangan, bilangan - 1)) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + "  bukan bilangan prima");
        }
    }
}
