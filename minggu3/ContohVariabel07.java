package minggu3;
public class ContohVariabel07 {
    public static void main (String[] args) {
        String salahSatuHobySayaAdalah = "Membaca Buku";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte _umurSayaSekarang = 18;
        double $ipk = 3.55, tinggi = 1.58;
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umurku saat ini: " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk,tinggi));
    }
}
