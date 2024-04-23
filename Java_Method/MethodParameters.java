package Java_Method;

public class MethodParameters {
    /*A method parameter is a value accepted by the method. 
    As mentioned earlier, a method can also have any number 
    of parameters. For example,

        // method with two parameters
            int addNumbers(int a, int b) {
                // code
            }

        // method with no parameter
            int addNumbers(){
                // code
            } 

        // cara panggilnya :
        
        // calling the method with two parameters
        addNumbers(25, 15);

        // calling the method with no parameters
        addNumbers()

        Contoh :
        */

        
        public void display1() {
            System.out.println("Method tanpa parameter");
        } 

        public void display2(int a){
            System.out.println("\nMethod dengan parameter : " + a);
        }


        public static void main(String[] args) {
            
            MethodParameters obj = new MethodParameters();

            obj.display1();

            obj.display2(5);

        }
}
