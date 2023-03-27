package modul2.bangun3d;

import modul2.LKbangun3D;

import java.util.Scanner;

public class kerucut extends LKbangun3D{
    private double jari_jari;
    private double tinggi;


    private double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    private double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void infoBangun(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jari jari : ");
        setJari_jari(input.nextDouble());
        System.out.println("Masukan tinggi : ");
        setTinggi(input.nextDouble());
        
        System.out.println("yang memiliki attribute jari jari dan tinggi");
        super.infoBangun(getJari_jari(), getTinggi());
    }

public void hitungVolume(){
    double volume = 1.0/3.0 * Math.PI * Math.pow(getJari_jari(), 2) * getTinggi();
    setVolume(volume);
    super.hitungVolume();
}
}
