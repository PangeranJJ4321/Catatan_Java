package OOP_II;

public class ExampleAbstract1 {
    // implementasi abstrac method
    /*jika class abstract memiliki asbtract method apa pun,
      maka semua kelas anak yang diwarisi dari superclass abstrak 
      harus memberikan implementasi dari metode abstrak tersebut. Sebagai contoh,
     */


}

abstract class Peliharaan {
    abstract void makeSound();

    public void eat() {
        
        System.out.println("I can eat.");
    }
}

class Cat extends Peliharaan {
    // implementasi abstract method
    public void makeSound(){
        super.eat();
        System.out.println("miao miao");
    }
}

class Main {
    public static void main(String[] args) {
        
        Cat anggora = new Cat();
        anggora.makeSound();
    }
}
