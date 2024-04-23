package OOP_I;

/*We can use the instanceof operator to check if objects of the subclass 
is also an instance of the superclass. 
For example, */

// supper calss
class Animal{

}

//subclass
class Dog extends Animal{

}

public class InstanceofInheretens {
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        // checks if d1 is an instance of the subclass
        System.out.println(d1 instanceof Dog);        // prints true
    
        // checks if d1 is an instance of the superclass
        System.out.println(d1 instanceof Animal);     // prints true
     
        /*Here, we are using the instanceof operator to check whether d1 
        is also an instance of the superclass Animal.*/

        
    }
    
}
