package TP7.Nomor1;

public class Projek extends Kehidupan {
    private int jumlahProjek;

    public Projek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }

    public int getJumlahProjek() {
        return jumlahProjek;
    }

    public void setJumlahProjek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Proses projek: " + jumlahProjek + " projek");
    }

    @Override
    public boolean memenuhiKriteria() {
        return jumlahProjek > 0;
    }
}
