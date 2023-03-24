package modul2.bangun2d;

import modul2.LKbangun2D;

public class lingkaran extends LKbangun2D {
  private double jarijari;

  public void infoBangun(double a) {
    System.out.println("-----------------------------------------------------");
    System.out.println("Hasil Bangun Segitiga");
    System.out.println("Jari-jari: " +a);
  }

  @Override
  public void hitungKeliling() {
    keliling = getJarijari() * Math.PI * 2;
    System.out.print("Keliling Lingkaran Tersebut adalah ");
    super.hitungKeliling();
  }

  @Override
  public void hitungLuas() {
    luas = Math.PI * jarijari * jarijari;
    System.out.print("Luas Lingkaran Tersebut adalah ");
    super.hitungLuas();
  }

  public double getJarijari() {
    return this.jarijari;
  }

  public void setJarijari(double jarijari) {
    this.jarijari = jarijari;
  }
}
