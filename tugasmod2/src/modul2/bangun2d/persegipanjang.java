package modul2.bangun2d;

import modul2.LKbangun2D;

public class persegipanjang extends LKbangun2D {
  private double panjang;
  private double lebar;

  @Override
  public void infoBangun(double a, double b) {
    super.infoBangun(getPanjang(), getLebar());
    /* System.out.println("-----------------------------------------------------");
    System.out.println("Hasil Bangun Persegi Panjang");
    System.out.println("Panjang: " +a);
    System.out.println("Lebar: " +b); */
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
