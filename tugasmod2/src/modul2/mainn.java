package modul2;

import java.util.Scanner;

import modul2.bangun3d.balok;
import modul2.bangun3d.bola;
import modul2.bangun3d.kerucut;
import modul2.bangun3d.kubus;
import modul2.bangun3d.tabung;
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

    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Kembali ke mnu? (y/n): ");
            String input = scanner.nextLine();
            if (input.equals("y")) {
                mainMenu();
                break;
            } else if (input.equals("n")) {
                System.exit(0);
                break;
            } else {
                System.out.println("Input tidak valid. Tolong pilih 'Y' atau 'N'.");
            }
        }
        scanner.close();
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
                double sisi_bk = input.nextDouble();
                bk.setSisi(sisi_bk);
                System.out.print("Masukkan d1: ");
                double d1_bk = input.nextDouble();
                bk.setD1(d1_bk);
                System.out.print("Masukkan d2: ");
                double d2_bk = input.nextDouble();
                bk.setD2(d2_bk);
                bk.infoBangun(sisi_bk, d1_bk, d2_bk);
                bk.hitungKeliling();
                bk.hitungLuas();
                choice();
                break;
            case 2:
                jajargenjang jg = new jajargenjang();
                System.out.println("Anda memilih Jajargenjang");
                System.out.print("Masukkan Alas: ");
                double alas_jg = input.nextDouble();
                jg.setAlas(alas_jg);
                System.out.print("Masukkan Tinggi: ");
                double tinggi_jg = input.nextDouble();
                jg.setTinggi(tinggi_jg);
                System.out.print("Masukkan Miring: ");
                double miring_jg = input.nextDouble();
                jg.setMiring(miring_jg);
                jg.infoBangun(alas_jg, tinggi_jg, miring_jg);
                jg.hitungKeliling();
                jg.hitungLuas();
                choice();
                break;
            case 3:
                lingkaran lk = new lingkaran();
                System.out.println("Anda memilih lingkaran");
                System.out.print("Masukkan Jari-jari: ");
                double jarijari_lk = input.nextDouble();
                lk.setJarijari(jarijari_lk);
                lk.infoBangun(jarijari_lk);
                lk.hitungKeliling();
                lk.hitungLuas();
                choice();
                break;
            case 4:
                persegi psg = new persegi();
                System.out.println("Anda memilih Persegi");
                System.out.print("Masukkan sisi: ");
                double sisi_psg = input.nextDouble();
                psg.setSisi(sisi_psg);
                psg.infoBangun(sisi_psg);
                psg.hitungKeliling();
                psg.hitungLuas();
                choice();
                break;
            case 5:
                persegipanjang pp = new persegipanjang();
                System.out.println("Anda memilih Persegi Panjang");
                System.out.print("Masukkan Panjang: ");
                double panjang_pp = input.nextDouble();
                pp.setPanjang(panjang_pp);
                System.out.print("Masukkan Lebar: ");
                double lebar_pp = input.nextDouble();
                pp.setLebar(lebar_pp);
                pp.infoBangun(panjang_pp, lebar_pp);
                pp.hitungKeliling();
                pp.hitungLuas();
                choice();
                break;
            case 6:
                segitiga sg = new segitiga();
                System.out.println("Anda memilih Segitiga");
                System.out.print("Masukkan Alas: ");
                double alas_sg = input.nextDouble();
                sg.setAlas(alas_sg);
                System.out.print("Masukkan Tinggi: ");
                double tinggi_sg = input.nextDouble();
                sg.setTinggi(tinggi_sg);
                sg.infoBangun(alas_sg, tinggi_sg);
                sg.hitungKeliling();
                sg.hitungLuas();
                choice();
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
        System.out.println("1. Balok");
        System.out.println("2. Bola");
        System.out.println("3. Kerucut");
        System.out.println("4. Kubus");
        System.out.println("5. Tabung");
        System.out.println("6. Kembali");

        pilih3D = input.nextInt();

        switch (pilih3D) {
            case 1:
                balok blk = new balok();
                System.out.println("Anda memilih Balok");
                System.out.print("Masukkan panjang balok: ");
                double panjang_blk = input.nextDouble();
                blk.setPanjang(panjang_blk);
                System.out.print("Masukkan lebar balok: ");
                double lebar_blk = input.nextDouble();
                blk.setLebar(lebar_blk);
                System.out.print("Masukkan tinggi balok: ");
                double tinggi_blk = input.nextDouble();
                blk.setTinggi(tinggi_blk);
                blk.infoBangun(panjang_blk, lebar_blk, tinggi_blk);
                blk.hitungVolume();
                choice();
                break;
            case 2:
                bola bl = new bola();
                System.out.println("Anda memilih bola");
                System.out.print("Masukan jari - jari : ");
                double radius_bl = input.nextDouble();
                bl.setRadius(radius_bl);
                bl.infoBangun(radius_bl);
                bl.hitungVolume();
                choice();
                break;
            case 3:
                kerucut krc = new kerucut();
                System.out.println("Anda memilih kerucut");
                System.out.print("Masukan jari jari : ");
                double jarijari_krc = input.nextDouble();
                System.out.print("Masukan tinggi : ");
                double tinggi_krc = input.nextDouble();
                krc.setJari_jari(jarijari_krc);
                krc.setTinggi(tinggi_krc);
                krc.infoBangun(jarijari_krc, tinggi_krc);
                krc.hitungVolume();
                choice();
                break;
            case 4:
                kubus kbs = new kubus();
                System.out.println("Anda memilih Kubus");
                System.out.print("Masukan nilai rusuk : ");
                double rusuk_kbs = input.nextDouble();
                kbs.setRusuk(rusuk_kbs);
                kbs.infoBangun(rusuk_kbs);
                kbs.hitungVolume();
                choice();
                break;
            case 5:
                tabung tbg = new tabung();
                System.out.println("Anda memilih Tabung");
                System.out.print("Masukan jari jari");
                double jarijari_tbg = input.nextDouble();
                tbg.setJari_jari(jarijari_tbg);
                System.out.print("Masukan tinggi : ");
                double tinggi_tbg = input.nextDouble();
                tbg.setTinggi(tinggi_tbg);
                tbg.infoBangun(jarijari_tbg, tinggi_tbg);
                tbg.hitungVolume();
                choice();
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
