package OOP_II;

public class JavaSuper {
    /*The super keyword in Java is used in subclasses to access superclass 
    members (attributes, constructors and methods). 
    
    1. Access Overridden Methods of the superclass, suadah
    2. super to Call Superclass Method, sudah
    3. Access Attributes of the Superclass
    
    */

    public static void main(String[] args) {
        Apple apple = new Apple("red", 10);
        apple.displayInfo(); // Memanggil metode dari subclass
        apple.setColor("green");
        apple.displayColor(); // Memanggil metode untuk mengakses atribut superclass

    }
} 
  
// conoth 
class Fruit {
    protected String color;

    // Constructor
    public Fruit(String color) {
        this.color = color;
    }

    // Method
    public void displayInfo() {
        System.out.println("I am a fruit with color " + color);
    }
}

class Apple extends Fruit {
    public int size;
    public String color;
    // Constructor
    public Apple(String color, int size) {
        super(color); // Memanggil konstruktor superclass dengan parameter
        this.size = size;
    }


    public void setColor(String color){
        this.color = "green";
    }

    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil metode superclass yang di-override
        System.out.println("I am an apple with size " + size);
    }

    // Method untuk mengakses atribut superclass
    public void displayColor() {
        System.out.println("The color of the fruit is " + super.color); // Mengakses atribut superclass
        System.out.println("The color of the fruit is " + color); // Mengakses atribut superclass
    }
    
}
