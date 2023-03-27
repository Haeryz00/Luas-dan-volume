package modul2.bangun3d;

import modul2.LKbangun3D;

public class balok extends LKbangun3D {
  private double panjang;
  private double lebar;
  private double tinggi;

 @Override
  public void infoBangun(double a, double b, double c) {
    super.infoBangun(a, b, c);
  }

  @Override
  public void hitungVolume() {
    double volume = getPanjang() * getLebar() * getTinggi();
    setVolume(volume);
    super.hitungVolume();
  }

  private double getPanjang() {
    return this.panjang;
  }

  public void setPanjang(double panjang) {
    this.panjang = panjang;
  }

  private double getLebar() {
    return this.lebar;
  }

  public void setLebar(double lebar) {
    this.lebar = lebar;
  }

  private double getTinggi() {
    return this.tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }

}
