package modul2.bangun2d;

import modul2.LKbangun2D;

public class segitiga extends LKbangun2D {
  private double alas;
  private double tinggi;
  
  public void infoBangun(double a, double b) {
    System.out.println("-----------------------------------------------------");
    System.out.println("Hasil Bangun Segitiga");
    System.out.println("Alas: " +a);
    System.out.println("Tinggi: " +b);
  }

  @Override
  public void hitungKeliling() {
    keliling = getAlas() * 3;
    System.out.print("Keliling Segitiga Tersebut adalah ");
    super.hitungKeliling();
  }

  @Override
  public void hitungLuas() {
    luas = getAlas() * getTinggi() / 2;
    System.out.print("Luas Segitiga Tersebut adalah ");
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
}
