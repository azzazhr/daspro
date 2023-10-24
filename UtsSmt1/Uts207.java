package UtsSmt1;

import java.util.Scanner;

public class Uts207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, total, kuadrat;

        System.out.println("Masukkkan bilangan: ");
        N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Harus memasukkan bilangan bulat positif: ");
        } else {
            total = 0;

            for (int i = 1; i <= N; i++) {
                kuadrat = i * i;
                total += kuadrat;
            }
            System.out.println("Penjumlahan kuadrat adalah: " + total);
        }

    }
}
