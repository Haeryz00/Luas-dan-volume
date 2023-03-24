package modul2;



public class LKbangun3D {
    private double volume;

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void infoBangun(double a) {
 
         System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " Yang memiliki attribute : " + a);
    }

    public void infoBangun(double a, double b) {
 
         System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " Yang memiliki attribute : " + a  + " " + b);
    }
        public void infoBangun(double a, double b, double c) {
    
            System.out.println("Ini adalah sebuah bangun " + this.getClass().getSimpleName() + " Yang memiliki attribute : " + a + " "+ b + " " + c);
        }

    

    public void hitungVolume() {
        System.out.println("Hasil bangun " + this.getClass().getSimpleName());
        System.out.println("Volume: " + getVolume());
    }
}
