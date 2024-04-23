package Java_dasar;


public class IfElseSttatement {

    public static void main(String[] args) {
        
    
        /*if (condition) {
        // statements
        } else{
        //statement
        }
        
        contoh : Di sini, kondisi adalah ekspresi boolean seperti umur >= 18.

        jika kondisi dievaluasi menjadi benar, pernyataan dieksekusi
        jika kondisi dievaluasi menjadi salah, pernyataan dilewati
        */

        // contoh code

            int number = 10;
            // cek apakah angka > 0?
            if (number > 0){
                System.out.println("Angka positif");
            }else{
                System.out.println("angka negatif");
            }
        // contoh lain
            
            String bahasa = "Python";
            if (bahasa == "Java"){
                System.out.println("Yuhuuu");
            }

        // else if
        /*if (condition1) {
        // codes
        }
        else if(condition2) {
        // codes
        }
        else if (condition3) {
        // codes
        }
        .
        .
        else {
        // codes
        } */
        
        // contoh
            number = 0;
            if (number > 0) {
                System.out.println("The number is positive.");
            }
        
            // checks if number is less than 0
            else if (number < 0) {
                System.out.println("The number is negative.");
            }
            
            // if both condition is false
            else {
                System.out.println("The number is 0.");
            }
        
        // Nested if else Statement
            // contoh menemukan angka terbesar dari 3 angka berikut
            Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

            if (n1 >= n2){
                
                if (n1 >= n3){
                    largest = n1;
                }else{
                    largest = n3;
                }
            } else{

                if(n2 >= n3){
                    largest = n2;
                }else{
                    largest = n3;
                }
            }
            System.out.println("angka terbesar: " + largest);

        // ternary expresion

            boolean benar = false;
            System.out.println((!benar) ? "Benar" : "Salah");

            int time = 20;
            String result = (time < 18) ? "Good day." : "Good evening.";
            System.out.println(result);

            
    }   

}
