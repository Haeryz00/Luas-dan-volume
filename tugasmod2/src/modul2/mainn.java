package modul2;

import java.util.Scanner;

import modul2.bangun2d.belahketupat;
import modul2.bangun2d.jajargenjang;
import modul2.bangun2d.lingkaran;
import modul2.bangun2d.persegipanjang;
import modul2.bangun2d.segitiga;
import modul2.bangun2d.persegi;

public class mainn {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        int pilih;
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
        input.close();
    }

    public static void bangun2D() {
        Scanner input = new Scanner(System.in);
        int pilih2D;

        System.out.println("Aplikasi penghitung luas & keliling bangun datar");
        System.out.println("1. Belah ketupat");
        System.out.println("2. jajargenjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Persegi");
        System.out.println("5. Persegi panjang");
        System.out.println("6. Segitiga");
        System.out.println("7. kembali");

        pilih2D = input.nextInt();

        switch (pilih2D) {
            case 1:
                belahketupat bk = new belahketupat();
                System.out.println("Anda memilih Belah Ketupat");
                System.out.print("Masukkan Sisi: ");
                bk.setSisi(input.nextDouble());
                System.out.print("Masukkan d1: ");
                bk.setD1(input.nextDouble());
                System.out.print("Masukkan d2: ");
                bk.setD2(input.nextDouble());
                bk.infoBangun(bk.getSisi(), bk.getD1(), bk.getD2());
                bk.hitungKeliling();
                bk.hitungLuas();
                break;
            case 2:
                jajargenjang jg = new jajargenjang();
                System.out.println("Anda memilih Jajargenjang");
                System.out.print("Masukkan Alas: ");
                jg.setAlas(input.nextDouble());
                System.out.print("Masukkan Tinggi: ");
                jg.setTinggi(input.nextDouble());
                System.out.print("Masukkan Miring: ");
                jg.setMiring(input.nextDouble());
                jg.infoBangun(jg.getAlas(), jg.getTinggi(), jg.getMiring());
                jg.hitungKeliling();
                jg.hitungLuas();
                break;
            case 3:
                lingkaran lk = new lingkaran();
                System.out.println("Anda memilih lingkaran");
                System.out.print("Masukkan Jari-jari: ");
                lk.setJarijari(input.nextDouble());
                lk.infoBangun(lk.getJarijari());
                lk.hitungKeliling();
                lk.hitungLuas();
                break;
            case 4:
                persegi persegi = new persegi();
                System.out.println("Anda memilih Persegi");
                System.out.print("Masukkan sisi: ");
                persegi.setSisi(input.nextDouble());
                persegi.infoBangun(persegi.getSisi());
                persegi.hitungKeliling();
                persegi.hitungLuas();
                break;
            case 5:
                persegipanjang pp = new persegipanjang();
                System.out.println("Anda memilih Persegi Panjang");
                System.out.print("Masukkan Panjang: ");
                pp.setPanjang(input.nextDouble());
                System.out.print("Masukkan Lebar: ");
                pp.setLebar(input.nextDouble());
                pp.infoBangun(pp.getPanjang(), pp.getLebar());
                pp.hitungKeliling();
                pp.hitungLuas();
                break;
            case 6:
                segitiga sg = new segitiga();
                System.out.println("Anda memilih Segitiga");
                System.out.print("Masukkan Alas: ");
                sg.setAlas(input.nextDouble());
                System.out.print("Masukkan Tinggi: ");
                sg.setTinggi(input.nextDouble());
                sg.infoBangun(sg.getAlas(), sg.getTinggi());
                sg.hitungKeliling();
                sg.hitungLuas();
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
                System.out.println("Anda memilih Balok");
                break;
            case 2:
                System.out.println("Anda memilih bola");
                break;
            case 3:
                System.out.println("Anda memilih kerucut");
                break;
            case 4:
                System.out.println("Anda memilih Kubus");
                break;
            case 5:
                System.out.println("Anda memilih Tabung");
                break;
            case 6:
                System.out.println("Kembali");
                mainMenu();
                break;
            default:
                break;
        }
        input.close();
    }
}
