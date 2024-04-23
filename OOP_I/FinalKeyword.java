package OOP_I;

class Penjelasan {
    /*Di Java, kata kunci final digunakan untuk menunjukkan konstanta. 
    Ini dapat digunakan dengan variabel, metode, dan kelas.

    Setelah suatu entitas (variabel, metode, atau kelas) dideklarasikan final, 
    itu hanya dapat diberi nilai sekali. Artinya,

        - variabel final tidak dapat diinisialisasi ulang dengan nilai lain
        - metode final tidak dapat dioverride
        - kelas final tidak dapat diperpanjang */


    
}
    // conoth final method
    class Parent {
        // Final method
        final void display() {
            System.out.println("This is a final method.");
        }
    }
    
    class Child extends Parent {
        // Attempting to override final method will result in a compilation error
        // void display() { // Error: Cannot override the final method from Parent
            // System.out.println("This method cannot be overridden.");
        // }
    }
    
class FinalKeyword {
    public static void main(String[] args) {
        // 1. final Variable
        final int AGE = 32;
        
        // mencoba ubah nilai final variabel
        // AGE = 48; will be error
        System.out.println("Age : " + AGE);
        // Note: It is recommended to use uppercase to declare final variables in Java.

        // 2 final Method
        // metode final tidak dapat dioverride oleh kelas anak. 

        // 3. final class
        // In Java, the final class cannot be inherited by another class.


}
}

// conoth 3:

// create a final class
final class FinalClass {
    public void display() {
      System.out.println("This is a final method.");
    }
  }
  
  // try to extend the final class
//   class Main extends FinalClass {// error
//     public  void display() {
//       System.out.println("The final method is overridden.");
//     }
  
//     public static void main(String[] args) {
//       Main obj = new Main();
//       obj.display();
//     }
//   }


