package modul2.bangun2d;

import modul2.LKbangun2D;

public class jajargenjang extends LKbangun2D {
  private double alas;
  private double tinggi;
  private double miring;

  @Override
  public void infoBangun(double a, double b, double c) {
    super.infoBangun(a, b, c);

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

  private double getAlas() {
    return this.alas;
  }

  public void setAlas(double alas) {
    this.alas = alas;
  }

  private double getTinggi() {
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