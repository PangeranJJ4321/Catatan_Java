package Java_dasar;


public class Operator {
    public static void main(String[] args) {
        
        // Apa itu operator
            /*Sebuah simbol yang melakukan operasi
             pada variabel dan value. contoh : +, *, /, -.
            */
        
        // Klasifikasi Operator
            /*Operasi di java ada 5  */

                // 1. Aritmatika Operator
                    /*opieras unutuk performa aritmatika
                     Contoh : */
                     int a = 12; float b = 5.2F;
                    // penjumlahan operator
                    System.out.println("a + b = " + (a + b));
                    // pengurangan
                    System.out.println("a - b = " + (a - b));
                    // perkalian operator
                    System.out.println("a * b = " + (a * b));
                    // pembagian operator
                    System.out.println("a / b = " + (a / b));
                    // sisal bagi operator
                    System.out.println("a % b = " + (a % b));

                    // contoh lain
                    String nama = "Juhrifar Jafar";
                    System.out.println("Pangeran " + nama);
                    

                // Assigment Operator
                    // int age;
                    // age = 5;

                    /*Operator penugasan digunakan dalam Java 
                    untuk menetapkan nilai kepada variabel. 
                    = adalah assigment operator. itu 5 di 
                    masukan pada variabel age. ada beberapa 
                    operator assigment pada java yaitu*/

                    // contoh variabel
                    int angka = 4;
                    int var;

                    // menggunakan =
                    var = angka;
                    System.out.println("var =: " + var);

                    // menggunakan +=
                    var += angka;
                    System.out.println("var +=: " + var);

                    // menggunakan *=
                    var *= angka;
                    System.out.println("var *=: " + var);
                    
                    // menggunakan %=
                    var %= angka;
                    System.out.println("var %=: " + var);

                
                // 3. Relational Operators
                    /*Operator relasional digunakan untuk 
                    memeriksa hubungan antara dua operan.*/
                    
                    //contoh : check is a less than b , a < b, dan :
                    // create variables

                    System.out.println("\nRelational Operators");
                    //buat variabek
                    a = 7; b = 11;

                    // value of a and b
                    System.out.println("a is " + a + " and b is " + b);

                    // == operator
                    System.out.println(a == b);  // false

                    // != operator
                    System.out.println(a != b);  // true

                    // > operator
                    System.out.println(a > b);  // false

                    // < operator
                    System.out.println(a < b);  // true

                    // >= operator
                    System.out.println(a >= b);  // false

                    // <= operator
                    System.out.println(a <= b);  // true


                // 4. Logical Operators
                    /*Operator logis digunakan untuk memeriksa 
                    apakah suatu ekspresi benar atau salah. 
                        1. && (and) : expression1 && expression2
                            Benar hanya jika kedua expression1 
                            dan expression2 benar.
                        2. || (Logical OR) :expression1 || expression2
                            Benar jika salah satu dari expression1 atau 
                            expression2 adalah benar.
                        3. ! (Logical NOT): !expresion
                            Benar jika expresi salah dan sebaliknya */
                    // contoh
                    System.out.println("Logical Operator");
                    // && operator
                    System.out.println((5 > 3) && (8 > 5));  // true
                    System.out.println((5 > 3) && (8 < 5));  // false

                    // || operator
                    System.out.println((5 < 3) || (8 > 5));  // true
                    // System.out.println((5 > 3) || (8 < 5));  // true
                    System.out.println((5 < 3) || (8 < 5));  // false

                    // ! operator
                    System.out.println(!(5 == 3));  // true
                    System.out.println(!(5 > 3));  // false
                                        
                // Unary Operators
                    /*Operator unary digunakan dengan hanya satu operan. 
                    Sebagai contoh, ++ adalah operator unary yang meningkatkan 
                    nilai dari suatu variabel sebesar 1. Artinya, ++5 akan mengembalikan nilai 6.
                     */

            // Increment and Decrement Operators : ++ dan  --
                /*++ increase num by 1, -- decrease num by 1*/
                int num = 5;
                // increase by 1
                ++num; // kita dapat 6 dari 5 + 1

                System.out.println(num);

                // contoh
                // declare variables
                System.out.println("\nIncreament dan Decreament");
                a = 12; b = 12;
                int result1, result2;

                // original value
                System.out.println("Value of a: " + a);

                // increment operator
                result1 = ++a;
                System.out.println("After increment: " + result1);

                System.out.println("Value of b: " + b);

                // decrement operator
                result2 = (int) --b;
                System.out.println("After decrement: " + result2);
        
            // Bitwise Operator

            
            // Ternary Operator
                /*Operator ternary (operator kondisional) adalah 
                singkatan untuk pernyataan if-then-else. 
                    variable = Expression ? expression1 : expression2*/
                
                //contoh
                int februaryDays = 29;
                String result;

                // ternary operator
                result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
                System.out.println(result);
                




        }
}
