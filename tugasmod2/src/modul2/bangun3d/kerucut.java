package modul2.bangun3d;

import modul2.LKbangun3D;

public class kerucut extends LKbangun3D {
  private double jari_jari;
  private double tinggi;

  @Override
  public void infoBangun(double a, double b) {
    super.infoBangun(a,b);
  }

  public void hitungVolume() {
    double volume = 1.0 / 3.0 * Math.PI * Math.pow(getJari_jari(), 2) * getTinggi();
    setVolume(volume);
    super.hitungVolume();
  }

  private double getJari_jari() {
    return jari_jari;
  }

  public void setJari_jari(double jari_jari) {
    this.jari_jari = jari_jari;
  }

  private double getTinggi() {
    return tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }
}