package OOP_II;

public class JavaInheritance {
    /*inheriteance adalah salah satu fitur kunci dari Pemrograman Berorientasi Objek 
    yang memungkinkan kita untuk membuat kelas baru dari kelas yang sudah ada.

    Kelas baru yang dibuat dikenal sebagai subclass (anak atau turunan) dan 
    kelas yang sudah ada dari mana kelas anak itu dihasilkan dikenal sebagai 
    superclass (induk atau dasar). 
    
    To inherit from a class, use the extends keyword.
    
    In the example below, the Car class (subclass) inherits the attributes and 
    methods from the Vehicle class (superclass):*/
}

// Supper Class
class Vehicle {
    protected String brand = "Ford"; // Vehicle atribut

    public void honk(){
        System.out.println("Tuut, tuuut!");

    }
}

//  SubClass
class Car extends Vehicle{

    private String modelName = "Mustang"; // Car atribut

    public static void main(String[] args) {
        
        // buat objeck 
        Car myCar = new Car();

        // kita bisa panggil honk() method
        myCar.honk();

        // display
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

// ingat final class tidak bisa di extanse yah!!

/*In Java, inheritance is an is-a relationship. That is, we use 
inheritance only if there exists an is-a relationship between two classes. 
For example,

    Car is a Vehicle
    Orange is a Fruit
    Surgeon is a Doctor
    Dog is an Animal */