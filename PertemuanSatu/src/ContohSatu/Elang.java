/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohSatu;

/**
 *
 * @author RIYANA
 */
public class Elang extends Burung {

    private int KecepatanTerbang;
    private int KetinggianTerbang;

    /**
     * @return the KecepatanTerbang
     */
    protected int getKecepatanTerbang() {
        return KecepatanTerbang;
    }

    /**
     * @param KecepatanTerbang the KecepatanTerbang to set
     */
    protected void setKecepatanTerbang(int KecepatanTerbang) {
        this.KecepatanTerbang = KecepatanTerbang;
    }

    /**
     * @return the KetinggianTerbang
     */
    protected int getKetinggianTerbang() {
        return KetinggianTerbang;
    }

    /**
     * @param KetinggianTerbang the KetinggianTerbang to set
     */
    protected void setKetinggianTerbang(int KetinggianTerbang) {
        this.KetinggianTerbang = KetinggianTerbang;
    }

    public static void main(String[] args) {
        Elang jawa = new Elang();
        jawa.setJumlahMata(2);
        jawa.setJumlahKaki(2);
        jawa.setWarnaBulu("Coklat Kemerahan");
        jawa.setJenisParuh("Tajam Melengkung");
        jawa.setLebarSayap(130);
        jawa.setKecepatanTerbang(160);
        jawa.setKetinggianTerbang(15000);

        System.out.println("Jumlah Mata Elang : " + jawa.getJumlahMata());
        System.out.println("Jumlah Kaki Elang : " + jawa.getJumlahKaki());
        System.out.println("Warna Bulu Elang : " + jawa.getWarnaBulu());
        System.out.println("Jenis Paruh Elang : " + jawa.getJenisParuh());
        System.out.println("Lebar Sayap Elang : " + jawa.getLebarSayap() + " cm");
        System.out.println("Kecepatan Terbang Elang : " + jawa.getKecepatanTerbang() + "km/jam");
        System.out.println("Ketinggian Terbang Elang : " + jawa.getKetinggianTerbang() + "kaki");
    }
}
