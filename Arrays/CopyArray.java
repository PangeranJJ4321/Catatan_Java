package Arrays;

import java.util.Arrays;

public class CopyArray {
    /*In Java, we can copy one array into another. 
    There are several techniques you can use to copy arrays in Java.
    
    */

    // 1. Copying Arrays Using Assignment Operator

    public static void main(String[] args){

        int[] numbers = {1,2,3,4,5,6};

        int[] positiveNumbers = numbers; // copyling assigment(=)


        
        /*Teknik ini adalah yang paling mudah dan juga berhasil. Namun, ada masalah 
        dengan teknik ini. Jika kita mengubah elemen dari satu larik, elemen-elemen 
        yang sesuai dari larik-larik lainnya juga berubah. Sebagai contoh, */
        
        // ubah nilai indeks 1
        
        numbers[0] = -1;
        System.out.println("Shallow Copy");
        System.out.println("Array asli : " + Arrays.toString(numbers));
        System.out.println("Array copy : " + Arrays.toString(positiveNumbers));
        
        // kia bisa lia kedanya berbah ini yang diseb shallow copy(salinan dangkal)
        // maka kita buttuh yang lebih dari shallow copy


        // 2. Using Looping Construct to Copy Arrays

        System.out.println("Copy dengan Looping");

        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[source.length];

        for (int i = 0; i < source.length ; ++i){
            destination[i] = source[i];
        }

        destination[0]= -1;
        System.out.println("Array source      : " + Arrays.toString(source));
        System.out.println("Array destination : " + Arrays.toString(destination));

        /*Ketika kita membuat salinan dalam kedalaman (deep copy), 
        setiap larik memiliki objeknya sendiri secara terpisah. Jadi, jika kita mengubah 
        elemen di salah satu larik, larik lainnya tidak terpengaruh karena keduanya memiliki 
        kumpulan elemen yang terpisah satu sama lain.*/


        // 3. Copying Arrays Using arraycopy() method

        /*Di dalam Java, kelas System berisi sebuah metode yang bernama arraycopy() 
        untuk menyalin larik-larik. Metode ini merupakan pendekatan yang lebih baik 
        untuk menyalin larik-larik dibandingkan dua metode di atas.

        Metode arraycopy() memungkinkan Anda untuk menyalin bagian tertentu dari larik 
        sumber ke larik tujuan. Sebagai contoh,

            System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length)

                sourceArray       : Ini adalah larik sumber dari mana kita akan menyalin elemen.
                0                 : Ini adalah indeks awal dalam larik sumber dari mana penyalinan akan dimulai.
                destinationArray  : Ini adalah larik tujuan di mana elemen akan disalin.
                0                 : Ini adalah indeks awal dalam larik tujuan di mana elemen akan disalin.
                sourceArray.length(destinationArray.length)
                                  : Ini adalah panjang atau jumlah elemen yang akan disalin dari 
                                    larik sumber ke larik tujuan.*/
        

        // begini caranya 

        int[] arrayAsli = {1,2,3,4,5,6};
        int[] arrayCopy = new int[5];

        System.arraycopy(arrayAsli, 0, arrayCopy, 0, arrayCopy.length);

        System.out.println("Array Copy menggunakan System.arraycopy : " + Arrays.toString(arrayCopy));

            // ini lebih baik

    
    // 4. Copying Arrays Using copyOfRange() method
    /*We can also use the copyOfRange() 
    method defined in Java Arrays class to copy arrays. For example,
        Arrays.copyOfRange(sumberArray, dari, ke?)*/

        System.out.println("Menggunakan Arrays.copyOfRange : ");
        int[] values = {2, 3, 12, 4, 12, -2};
        int[] destination1 = Arrays.copyOfRange(values, 0, values.length);      
        System.out.println("destination1 = " + Arrays.toString(destination1)); 
      
        
        int[] destination2 = Arrays.copyOfRange(values, 2, 5); 
        System.out.println("destination2 = " + Arrays.toString(destination2));   
   



    }   
}
