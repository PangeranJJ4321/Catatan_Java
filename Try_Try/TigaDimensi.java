package Try_Try;

public abstract class TigaDimensi extends Bangun {

    @Override
    public abstract double luas(); 

    public abstract double volume(); 
}

class Kubus extends TigaDimensi {

    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return 6 * sisi * sisi;
    }

    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }
}
