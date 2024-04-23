package OOP_I;

public class ModifierProtected_1 {
    protected void display(){
        System.out.println("I will be pro");

    }

    // protected is work in same package dari subclasses


}

class pro extends ModifierProtected_1{
    public static void main(String[] args) {
        
        ModifierProtected_1 men = new ModifierProtected_1();
        men.display();
    }
}
