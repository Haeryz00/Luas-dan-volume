package modul2.bangun2d;

import modul2.LKbangun2D;
import java.util.Scanner;

public class persegipanjang extends LKbangun2D {
  private double panjang;
  private double lebar;

  @Override
  public void infoBangun(double ax, double ba) {
    Scanner input = new Scanner(System.in);
    System.out.println("-----------------------------------------------------");
    System.out.println("Bangun Persegi Panjang");
    System.out.print("Masukkan panjang: ");
    double a = input.nextDouble();
    System.out.print("Masukkan lebar: ");
    double b = input.nextDouble();
    setPanjang(a);
    setLebar(b);
    super.infoBangun(a, b);
  }


  @Override
  public void hitungKeliling() {
    keliling = 2 * getPanjang() + 2 * getLebar();
    setKeliling(keliling);
    super.hitungKeliling();
  }

  @Override
  public void hitungLuas() {
    luas = getPanjang() * getLebar();
    setLuas(luas);
    super.hitungLuas();
  }
  
  public double getPanjang() {
    return this.panjang;
  }

  public void setPanjang(double panjang) {
    this.panjang = panjang;
  }

  public double getLebar() {
    return this.lebar;
  }

  public void setLebar(double lebar) {
    this.lebar = lebar;
  }

}
