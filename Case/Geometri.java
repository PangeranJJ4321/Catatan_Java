package Case;

public interface Geometri {
    public  double getParameter();
    public double getArea();
}

class Circle implements Geometri {
    private double radius = 1.0;
    public double getParameter() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}



class Main{
    public static void main(String[] args) {
        Circle c = new Circle();
        // System.out.println(c.getArea());
        System.out.println("Parameter : " + c.getParameter());
        System.out.println("Luas area lingkaran : " + c.getArea());


        Resizamble r = new Resizamble();
        System.out.println("Parameter : " + r.resize() * c.getArea());    
        System.out.println("Luas area lingkaran : " + r.area()*0.5);
    }
}