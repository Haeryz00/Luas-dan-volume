package modul2.bangun3d;

import modul2.LKbangun3D;

public class kubus extends LKbangun3D {
  private double rusuk;

  @Override
  public void infoBangun(double a) {
    super.infoBangun(a);
  }

  public void hitungVolume() {
    double volume = Math.pow(getRusuk(), 3);
    setVolume(volume);
    super.hitungVolume();
  }

  public void setRusuk(double rusuk) {
    this.rusuk = rusuk;
  }

  private double getRusuk() {
    return rusuk;
  }
}