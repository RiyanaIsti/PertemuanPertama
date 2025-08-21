/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohDua;

/**
 *
 * @author RIYANA
 */
public class Ular extends Reptil {

    private double PanjangTubuh;
    private String Berbisa;

    /**
     * @return the PanjangTubuh
     */
    protected double getPanjangTubuh() {
        return PanjangTubuh;
    }

    /**
     * @param PanjangTubuh the PanjangTubuh to set
     */
    protected void setPanjangTubuh(double PanjangTubuh) {
        this.PanjangTubuh = PanjangTubuh;
    }

    /**
     * @return the Berbisa
     */
    protected String getBerbisa() {
        return Berbisa;
    }

    /**
     * @param Berbisa the Berbisa to set
     */
    protected void setBerbisa(String Berbisa) {
        this.Berbisa = Berbisa;
    }

    public static void main(String[] args) {
        Ular kobra = new Ular();
        kobra.setJumlahMata(2);
        kobra.setJumlahKaki(0);
        kobra.setCaraBergerak("Melata");
        kobra.setJenisSisik("Sisik dorsal halus dan miring");
        kobra.setCaraBerkembangbiak("Bertelur (Ovipar)");
        kobra.setPanjangTubuh(2.5);
        kobra.setBerbisa("Ya");

        System.out.println("Jumlah Mata Ular : " + kobra.getJumlahMata());
        System.out.println("Jumlah Kaki Ular : " + kobra.getJumlahKaki());
        System.out.println("Cara Bergerak Ular : " + kobra.getCaraBergerak());
        System.out.println("Jenis Sisik Ular : " + kobra.getJenisSisik());
        System.out.println("Cara Berkembangbiaknya Ular : " + kobra.getCaraBerkembangbiak());
        System.out.println("Panjang Tubuh Ular : " + kobra.getPanjangTubuh() + " m");
        System.out.println("Apakah Ular Berbisa : " + kobra.getBerbisa());
    }
}
