package Java_dasar;


public class Variable {

    public static void main(String[] args) {
      // buat variabel
        int speedLimit = 80;
        System.out.print("Sebelum : ");
        System.out.println(speedLimit);

        // atau kita juga bisa buat dengan seperti ini
        int angka;
        angka = 34; 
        System.out.println(angka);

        // ubah nilai dari variabel

        // hanya tulis nama variabel = nilai baru
        System.out.print("Sesudah : ");
        speedLimit = 90;
        System.out.println(speedLimit);

        // contoh lainnya
            // float nilai = 76.6f;
            // double rataRata = 123.4567d;
            // boolean isTrue = false;
            // char karakter = 'h';
            String nama = "Pangeran";

        // Literal : data yang secara langsung mewakili nilai

            // contoh:
            // int a = 1;
            // float  b = 2.5F;
            // char c = 'F';

            // disini 1,2.5f, dan 'F' adalah  literal

            // Boolean Literals : biasanya di inisialisasi boolean

            // boolean flag1 = true;
            // boolean flag2 = false;

            // false dan true adalah 2 literals bool

            // Integer Literals : pada  java terdapat 4 integrs literals

                // binary(base 2)
                int binaryNumber = 0b10010; // 0b mewakili binary
                // octal(base 10)
                int octalNumber = 027; // octal biasanya di awali 0
                // decimal (base 8)
                int decNumber = 34;
                // hexadesimal(base 16)
                int hexNumber = 0x2f; // 0x mewakili hexadesimal
                
                System.out.println(binaryNumber);
                System.out.println(octalNumber);
                System.out.println(decNumber);
                System.out.println(hexNumber);
                // Catatan :
                    // Integers literals menggunakan inisial variabel
                    // dari integer seperti byte,short, int, long, dan long.

            // Floating-point Literals : sebuah literal titik yang memiliki eksponensila
                // ini hanya untuk float dan double
                // contoh : 3.445*10^2
                double myDouble = 3.445e2;
                System.out.println("my double scincenfic " + myDouble);
            
            // Charakter Literal : yang biasa menggunakan single qoutes

                // char letter = 'a';

            
            // String Literals : yang bisa menggunakan double qoutes

                nama = "Pangeran Juhrifar Jafar";
                System.out.println(nama);
        
        // Final Variabel
            /*sebuah variabel sebagai final atau konstan,
            yang artinya tidak dapat diubah dan hanya dapat di baca*/

            // misal : 
            final int myNum = 15;
            // myNum = 20; ini jika dirun aka erorr karena var myNum final
        System.out.println(myNum);
            


    }
    
    
}
