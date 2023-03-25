package modul2.bangun2d;

import modul2.LKbangun2D;

public class segitiga extends LKbangun2D {
  private double alas;
  private double tinggi;
  
  @Override
  public void infoBangun(double a, double b) {
    super.infoBangun(getAlas(), getTinggi());
    /* System.out.println("-----------------------------------------------------");
    System.out.println("Hasil Bangun Segitiga");
    System.out.println("Alas: " +a);
    System.out.println("Tinggi: " +b); */
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
