package modul2;

import modul2.bangun2d.persegi;
import modul2.bangun2d.persegipanjang;
import modul2.bangun2d.segitiga;
import modul2.bangun2d.belahketupat;
import modul2.bangun2d.jajargenjang;
import modul2.bangun2d.lingkaran;

public class LKbangun2D {
  protected double luas;
  protected double keliling;

  protected void infoBangun(double a) {
  System.out.println("-----------------------------------------------------");
    if (this instanceof persegi) {
      System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " yang memiliki sisi: " + a);
    }
    else if (this instanceof lingkaran) {
      System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " yang memiliki jari-jari: " +a);
    }
  }

  protected void infoBangun(double a, double b) {
    System.out.println("-----------------------------------------------------");
    if (this instanceof persegipanjang) {
      System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " Yang memiliki Panjang: " + a + " dan lebar: " + b);
    }
    else if (this instanceof segitiga) {
      System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " Yang memiliki alas: " + a + " dan tinggi: " + b);
    }
  }

  protected void infoBangun(double a, double b, double c) {
    System.out.println("-----------------------------------------------------");
    if (this instanceof belahketupat) {
      System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " Yang memiliki sisi: " + a + " --- d1: " + b + " --- d2: " + c);
    }
    else if (this instanceof jajargenjang) {
      System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " Yang memiliki alas: " + a + " --- tinggi: " + b + " --- miring: " + c);
    }
  }

  protected void hitungKeliling() {
    System.out.println("Keliling dari bangun " + this.getClass().getSimpleName() + " tersebut adalah " + getKeliling());
  }

  protected void hitungLuas() {
    System.out.println("Luas dari bangun " + this.getClass().getSimpleName() + " tersebut adalah " + getLuas());
  }

  protected double getLuas() {
    return this.luas;
  }

  protected void setLuas(double luas) {
    this.luas = luas;
  }

  protected double getKeliling() {
    return this.keliling;
  }

  protected void setKeliling(double keliling) {
    this.keliling = keliling;
  }
}
