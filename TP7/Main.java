package TP7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Karyawan> dataKaryawan;

    public Main() {
        dataKaryawan = new ArrayList<>();
    }

    public static void menuAwal() {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. Tambah Data Karyawan");
            System.out.println("2. Tampilkan Data Karyawan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    tambahDataKaryawan(scanner);
                    break;
                case 2:
                    tampilkanDataKaryawan();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (input != 3);

        scanner.close();
    }

    public static void tambahDataKaryawan(Scanner scanner) {
        scanner.nextLine(); // Consume newline character
        String input;

        System.out.println("\n===== TAMBAH DATA KARYAWAN =====");
        System.out.print("Masukkan nama karyawan: ");
        input = scanner.nextLine();
        Karyawan karyawan = new Karyawan(input);

        System.out.print("Masukkan pendidikan terakhir karyawan: ");
        input = scanner.nextLine();
        Pendidikan pendidikan = new Pendidikan(input);
        karyawan.setPendidikan(pendidikan);

        System.out.print("Masukkan pengalaman sebelumnya karyawan: ");
        input = scanner.nextLine();
        Pengalaman pengalaman = new Pengalaman(input);
        karyawan.setPengalaman(pengalaman);

        System.out.print("Masukkan jumlah projek karyawan: ");
        int jumlahProjek = scanner.nextInt();
        Projek projek = new Projek(jumlahProjek);
        karyawan.setProjek(projek);

        dataKaryawan.add(karyawan);

        System.out.println("\nData karyawan berhasil ditambahkan.");
    }

    public static void tampilkanDataKaryawan() {
        System.out.println("\n===== DATA KARYAWAN =====");
        for (Karyawan karyawan : dataKaryawan) {
            System.out.println("\nNama: " + karyawan.getNama());
            System.out.println("Pendidikan terakhir: " + karyawan.getPendidikan().getPendidikanTerakhir());
            System.out.println("Pengalaman sebelumnya: " + karyawan.getPengalaman().getPengalamanSebelumnya());
            System.out.println("Jumlah projek: " + karyawan.getProjek().getJumlahProjek());
            System.out.println("Proses kehidupan: ");
            karyawan.prosesKehidupan();
            System.out.println("Memenuhi kriteria: ");
            karyawan.memenuhiKriteria();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.menuAwal();
    }
}
