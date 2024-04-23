package Try_Try;
import java.util.Scanner;
public class Window {

    public static void main(String[] args) {

        String jenisBentuk;
        String nama;
        Scanner sc = new Scanner(System.in);

        pertama:
        do {
            start();
            jenisBentuk = sc.nextLine(); 


            if (jenisBentuk.equals("1") || jenisBentuk.equals("2") || jenisBentuk.equals("3")) {
                kedua:
                while (true){
                    if (jenisBentuk.equals("1")){
                        System.out.println("\nWah, anda memilih nomor 1. Silahkan pilih Bangun Ruang yang tersedia:\n1. Kubus\n2. Balok\n3. Bola\n4. Tabung\n5. Kembali");
                        System.out.print(">> ");
                        nama = sc.nextLine();
                        ketiga:
                        while (nama.equals("1")) {
                            
                                System.out.println("Silahkan masukkan panjang sisi kubus: ");
                                System.out.print("Sisi : ");
                                double sisi = sc.nextDouble();
        
                                Kubus kubus = new Kubus(sisi);
        
                                System.out.println("\tLuas kubus: " + kubus.luas());

                                
                                
                                System.out.println("\tVolume kubus: " + kubus.volume());

                                System.out.println("Kembali ke menu sebelumnya? (Y/N)");
                                String end = sc.nextLine();
                                System.out.print(">>> ");
                                end = sc.nextLine();

                                    if (end.equals("Y") || end.equals("y")){
                                        continue kedua;
                                    } else if (end.equals("N") || end.equals("n")){
                                        continue ketiga;
                                    }
                        }
    
                    } if (jenisBentuk.equals("2")){
                        System.out.println("Wah, anda memilih nomor 2. Silahkan pilih Bangun Datar yang tersedia:\n1. Persegi\n2. Persegi Panjang\n3. Jajar Genjang\n4. Segitiga\n5. Kembali");
                        System.out.print(">> ");
                        nama = sc.nextLine();
    
                        if (nama.equals("1")){
                            System.out.println("Silahkan masukkan panjang sisi persegi: ");
                            System.out.print("Sisi : ");
                            double sisi = sc.nextDouble();
    
                            Persegi persegi = new Persegi(5);
                            System.out.println("Luas persegi: " + persegi.luas());
                            System.out.println("Keliling persegi: " + persegi.keliling());
                            break pertama;
                        }
    
    
                    } else if (jenisBentuk.equals("3")){
                        break pertama;
                    }
                }

            } else if (jenisBentuk != "1" && jenisBentuk != "2" && jenisBentuk != "3") {
                System.out.println("Maaf, anda salah memilih. Silahkan pilih yang tersedia.");
        }
    } while (true); 
        
        sc.close();
    }
    public static void start() {
        System.out.println("\nHallo, Jar");
        System.out.println("Selemat datang di kode saya.\nSilahkan pilih mana yang anda cari tahu:)\n1. Bangun Ruang\n2. Bangun Datar\n3. Exit");
        System.out.print(">> ");
    }  
    
        

    
}
