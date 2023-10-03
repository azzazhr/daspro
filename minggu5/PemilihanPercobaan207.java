package minggu5;
import java.util.Scanner;
public class PemilihanPercobaan207 {
    public static void main (String[] args){
       Scanner input07 = new Scanner(System.in);
       System.out.print("Nilai uas    : ");
       float uas = input07.nextFloat();
       System.out.print("Nilai uts    : ");
       float uts = input07.nextFloat();
       System.out.print("Nilai kuis   : ");
       float kuis = input07.nextFloat();
       System.out.print("Nilai tugas  : ");
       float tugas = input07.nextFloat();

       float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
       String message = total < 65 ? "Remidi" : "Tidak remidi";

       System.out.println("Nilai akhir = " + total + " sehingga " + message);

       if( total > 80 && total <= 100) {
        System.out.println("Mendapat nilai A dengan kualifikasi Sangat Baik");
       } else if ( total > 73 && total <= 80) {
        System.out.println("Mendapat nilai B+ dengan kualifikasi Lebih dari Baik");
       } else if ( total > 65 && total <= 73){
        System.out.println("Mendapat nilai B dengan kualifikasi Baik");
       } else if ( total > 60 && total <= 65) {
        System.out.println("Mendapat nilai C+ dengan kualifikasi Lebih dari Cukup");
       } else if ( total > 50 && total <= 68) {
        System.out.println("Mendapat nilai C dengan kualifikasi Cukup");
       } else if ( total > 39 && total <= 50) {
        System.out.println("Mendapat nilai D dengan kualifikasi Kurang");
       } else {
       }
    }
}
