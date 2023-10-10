package minggu7;
import java.util.Scanner;
public class DoWhileCuti07 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();
                
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            } else {
                System.out.println("Input Konfirmasi Salah");
            } 
        } while (jatahCuti > 0);
    }
}   