package Uas.PBO;

public class Main {
    public static void main(String[] args) {

        PegawaiTetap pegawaiTetap = new PegawaiTetap("FunnyTzy", 2500000);
        pegawaiTetap.Infopegawai();
        System.out.println("Gaji Lembur (4 jam): Rp" + pegawaiTetap.hitungGajiLembur(4));
        System.out.println("Gaji Bersih: Rp" + pegawaiTetap.hitungGajiBersih(4));
        System.out.println();


        
        PegawaiTidakTetap pegawaiTidakTetap = new PegawaiTidakTetap("LingLung", 4000000);
        pegawaiTidakTetap.Infopegawai();
        System.out.println("Gaji Lembur (6 jam): Rp" + pegawaiTidakTetap.hitungGajiLembur(6));
        System.out.println("Gaji Bersih: Rp" + pegawaiTidakTetap.hitungGajiBersih(6));
    }
}