package TP7;

public abstract class Kehidupan {
    protected Karyawan karyawan;

    public Kehidupan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public abstract void prosesKehidupan();

    public abstract void memenuhiKriteria();
}
