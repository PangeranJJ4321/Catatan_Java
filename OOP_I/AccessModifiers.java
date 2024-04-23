package OOP_I; // ini default access modifer

public class AccessModifiers {
   /*In Java, access modifiers are used to set the accessibility 
   (visibility) of classes, interfaces, variables, methods, 
   constructors, data members, and the setter methods. 
   For example, 
   
    class Animal {
        public void method1() {...} // public

        private void method2() {...}// private
    }
    
    
    method1 is public - This means it can be accessed by other classes.
    method2 is private - This means it can not be accessed by other classes.*/

    /*type modifer
        Default	: declarations are visible only within the package (package private)
        Private	: declarations are visible within the class only
        Protected:	declarations are visible within the package or all subclasses
        Public	: declarations are visible everywhere
    */

    // conoth private
    private String nama;

    // getter method
    public String getNama(){
        return this.nama;
    }

    // setter method
    private void setNama(String nama){
        this.nama = nama;
    }
    final int value = 90;

    /*Protected Access modifier
        When methods and data members are declared protected, 
        we can access them within the same package as well as 
        from subclasses. file : AccessModifiers.java
        
        Catatan: kita tidak dapat mendeklarasikan kelas atau antarmuka sebagai protected di Java.
     
     Access modifiers are mainly used for encapsulation.   */

    public static void main(String[] args) {
        AccessModifiers d = new AccessModifiers();
        d.nama = "Pangeran";  //I can accses because i acces in this class
        System.out.println("Nama : " + d.getNama());

        AccessModifiers nama1 = new AccessModifiers();// for setter
        nama1.setNama("Hano");
        System.out.println("Hallo " + nama1.getNama());



    }

    // but If a create new class and i want access the atbut we will get errror\
    // excap that is public


}
