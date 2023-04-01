package modul2.bangun2d;

import modul2.LKbangun2D;
import java.util.Scanner;
public class jajargenjang extends LKbangun2D {
  private double alas;
  private double tinggi;
  private double miring;

  @Override
  public void infoBangun(double a, double b, double c) {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan panjang alas jajargenjang: ");
      setAlas(input.nextDouble());
      System.out.print("Masukkan tinggi jajargenjang: ");
      setTinggi(input.nextDouble());
      System.out.print("Masukkan panjang sisi miring jajargenjang: ");
      setMiring(input.nextDouble());
      
      super.infoBangun(getAlas(), getTinggi(), getMiring());
  }
  

  @Override
  public void hitungKeliling() {
    keliling = 2 * (getAlas() + getTinggi());
    setKeliling(keliling);
    super.hitungKeliling();
  }

  @Override
  public void hitungLuas() {
    luas = getAlas() * getTinggi();
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

  public double getMiring() {
    return this.miring;
  }

  public void setMiring(double miring) {
    this.miring = miring;
  }

}