package modul2.bangun3d;




import java.util.Scanner;

import modul2.LKbangun3D;

public class tabung extends LKbangun3D{
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

    public void infoBangun (){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jari jari");
        double jari_jari = input.nextDouble();
        setJari_jari(jari_jari);
    
        System.out.println("Masukan tinggi : ");
        double tinggi = input.nextDouble();
        setTinggi(tinggi);
    
        
        System.out.println("Yang memiliki jari jari dan tinggi");
        super.infoBangun(getJari_jari(), getTinggi());
    }

    public void hitungVolume(){
        double volume = Math.PI * Math.pow(getJari_jari(), 2) * getTinggi();
        setVolume(volume);
        super.hitungVolume();
    }

    public void inputTabung(){
    }
}
