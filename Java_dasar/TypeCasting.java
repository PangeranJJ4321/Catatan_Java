package Java_dasar;




public class TypeCasting {
    public static void main(String[] args) {
        /*Type casting is when you assign a value of one primitive data type to another type.

        In Java, there are two types of casting:

        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte*/

        // Widening Casting
            // casting type terkecil ke terbesar
            //contoh 
            int myInt = 5;
            double myDouble = myInt; 

            System.out.println("my integer : " + myInt);
            System.out.println("my double : " + myDouble);
        
        // Narrowing Casting
            // casting type terbesar ke terkecil
            // contoh : meletakkan tipe dalam tanda kurung di depan nilai

            myInt = (int) myDouble;
            System.out.println("my integer : " + myInt);
            System.out.println("my double : " + myDouble);

            

    }

}
