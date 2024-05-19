package TP7.Nomor1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Karyawan> dataKaryawan = new ArrayList<>();

    public static void menuAwal() {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("===== PROGRAM DATA KARYAWAN =====");
            System.out.println("1. Tambah Data Karyawan");
            System.out.println("2. Tampilkan Detail Karyawan");
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
        System.out.println("\n===== TAMBAH DATA KARYAWAN =====");
        System.out.print("Masukkan nama  : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan umur  : ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Karyawan karyawan = new Karyawan(nama, umur);

        System.out.print("Masukkan pendidikan terakhir (SD/SMP/SMA/S1/S2/S3): ");
        String pendidikanTerakhir = scanner.nextLine();
        karyawan.setPendidikan(new Pendidikan(pendidikanTerakhir));

        System.out.println("Masukkan pengalaman sebelumnya:");
        System.out.println("1. Freelancer");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja tetap");
        System.out.println("4. Tidak ada");
        System.out.print("Input: ");
        int pengalamanInput = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        String pengalamanSebelumnya;
        switch (pengalamanInput) {
            case 1:
                pengalamanSebelumnya = "Freelancer";
                break;
            case 2:
                pengalamanSebelumnya = "Magang";
                break;
            case 3:
                pengalamanSebelumnya = "Pekerja tetap";
                break;
            case 4:
                pengalamanSebelumnya = "Tidak ada";
                break;
            default:
                pengalamanSebelumnya = "Tidak diketahui";
                break;
        }
        karyawan.setPengalaman(new Pengalaman(pengalamanSebelumnya));

        System.out.println("Masukkan jumlah projek:");
        System.out.println("1. 1 - 4 ");
        System.out.println("2. 5 - 8 ");
        System.out.println("3. 9 - 12 ");
        System.out.println("4. > 15 ");
        System.out.print("Input: ");
        int projekInput = scanner.nextInt();
        int jumlahProjek;
        switch (projekInput) {
            case 1:
                jumlahProjek = 4;
                break;
            case 2:
                jumlahProjek = 8;
                break;
            case 3:
                jumlahProjek = 12;
                break;
            case 4:
                jumlahProjek = 16;
                break;
            default:
                jumlahProjek = 0;
                break;
        }
        karyawan.setProjek(new Projek(jumlahProjek));

        dataKaryawan.add(karyawan);
        System.out.println("\nData karyawan berhasil ditambahkan.");
    }

    public static void tampilkanDataKaryawan() {
        System.out.println("\n===== DATA KARYAWAN =====");
        for (Karyawan karyawan : dataKaryawan) {
            System.out.println("\nNama: " + karyawan.getNama());
            System.out.println("Umur: " + karyawan.getUmur());
            System.out.println("Pendidikan terakhir: " + karyawan.getPendidikan().getPendidikanTerakhir());
            System.out.println("Pengalaman sebelumnya: " + karyawan.getPengalaman().getPengalamanSebelumnya());
            System.out.println("Jumlah projek: " + karyawan.getProjek().getJumlahProjek());
            System.out.println("Proses kehidupan: ");
            karyawan.prosesKehidupan();
            System.out.println("Memenuhi kriteria: ");
            boolean isAccepted = karyawan.memenuhiKriteria();
            System.out.println(isAccepted ? "Ya" : "Tidak");

            if (isAccepted) {
                SoundPlayer.playSound("accepted.wav");
            } else {
                SoundPlayer.playSound("not_accepted.wav");
            }               
        }
    }

    public static void main(String[] args) {
        menuAwal();
    }
}
