package modul2.bangun3d;

import modul2.LKbangun3D;
import java.util.Scanner;;


public class kubus extends LKbangun3D{
    private double rusuk;

    public void setRusuk(double rusuk)
    {
        this.rusuk = rusuk;
    }

    private double getRusuk()
    {
        return rusuk;
    }

    public void hitungVolume(){
        double volume = Math.pow(getRusuk(), 3);
        setVolume(volume);
        super.hitungVolume();
    }


    public void infoBangun()
    {   
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai rusuk : ");
        double rusuk = input.nextDouble();
        setRusuk(rusuk);
        input.close();

        super.infoBangun(getRusuk());
        
    }


    public void inputRusuk(){
    }

}
