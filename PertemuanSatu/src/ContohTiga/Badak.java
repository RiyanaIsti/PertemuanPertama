/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohTiga;

/**
 *
 * @author RIYANA
 */
public class Badak extends Mamalia {

    private String WarnaKulit;
    private int JumlahCula;

    /**
     * @return the WarnaKulit
     */
    protected String getWarnaKulit() {
        return WarnaKulit;
    }

    /**
     * @param WarnaKulit the WarnaKulit to set
     */
    protected void setWarnaKulit(String WarnaKulit) {
        this.WarnaKulit = WarnaKulit;
    }

    /**
     * @return the JumlahCula
     */
    protected int getJumlahCula() {
        return JumlahCula;
    }

    /**
     * @param JumlahCula the JumlahCula to set
     */
    protected void setJumlahCula(int JumlahCula) {
        this.JumlahCula = JumlahCula;
    }

    public static void main(String[] args) {
        Badak jawa = new Badak();
        jawa.setJumlahMata(2);
        jawa.setJumlahKaki(4);
        jawa.setWarnaKulit("Abu-abu");
        jawa.setJenisKulit("Kulit Tebal");
        jawa.setCaraBerkembangbiak("Melahirkan (Vivipar)");
        jawa.setJenisMakanan("Tumbuhan");
        jawa.setJumlahCula(1);

        System.out.println("Jumlah Mata Badak : " + jawa.getJumlahMata());
        System.out.println("Jumlah Kaki badak : " + jawa.getJumlahKaki());
        System.out.println("Warna Kulit Badak : " + jawa.getWarnaKulit());
        System.out.println("Jenis Kulit Badak : " + jawa.getJenisKulit());
        System.out.println("Cara Berkembangbiak Badak : " + jawa.getCaraBerkembangbiak());
        System.out.println("Jenis Makanan Badak : " + jawa.getJenisMakanan());
        System.out.println("Ada Berapa Cula : " + jawa.getJumlahCula());
    }
}
