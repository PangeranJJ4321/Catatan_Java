package Case;

public interface UbahUkuran {
    public double resize();
    public double area();
} 
/**
 * InnerUbahUkuran
 */
class Resizamble implements UbahUkuran {
    double ResizambleCircle ;

    
    public Resizamble() {
    }

    public double resize() {
        return ResizambleCircle;
    }

    public double area() {
        return Math.PI * ResizambleCircle * ResizambleCircle;
    }

    public double getResizambleCircle() {
        return ResizambleCircle;
    }

    public void setResizambleCircle(double resizambleCircle) {
        ResizambleCircle = resizambleCircle;
    }

    
}
