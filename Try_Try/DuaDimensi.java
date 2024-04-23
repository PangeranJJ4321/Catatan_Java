package Try_Try;

public abstract class DuaDimensi extends Bangun {

    @Override
    public abstract double luas();

    public abstract double keliling(); // Ditambahkan di kelas turunan
}

class Persegi extends DuaDimensi {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }
}
