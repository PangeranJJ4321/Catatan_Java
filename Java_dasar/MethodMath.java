package Java_dasar;


public class MethodMath {
    public static void main(String[] args) {
        /*The Java Math class has many methods that allows you 
        to perform mathematical tasks on numbers.

        cara pakenya: Math.method(parameter)
        contoh: Math.max(5,10)
        */

        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(6,2));
        System.out.println(Math.abs(-1234));

        // random
        // System.out.println(Math.random());

        int randomNumber = (int) Math.random() * 10;// 0 sampai 101
        System.out.println(randomNumber);



    }
}
