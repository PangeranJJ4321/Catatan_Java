package OOP_II;

// ini adalah abstarac class
/*The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes). 
We use the abstract keyword to declare an abstract class.  */
abstract class AbstractClass {
    // dengan classs abstract kita tidak bisa buat object 
    // begitu jika kita membuat abstrac method di class selain abstract class
    // disini kita bisa buat method seperti biasa dan abstrac method

    abstract void method1(); // abstract method

    void method2(){
        System.out.println("This is regular method");
    }

    // untuk mengimplementasikan abstarc method kita 
    // implementasikan di luar class atau di dalam method main.
    // conoth pada file ExampleAbstract...java, 1,2,3
    public static void main(String[] args) {
        // AbstractClass obj = new AbstractClass(); will be error
    }
    
} 
