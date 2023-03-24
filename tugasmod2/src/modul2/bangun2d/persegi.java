package modul2.bangun2d;

import modul2.LKbangun2D;

public class persegi extends LKbangun2D {
  private double sisi;

  public void infoBangun(double a) {
    System.out.println("-----------------------------------------------------");
    System.out.println("Hasil Bangun Persegi");
    System.out.println("Sisi: " + a);
  }

  @Override
  public void hitungKeliling() {
    keliling = 4 * getSisi();
    System.out.print("Keliling Persegi Tersebut adalah ");
    super.hitungKeliling();
  }

  @Override
  public void hitungLuas() {
    luas = getSisi() * getSisi();
    System.out.print("Luas dari Persegi tersebut adalah ");
    super.hitungLuas();
  }

  public double getSisi() {
    return this.sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }
}
