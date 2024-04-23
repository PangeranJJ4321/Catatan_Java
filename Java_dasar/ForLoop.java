package Java_dasar;


















public class ForLoop {

    /*Dalam pemrograman komputer, perulangan digunakan untuk mengulangi sebuah blok kode. 
    Sebagai contoh, jika Anda ingin menampilkan sebuah pesan 100 kali, daripada mengetikkan 
    kode yang sama sebanyak 100 kali, Anda dapat menggunakan sebuah perulangan. 
    
    di java java ada 3 tipe loop:
        1. for loop
        2. while loop
        3. do .. while loop
    */

    // For Loop
        /*for (awal; testExpression; selanjutnya) {
            // body of the loop
        } */

        
    public static void main(String[] args) {

        // contoh 1
        int n = 5;

        for (int i = 0 ; i <= n ; i++ ){
            System.out.println("Nilai i : " + i);
        }

        // contoh 2

        int sum = 0;
        n = 1000;

        for (int i = 1; i <= n; ++i){
            sum += i;
        }

        System.out.println("sum = " + sum);



    // Infinite for Loop
        
        // sum = 0;

        // for (int i = 1; i <= n; --i){
        //     System.out.println("Hello");
        // }
        
    // for-each Loop
        
        /*Perulangan for dalam Java memiliki sintaks alternatif 
        yang memudahkan untuk mengulangi melalui array dan koleksi. Sebagai contoh,*/

            // for(dataType item : array) {
            //     ...
            // }
        // print array elements
            
        int[] numbers = {3, 7, 5, -5};
        int total = 0;
        for (int number: numbers) {
           System.out.print(number + ", ");
           total += number;

        }
        System.out.println("Total : " + total);

        // contoh tanpa for each 
        total = 0;

        for (int i = 0; i < numbers.length; ++i){
            System.out.print(numbers[i] + ", ");

            total += numbers[i];
        }
        System.out.println("Total : " + total);


        
    }
            
}
