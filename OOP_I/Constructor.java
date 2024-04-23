package OOP_I;

public class Constructor {
    /*A constructor in Java is similar to a method that is 
    invoked when an object of the class is created.

    Unlike Java methods, a constructor has the same name as 
    that of the class and does not have any return type. 
    For example, 
        class Test {
            Test() {
                // constructor body
            }
        }*/

    // contoh

    String name;

    // 1. No-Arg Constructor
    private Constructor() {
        System.out.println("Consructor Called : ");
        name = "Programiz";
    }

    /*Types of Constructor
    In Java, constructors can be divided into three types:

        No-Arg Constructor, nah ini ada dia atas
        Parameterized Constructor
        Default Constructor
        */

    // 2.Java Parameterized Constructor

    /*Sebuah konstruktor Java juga dapat menerima satu atau lebih parameter.
     
     Contoh : 
    */

    String language;
    // dngan  parameter
    Constructor(String lang){
        language = lang;
        System.out.println(language + " Programing language");

    }

    //3.Java Default Constructor

    /*Jika kita tidak membuat konstruktor apa pun, kompiler Java secara otomatis 
    membuat sebuah konstruktor tanpa argumen selama eksekusi program.

    Konstruktor ini disebut konstruktor default. conoth: */

    int a;
    boolean b;


    public static void main(String[] args) {

        // nah, disini juga saya terapkah konstruktor overloading
        
        Constructor obj = new Constructor();
        obj.name = "Tayler";
        System.out.println("The name is : " + obj.name);

        Constructor obj1 = new Constructor("Java");   
        Constructor obj2 = new Constructor("Python");   
        System.out.println(obj1.language + ", " + obj2.language);


        Constructor obj3 = new Constructor();

        System.out.println("\nDefault Value: ");
        System.out.println("a = " + obj3.a);
        System.out.println("b = " + obj3.b);


    }
}
