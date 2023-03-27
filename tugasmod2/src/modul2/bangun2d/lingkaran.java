package modul2.bangun2d;

import modul2.LKbangun2D;

public class lingkaran extends LKbangun2D {
  private double jarijari;

  @Override
  public void infoBangun(double a) {
    super.infoBangun(a);
  }

  @Override
  public void hitungKeliling() {
    keliling = getJarijari() * Math.PI * 2;
    setKeliling(keliling);
    super.hitungKeliling();
  }

  @Override
  public void hitungLuas() {
    luas = Math.PI * jarijari * jarijari;
    setLuas(luas);
    super.hitungLuas();
  }

  private double getJarijari() {
    return this.jarijari;
  }

  public void setJarijari(double jarijari) {
    this.jarijari = jarijari;
  }
}