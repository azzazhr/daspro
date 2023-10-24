package UtsSmt1;

import java.util.Scanner;

public class Uts307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, digit, jumlahDigitGanji;

        System.out.println("Masukkan bilangan positif : ");
        N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Harus memasasukkan bilangan positif ");
        } else {
            int jumlahDigitGanjil = 0;

            while (N > 0) {
                digit = N % 10;
                if (digit % 2 != 0) {
                    jumlahDigitGanjil++;
                }
                N /= 10;

            }
            System.out.println("Jumlah digit ganjil dalam bilangan N adalah: " + jumlahDigitGanjil);
        }
    }

}
