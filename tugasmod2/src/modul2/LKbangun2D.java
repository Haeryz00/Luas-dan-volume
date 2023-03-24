package modul2;

public class LKbangun2D {
  protected double luas;
  protected double keliling;

  public void infoBangun() {
    System.out.println("-----------------------------------------------------");
    System.out.println("Hasil Bangun Persegi");
    System.out.println("Sisi: ");
  }

  public void hitungKeliling() {
    System.out.println(keliling);
  }

  public void hitungLuas() {
    System.out.println(luas);
  }

  public double getLuas() {
    return this.luas;
  }

  public void setLuas(double luas) {
    this.luas = luas;
  }

  public double getKeliling() {
    return this.keliling;
  }

  public void setKeliling(double keliling) {
    this.keliling = keliling;
  }
}
