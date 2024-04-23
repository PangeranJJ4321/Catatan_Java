package OOP_II;
import java.lang.Math;
// Interface adalah sebuah kelas abstrak sepenuhnya. Ini mencakup 
// sekelompok metode abstrak (metode tanpa tubuh).

//Kita menggunakan kata kunci interface untuk membuat sebuah antarmuka di Java. 

//Sebagai contoh,
/*sama seperti class abstract kita tidak bisa  membuat object
 * kita menggunakan keyword implements unutk mengimplementasikan interface
 */
interface Language {
    public void displayLanguage();

    public void getVersion();
}

// menambahka  multi interface
interface Polygon {
    void getArea();

    // default method

    default void getSides() {
        System.out.println("I can get sides of a polygon.");

    }
}

// iplementasi

class Rectangle implements Polygon {
    public void getArea(){

        int length = 6;
        int breadth = 5;
        System.out.println("The area of rectangle is = " + breadth *length);
    }
    // overrides the getSides
    public void getSides() {
        System.out.println("I have 4 sides");
    }

}

class Square implements Polygon {
    public void getArea(){
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is = " + area);
    }
}

class Triangle implements Polygon {
    private int a , b, c;
    private double s, area;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
        
    }

    @Override
    public void getArea() {
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
        System.out.println("The area of the Triangle is = " + area);
        
    }
}
public class JavaInterface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();        
        r1.getArea();
        r1.getSides();

        Square s1 = new Square();
        s1.getArea();
        s1.getSides();

        Triangle t1 = new Triangle(2, 3, 4);
        t1.getArea();
    }
}
