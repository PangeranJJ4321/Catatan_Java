package TP7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    tambahDataKaryawan(scanner);
                    break;
                case 2:
                    tampilkanDetailKaryawan();
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);
    }

    private static void tampilkanMenu() {
        System.out.println("\n**Menu Utama**");
        System.out.println("1. Tambah Data Karyawan");
        System.out.println("2. Tampilkan Detail Karyawan");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }

    private static void tambahDataKaryawan(Scanner scanner) {
        System.out.println("\n**Tambah Data Karyawan**");

        try {
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Umur: ");
            int umur = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            System.out.print("Jabatan: ");
            String jabatan = scanner.nextLine();

            System.out.print("Gaji: ");
            double gaji = scanner.nextDouble();
            scanner.nextLine(); // Konsumsi newline

            System.out.print("Jenis Pekerjaan: ");
            String jenisPekerjaan = scanner.nextLine();

            System.out.print("Jumlah Sertifikasi: ");
            int jumlahSertifikasi = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            String[] sertifikasi = new String[jumlahSertifikasi];
            for (int i = 0; i < jumlahSertifikasi; i++) {
                System.out.print("Sertifikasi " + (i + 1) + ": ");
                sertifikasi[i] = scanner.nextLine();
            }

            System.out.print("Jumlah Organisasi: ");
            int jumlahOrganisasi = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            String[] organisasi = new String[jumlahOrganisasi];
            for (int i = 0; i < jumlahOrganisasi; i++) {
                System.out.print("Organisasi " + (i + 1) + ": ");
                organisasi[i] = scanner.nextLine();
            }

            System.out.print("Riwayat Pendidikan (pisahkan dengan koma): ");
            String riwayatPendidikanString = scanner.nextLine();
            String[] riwayatPendidikan = riwayatPendidikanString.split(",");

            Kehidupan kehidupan;
            if (jenisPekerjaan.equalsIgnoreCase("Pengalaman")) {
                kehidupan = new Pengalaman(jenisPekerjaan, sertifikasi, organisasi);
            } else {
                kehidupan = new Kehidupan() {
                    @Override
                    public void prosesKehidupan() {
                        System.out.println("Menjalani pekerjaan sebagai " + jenisPekerjaan);
                    }
                };
            }

            Pendidikan pendidikan = new Pendidikan(riwayatPendidikan);
            Project projek = new Project(0); // Jumlah projek belum diketahui

            Karyawan karyawan = new Karyawan(nama, umur, jabatan, gaji);
            karyawan.setKehidupan(kehidupan);
            karyawan.setPendidikan(pendidikan);
            karyawan.setProjek(projek);

            if (karyawanDiterima(karyawan)) {
                System.out.println("\nKaryawan dengan nama " + karyawan.getNama() + " diterima.");
            } else {
                System.out.println("\nKaryawan dengan nama " + karyawan.getNama() + " tidak diterima.");
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat memasukkan data. Silakan periksa kembali input Anda.");
            e.printStackTrace();
        }
    }

    private static void tampilkanDetailKaryawan() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("\nBelum ada data karyawan.");
            return;
        }

        System.out.println("\n**Daftar Karyawan**");
        for (int i = 0; i < daftarKaryawan.size(); i++) {
            Karyawan karyawan = daftarKaryawan.get(i);
            System.out.println("\nKaryawan ke-" + (i + 1));
            System.out.println("Nama: " + karyawan.getNama());
            System.out.println("Umur: " + karyawan.getUmur());
            System.out.println("Jabatan: " + karyawan.getJabatan());
            System.out.println("Gaji: " + karyawan.getGaji());
            karyawan.getKehidupan().prosesKehidupan();
            karyawan.getPendidikan().tampilkanRiwayatPendidikan();
            karyawan.getProjek().tampilkanJumlahProjek();
        }
    }

    
}