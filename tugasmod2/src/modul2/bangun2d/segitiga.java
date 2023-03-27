package modul2.bangun2d;

import modul2.LKbangun2D;

public class segitiga extends LKbangun2D {
  private double alas;
  private double tinggi;
  
  @Override
  public void infoBangun(double a, double b) {
    super.infoBangun(a, b);
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
}
