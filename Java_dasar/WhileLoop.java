package Java_dasar;
import java.util.Scanner;;

public class WhileLoop {
    /*Loop while dalam Java digunakan untuk menjalankan kode 
    tertentu sampai kondisi tertentu terpenuhi. Sintaks dari loop while adalah: 
        while (testExpression) {
            body of loop
        }

        contoh :
    */
    public static void main(String[] args) {
        
        int i = 1, n = 5;

        while (i <= n) {
            System.out.print(i + " ");
            i++;
            
        }

        // do while loop
            /*Loop do...while mirip dengan loop while. 
            Namun, tubuh dari loop do...while dieksekusi 
            sekali sebelum ekspresi pengujian diperiksa. 
            Sebagai contoh, 
            
                do {
                    body of loop
                } while(textExpression);
                
                */
            // contoh :
                System.out.println("\ndengan do while loop");
                int k = 1;
                do {
                System.out.print(k + " ");
                k++;
                }
                while (k <= 5);

        // contoh lain : hanya angka positif dijumlahkan

            int sum = 0;

            Scanner input = new Scanner(System.in);
            int number = 0; 
            do {
                sum += number;
                System.out.print("Masukan angka : ");
                number = input.nextInt();
            } while (number > 0);

            input.close();
            System.out.println("Total : " + sum);


    }
}
