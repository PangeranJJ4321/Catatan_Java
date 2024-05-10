package Tugas;
import java.util.Scanner;
import Tugas.Proses;
import Tugas.Karyawan;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        pertama:
        do {
            try {
                tampilkanMenu();
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline
                switch (pilihan) {
                    case 1:
                        // tambahDataKaryawan(scanner);
                        break;
                    case 2:
                        // tampilkanDetailKaryawan();
                        break;
                    case 3:
                        System.out.println("Keluar dari program.");
                        break pertama;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (Exception e){
                System.out.println("Inputan tidak valid");
            }

            
        } while (true);
    }

    public static void tampilkanMenu(){
        System.out.println("Sislahkan pilih menu yang tersedia : ");
        System.out.println("1. Tambah data karyawan");
        System.out.println("2. tampilkan detail karyawn");
        System.out.println("3. Keluuar");
        System.out.print("> ");
        
    }

    public static void tambahDataKaryawan(Scanner scanner) {
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
            Projek projek = new Projek(0); // Jumlah projek belum diketahui

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
} 