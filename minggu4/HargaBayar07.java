package minggu4;
import java.util.Scanner;
public class HargaBayar07 {
    public static void main (String [] args){
        Scanner input =new Scanner(System.in);
        int harga, jumlah, jumlahHalaman;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkkan merk buku");
        merkBuku=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku");
        jumlahHalaman=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan diskon barang");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        
        System.out.println("DIskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);

        
    }
}
