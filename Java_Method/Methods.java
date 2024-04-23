package Java_Method;

public class Methods {
    
    // A method is a block of code that performs a specific task.

   /* Declaring a Java Method
    The syntax to declare a method is:
        returnType methodName() {
            // method body
        }

        contoh:

        int add Numbers(){
            // codes
        }

        Dalam contoh di atas, nama metodenya adalah addNumbers(). 
        Dan, tipe pengembaliannya adalah int. Ini adalah sintaks 
        sederhana untuk mendeklarasikan sebuah metode. Namun, 
        sintaks lengkap untuk mendeklarasikan sebuah metode adalah :

            modifier static returnType nameOfMethod (parameter1, parameter2, ...) {
                // method body
            }

        Panggil methoh, addNumbers();

        contoh dibawah :*/ 

        static int addNumbers(int a, int b){
            int sum = a + b;
            return sum;
        }
        
        private static double addTwo(double a, double b){
            return a + b;
        }
        // panggil
        public static void main(String[] args) {
            int num1 = 25;
            int num2 = 25;

            // buat object

            // Methods obj = new Methods();

            // method diatas adalah static jadi saya tidak butuh object
            
            int result = addNumbers(num1, num2);

            System.out.println("Sum : " + result);

            System.out.println("add two : " + addTwo(23, result));
        }
}
