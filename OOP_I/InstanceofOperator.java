package OOP_I;

public class InstanceofOperator {

    /*Operator instanceof dalam Java digunakan untuk memeriksa apakah 
    suatu objek merupakan instance dari kelas tertentu atau tidak.
    
        Its syntax is

        objectName instanceOf className;

        Here, if objectName is an instance of className, the operator returns true. 
        Otherwise, it returns false.*/

    // Contoh
    public static void main(String[] args) {
        String name = "Programiz";
    
        // check if name is instase of String?
        boolean result1 = name instanceof String;
        System.out.println("name is an instance of String: " + result1);
        
        // buat objek 
        InstanceofOperator obj = new InstanceofOperator();

        // check if obj is an instance of Main
        boolean result2 = obj instanceof InstanceofOperator;
        System.out.println("obj is an instance of Main: " + result2);

    }



    
}
