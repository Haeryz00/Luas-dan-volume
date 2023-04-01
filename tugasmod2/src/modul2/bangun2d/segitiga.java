package modul2.bangun2d;

import java.util.Scanner;
import modul2.LKbangun2D;

public class segitiga extends LKbangun2D {
  private double alas;
  private double tinggi;

  @Override
  public void infoBangun(double at, double ba) {
    Scanner input = new Scanner(System.in);
    System.out.println("Menghitung Luas dan Keliling Segitiga");
    System.out.print("Masukkan alas segitiga: ");
    double a = input.nextDouble();
    setAlas(a);
    System.out.print("Masukkan tinggi segitiga: ");
    double t = input.nextDouble();
    setTinggi(t);

    super.infoBangun(getAlas(), getTinggi());
  }

  @Override
  public void hitungKeliling() {
    keliling = getAlas() * 3;
    setKeliling(keliling);
    super.hitungKeliling();
  }

  @Override
  public void hitungLuas() {
    luas = getAlas() * getTinggi() / 2;
    setLuas(luas);
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
