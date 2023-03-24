package modul2.bangun2d;

import modul2.LKbangun2D;

public class jajargenjang extends LKbangun2D {
  private double alas;
  private double tinggi;
  private double miring;

  public void infoBangun(double a, double b , double c) {
    System.out.println("-----------------------------------------------------");
    System.out.println("Hasil Bangun Persegi");
    System.out.println("Alas: " + a);
    System.out.println("Tinggi: " + b);
    System.out.println("Miring: " + c);
  }

  @Override
  public void hitungKeliling() {
    keliling = 2 * (getAlas() + getTinggi());
    System.out.print("Keliling Jajargenjang Tersebut adalah ");
    super.hitungKeliling();
  }

  @Override
  public void hitungLuas() {
    luas = getAlas() * getTinggi();
    System.out.print("Luas Jajargenjang Tersebut adalah ");
    super.hitungLuas();
  }

  public double getAlas() {
    return this.alas;
  }

  public void setAlas(double alas) {
    this.alas = alas;
  }

  public double getTinggi() {
    return this.tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }

  public double getMiring() {
    return this.miring;
  }

  public void setMiring(double miring) {
    this.miring = miring;
  }

}
