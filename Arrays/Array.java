package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    /*An array is a collection of similar types of data. */

    public static void main(String[] args) {
        String[] array = new String[10]; // array untuk 10 item
       
        
        // deklarasi array
            // dataType[] arrayName;
            double[] data;

            // But, how many elements can array this hold?

            /*To define the number of elements that an array can hold, 
            we have to allocate memory for the array in Java. 
            For example, */

            data = new double[10];
            

            /*Here, the array can store 10 elements. 
            We can also say that the size or length of the array is 10. */

            // menginisialisasi array saat deklarasi

            int[] array1 = {1,2,3,4,5};

            // saat menggunakan indeks

            int[] array2;
            array2 = new int[]{1, 2, 3, 4, 5};


            // Inisialisasi dengan menentukan ukuran array terlebih dahulu:
            int[] array3 = new int[5];
            array3[0] = 1;
            array3[1] = 2;
            array3[2] = 3;
            array3[3] = 4;
            array3[4] = 5;

            //Inisialisasi dengan nilai default untuk tipe data primitif:
            int[] array4 = new int[5]; // Secara default, semua elemen akan diinisialisasi dengan nilai 0

            // Inisialisasi menggunakan loop:
            
            int[] array5 = new int[5];
            for (int i = 0; i < 5; i++) {
                array5[i] = i + 1;
            }

            // Inisialisasi menggunakan metode Arrays.fill():
            int[] array6 = new int[5];
            Arrays.fill(array6, 1); // Mengisi semua elemen array dengan nilai 1

            System.out.println("Isi array : " + Arrays.toString(array));
            System.out.println("Isi array : " + Arrays.toString(data));
            System.out.println("Isi array : " + Arrays.toString(array1));
            System.out.println("Isi array : " + Arrays.toString(array2));
            System.out.println("Isi array : " + Arrays.toString(array3));
            System.out.println("Isi array : " + Arrays.toString(array4));
            System.out.println("Isi array : " + Arrays.toString(array5));
            System.out.println("Isi array : " + Arrays.toString(array6));
            
            // akses elemennt di array : array[index]
            
            // Ubah elemen array
                array3[3] = 100;
                System.out.println("Isi array : " + Arrays.toString(array3));

        

        // Final Example
        
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        int sum = 0;
        Double average;
        int i = 0;
        do{
            System.out.print("Masukan angka : ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
            ++i; 
        } while(i < numbers.length);

        System.out.println("Isi array numbers: " + Arrays.toString(numbers));
        
        int arrayLenght = numbers.length;

        average = (double) (sum / arrayLenght);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        input.close();
    }

    
}

