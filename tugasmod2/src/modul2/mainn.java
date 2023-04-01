package modul2;
import java.util.Scanner;

import modul2.bangun2d.belahketupat;
import modul2.bangun2d.jajargenjang;
import modul2.bangun2d.lingkaran;
import modul2.bangun2d.persegi;
import modul2.bangun2d.persegipanjang;
import modul2.bangun2d.segitiga;
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
        System.exit(0);

        input.close();
    }


    public static void bangun2D()
    {
        Scanner input = new Scanner(System.in);
        int pilih2D;

        belahketupat belahketupat = new belahketupat();
        jajargenjang jajargenjang = new jajargenjang();
        lingkaran lingkaran = new lingkaran();
        persegi persegi = new persegi();
        persegipanjang persegipanjang = new persegipanjang();
        segitiga segitiga = new segitiga();


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
                belahketupat.infoBangun(pilih2D, pilih2D, pilih2D);
                belahketupat.hitungKeliling();
                belahketupat.hitungLuas();
                break;
            case 2:
                jajargenjang.infoBangun(pilih2D, pilih2D, pilih2D);
                jajargenjang.hitungKeliling();
                jajargenjang.hitungLuas();
                break;
            case 3:
                lingkaran.infoBangun(pilih2D);
                lingkaran.hitungKeliling();
                lingkaran.hitungLuas();
                break;
            case 4:
                persegi.infoBangun(pilih2D);
                persegi.hitungKeliling();
                persegi.hitungLuas();
                break;
            case 5:
                persegipanjang.infoBangun(pilih2D, pilih2D);
                persegipanjang.hitungKeliling();
                persegipanjang.hitungLuas();
                break;                       
            case 6:
                segitiga.infoBangun(pilih2D, pilih2D);
                segitiga.hitungKeliling();
                segitiga.hitungLuas();
                break;       
            case 7:
                System.out.println("Anda memilih kembali");
                mainMenu();
            default:
                System.out.println("Input tidak valid");
                break;
        }
        
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


