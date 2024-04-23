package Java_dasar;





public class Scope {
    /*In Java, variables are only accessible inside the region they are created. 
    This is called scope. 
    
    contoh:
    */

    // Method Scope
    public static void main(String[] args) {

        // Code here CANNOT use x
    
        int x = 100;
    
        // Code here can use x
        System.out.println(x);

        // Block Scope : A block of code refers to all of the code between curly braces {}

            // Code here CANNOT use y

        { // This is a block

            // Code here CANNOT use x
    
            int y = 100;
    
            // Code here CAN use x
            System.out.println(y);
    
        } // The block ends here
    
        // Code here CANNOT use y

      }

}
