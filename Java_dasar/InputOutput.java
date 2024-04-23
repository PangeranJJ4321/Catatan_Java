package Java_dasar;

import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        // Output
            /*System.out.println(); or
            System.out.print(); or
            System.out.printf();*/

            System.out.println("Aku suka diriku yang penuh semangat.");

            // perbedaan print() dan println()
            System.out.println("1. println ");
            System.out.println("2. println ");
            
            System.out.print("1. print ");
            System.out.print("2. print");

            // Contoh : Printing Variables and Literals

            Double number = -10.6;
            System.out.println(5);
            System.out.println(number);

            // contoh : Sttring + dengan yang lain

            System.out.println("I am " + "awesome");
            System.out.println("Number " + number);

        // Input

            /*Java menyediakan berbagai cara untuk 
            mendapatkan masukan dari pengguna. Namun, 
            dalam tutorial ini, Anda akan belajar untuk 
            mendapatkan masukan dari pengguna menggunakan 
            objek dari kelas Scanner.

            Untuk menggunakan objek Scanner, kita perlu 
            mengimpor paket java.util.Scanner. */

            // buat objek dari Scanner
            Scanner input = new Scanner(System.in);
            // contoh ambil input dari user dan get int input dari user
            System.out.print("Masukan sebuah angka : ");
            int value = input.nextInt();
            System.out.println("Nilai masukan : " + value);

            // tutup scanner object
            input.close();

        // Contoh lainya

            Scanner enter = new Scanner(System.in);
    	
        // Getting float input
            System.out.print("Enter float: ");
            float myFloat = enter.nextFloat();
            System.out.println("Float entered = " + myFloat);
            
            // Getting double input
            System.out.print("Enter double: ");
            double myDouble = enter.nextDouble();
            System.out.println("Double entered = " + myDouble);
            
            // Getting String input
            System.out.print("Enter text: ");
            String myString = enter.next();
            System.out.println("Text entered = " + myString);

            enter.close();

              
    }
}
