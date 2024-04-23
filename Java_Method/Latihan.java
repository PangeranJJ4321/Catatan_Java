package Java_Method;

public class Latihan {

    static int add(int x, int y){
        return x + y;
    }

    public double add(int x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        
        int result = add(3,2);
        System.out.println(result);

        Latihan obj1 = new Latihan();

        System.out.println(obj1.add(2, (double) result));
    }
}
