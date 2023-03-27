package modul2.bangun3d;

import modul2.LKbangun3D;

public class bola extends LKbangun3D {
  private double radius;

  @Override
  public void infoBangun(double a) {
    super.infoBangun(a);
  }

  public void hitungVolume() {
    double volume = 4.0 / 3.0 * Math.PI * Math.pow(getRadius(), 3);
    setVolume(volume);
    super.hitungVolume();
  }

  private double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}