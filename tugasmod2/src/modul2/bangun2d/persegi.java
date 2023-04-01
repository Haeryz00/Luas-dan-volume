package modul2.bangun2d;

import java.util.Scanner;
import modul2.LKbangun2D;

public class persegi extends LKbangun2D {
  private double sisi;

  public void infoBangun(double a) {
    super.infoBangun(getSisi());
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan panjang sisi: ");
    double sisi = input.nextDouble();
    setSisi(sisi);
  }

  @Override
  public void hitungKeliling() {
    keliling = 4 * getSisi();
    setKeliling(keliling);
    super.hitungKeliling();
  }

  @Override
  public void hitungLuas() {
    luas = getSisi() * getSisi();
    setLuas(luas);
    super.hitungLuas();
  }

  public double getSisi() {
    return this.sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }
}
