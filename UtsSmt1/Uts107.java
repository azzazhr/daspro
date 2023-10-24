package UtsSmt1;

import java.util.Scanner;

public class Uts107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;

        System.out.println("Masukkan sudut 1: ");
        bilangan = sc.nextInt();
        System.out.println("Masukkan sudut 2: ");
        bilangan = sc.nextInt();
        System.out.println("Masukkan sudut 3: ");
        bilangan = sc.nextInt();

        if (bilangan <= 180) {
            System.out.println("Segitiga merupakan segitiga Siku-Siku");
        } else {
            System.out.println("Segitiga merupakan segitiga bukan siku-siku");

        }

    }
}
