package modul2.bangun3d;

import modul2.LKbangun3D;
import java.util.Scanner;

public class balok extends LKbangun3D {
    private double panjang, lebar, tinggi;



    
    
    @Override
    public void infoBangun(double panjang, double lebar, double tinggi) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        setPanjang(input.nextDouble());
        System.out.print("Masukkan lebar balok: ");
        setLebar(input.nextDouble());
        System.out.print("Masukkan tinggi balok: ");
        setTinggi(input.nextDouble());
    
        
        System.out.println("Yang memiliki attribute panjang lebar dan tinggi");
        super.infoBangun(getPanjang(), getLebar(), getTinggi());
        
    }

    @Override
    public void hitungVolume() {
        double volume = getPanjang() * getLebar() * getTinggi();
        setVolume(volume);

        System.out.println();
        super.hitungVolume();
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double getPanjang() {
        return panjang;
    }

    private double getLebar() {
        return lebar;
    }

    private double getTinggi() {
        return tinggi;
    }

    public void inputBalok() {
    }
}

