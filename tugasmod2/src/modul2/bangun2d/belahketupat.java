package modul2.bangun2d;

import modul2.LKbangun2D;
import java.util.Scanner;

public class belahketupat extends LKbangun2D {
    private double sisi;
    private double d1;
    private double d2;

    @Override
    public void infoBangun(double a, double b, double c) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi belah ketupat: ");
        setSisi(input.nextDouble());
        System.out.print("Masukkan panjang diagonal 1 belah ketupat: ");
        setD1(input.nextDouble());
        System.out.print("Masukkan panjang diagonal 2 belah ketupat: ");
        setD2(input.nextDouble());
        
        super.infoBangun(getSisi(), getD1(), getD2());
    }

    @Override
    public void hitungKeliling() {
        keliling = 4 * getSisi();
        setKeliling(keliling);
        super.hitungKeliling();
    }

    @Override
    public void hitungLuas() {
        luas = getD1() * getD2() / 2;
        setLuas(luas);
        super.hitungLuas();
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getD1() {
        return this.d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return this.d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
}
