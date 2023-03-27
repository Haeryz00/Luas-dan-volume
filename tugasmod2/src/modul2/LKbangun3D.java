package modul2;

import modul2.bangun3d.balok;
import modul2.bangun3d.bola;
import modul2.bangun3d.kerucut;
import modul2.bangun3d.kubus;
import modul2.bangun3d.tabung;

public class LKbangun3D {
    protected double volume;

    protected void setVolume(double volume) {
        this.volume = volume;
    }

    protected double getVolume() {
        return volume;
    }

    protected void infoBangun(double a) {
 
        // System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " Yang memiliki attribute : " + a);
        System.out.println("-----------------------------------------------------");
        if (this instanceof kubus){
            System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " yang memiliki rusuk: " + a);
        }
        else if (this instanceof bola){
            System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " yang memiliki Jari jari: " + a);
        }
        }
    

    protected void infoBangun(double a, double b) {
        System.out.println("-----------------------------------------------------");
        if (this instanceof kerucut){
            System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " yang memiliki jari jari: " + a + " dan tinggi " + b);
        }
        else if (this instanceof tabung){
            System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " yang memiliki jari jari: " + a + " Dan tinggi " + b);
        }
        }
        
    
        protected void infoBangun(double a, double b, double c) {
            System.out.println("-----------------------------------------------------");
            if (this instanceof balok){
                System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " yang memiliki panjang: " + a + " Lebar " + b + " Dan tinggi " + c);
            }
            }
        

    

    protected void hitungVolume() {
        System.out.println("Hasil bangun " + this.getClass().getSimpleName());
        System.out.println("Volume: " + getVolume());
    }
}

// System.out.println("-----------------------------------------------------");
//     if (this instanceof persegi) {
//       System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " yang memiliki sisi: " + a);
//     }
//     else if (this instanceof lingkaran) {
//       System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " yang memiliki jari-jari: " +a);
//     }
//   }