package Java_Method;

public class ContohMethod_1 {
    
    // buat method
    public static int kuadrat(int num){

        // return type int , statement
        return num * num;
    }

    //panggil method

    public static void main(String[] args) {
        int result;
        int num = 6;
        result = kuadrat(num);

        System.out.printf("Kuadrat dari %d : %d", num, result);
    }

    // If the method does not return any value, we use the void keyword as 
    //the return type of the method. For example,

        /*public void square(int a) {
                int square = a * a;
                System.out.println("Square is: " + square);
        } */
}
