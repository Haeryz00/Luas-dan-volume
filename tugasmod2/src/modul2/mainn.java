package modul2;
import java.util.Scanner;

import modul2.bangun3d.balok;
import modul2.bangun3d.bola;
import modul2.bangun3d.kerucut;
import modul2.bangun3d.kubus;
import modul2.bangun3d.tabung;

public class mainn {
    public static void main(String[] args) {
        

        mainMenu();
    }    

    public static void mainMenu (){
        Scanner input = new Scanner(System.in);
        int pilih;
        boolean hitungulang;


        do{
        System.out.println("=====================================");
        System.out.println("Selamat datang di aplikasi LKV");
        System.out.println("Menghhitung luas keliling volume akan menjadi mudah");
        System.out.println("=====================================");
        System.out.println("1. Menghitung bangun 2D");
        System.out.println("2. Menghitung bangun 3D");
        System.out.println("3. Exit");

        System.out.print("Pilih menu : ");

        pilih = input.nextInt();

        switch (pilih) {
            case 1:
                bangun2D();
                break;
            case 2:
                bangun3d();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Input tidak valid");
                break;
        }

        System.out.println("Ingin menghitung bangun lain ? y/n");
        hitungulang = input.next().equalsIgnoreCase("y");


    } while (hitungulang);


        input.close();
    }


    public static void bangun2D()
    {
        Scanner input = new Scanner(System.in);
        int pilih2D;

        System.out.println("Aplikasi penghitung luas & keliling bangun datar");
        System.out.println("1. belahketupat");
        System.out.println("2. jajargenjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Persegi");
        System.out.println("5. Persegi panjang");
        System.out.println("6. Segitiga");
        System.out.println("7. kembali");

        pilih2D = input.nextInt();

        switch (pilih2D) {
            case 1:
                System.out.println("Anda memilih belahketupat");

                break;
            case 2:
                System.out.println("Anda memilih Jajargenjang");

                break;
            case 3:
                System.out.println("Anda memilih lingkaran");
                
                break;
            case 4:
                System.out.println("Anda memilih persegi");

                break;
            case 5:
                System.out.println("Anda memilih persegi panjang");

                break;                       
            case 6:
                System.out.println("Anda memilih segitiga");

                break;       
            case 7:
                System.out.println("Anda memilih kembali");
                mainMenu();
            default:
                System.out.println("Input tidak valid");
                break;
        }
        input.close();
    }

    public static void bangun3d() {
        Scanner input = new Scanner(System.in);
        int pilih3D;
        
        
            kubus kubus = new kubus();
            balok balok = new balok();
            bola bola = new bola();
            kerucut kerucut = new kerucut();
            tabung tabung = new tabung();
    
            System.out.println("Aplikasi penghitung volume bangun3D");
            System.out.println("1. balok");
            System.out.println("2. Bola");
            System.out.println("3. Kerucut");
            System.out.println("4. kubus");
            System.out.println("5. Tabung");
            System.out.println("6. kembali");
    
            pilih3D = input.nextInt();
    
            switch (pilih3D) {
                case 1:
                    balok.infoBangun(pilih3D, pilih3D, pilih3D);
                    balok.hitungVolume();
                    break;
                case 2:
                    bola.infoBangun();
                    bola.hitungVolume();
                    break;
                case 3:
                    kerucut.infoBangun();
                    kerucut.hitungVolume();
                    break;
                case 4:
                    kubus.infoBangun();
                    kubus.hitungVolume();
                    break;
                case 5:
                    tabung.infoBangun();
                    tabung.hitungVolume();
                    break;
                case 6:
                    System.out.println("Kembali");
                    mainMenu();
                default:
                    System.out.println("tidak valid");
                    break;
                
            }
    
           
       
    }
    
    
}


