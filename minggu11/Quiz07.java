package minggu11;

import java.util.Scanner;
import java.util.Random;

public class Quiz07 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'Y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                if (answer < number) {
                    System.out.println("Input nilai < jawaban");
                } else if (answer > number) {
                    System.out.println("Input nilai > jawaban");
                }
            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');

    }
}
