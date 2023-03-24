package modul2.bangun2d;

import modul2.LKbangun2D;

public class belahketupat extends LKbangun2D {
  private double sisi;
  private double d1;
  private double d2;

  public void infoBangun(double a, double b, double c) {
    System.out.println("-----------------------------------------------------");
    System.out.println("Hasil Bangun Belah Ketupat");
    System.out.println("Sisi: " + a);
    System.out.println("d1: " + b);
    System.out.println("d2: " + c);

  }

  @Override
  public void hitungKeliling() {
    keliling = 4 * getSisi();
    System.out.print("Keliling Belah Ketupat Tersebut Adalah ");
    super.hitungKeliling();
  }

  @Override
  public void hitungLuas() {
    luas = getD1() * getD2() / 2;
    System.out.print("Luas Belah Ketupat Tersebut Adalah ");
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