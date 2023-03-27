package modul2.bangun3d;

import modul2.LKbangun3D;
import java.util.Scanner;


public class bola extends LKbangun3D {
    private double radius;

    private double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void infoBangun(){
       
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jari - jari : ");
        double radius = input.nextDouble();
        setRadius(radius);
    
       
        System.out.println("yang memiliki attribute radius");
        super.infoBangun(getRadius());
    }

    public void hitungVolume(){
        double volume = 4.0 / 3.0 * Math.PI * Math.pow(getRadius(), 3);
        setVolume(volume);
        super.hitungVolume();
    }


    public void inputBola(){
    }
}
