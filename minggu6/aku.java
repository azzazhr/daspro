package minggu6;
import java.util.Scanner;
public class aku {
    public static void main (String[] args){
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji=40000, potGaji=250000;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan gaji");
        gaji=input.nextInt();
        System.out.println("Maskkan potongan gaji");
        potGaji=input.nextInt();
        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);



        
    }
}
