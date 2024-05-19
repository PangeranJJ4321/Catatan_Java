package TP7.Nomor1;

public class Pendidikan extends Kehidupan {
    private String pendidikanTerakhir;

    public Pendidikan(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Proses pendidikan: " + pendidikanTerakhir);
    }

    @Override
    public boolean memenuhiKriteria() {
        return !pendidikanTerakhir.isEmpty();
    }
}
