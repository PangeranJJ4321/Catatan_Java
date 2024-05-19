package TP7.Nomor1;

public class Karyawan extends Kehidupan {
    private String nama;
    private int umur;
    private Pendidikan pendidikan;
    private Pengalaman pengalaman;
    private Projek projek;

    public Karyawan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public Pendidikan getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(Pendidikan pendidikan) {
        this.pendidikan = pendidikan;
    }

    public Pengalaman getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(Pengalaman pengalaman) {
        this.pengalaman = pengalaman;
    }

    public Projek getProjek() {
        return projek;
    }

    public void setProjek(Projek projek) {
        this.projek = projek;
    }

    @Override
    public void prosesKehidupan() {
        pendidikan.prosesKehidupan();
        pengalaman.prosesKehidupan();
        projek.prosesKehidupan();
    }

    @Override
    public boolean memenuhiKriteria() {
        return pendidikan.memenuhiKriteria() && pengalaman.memenuhiKriteria() && projek.memenuhiKriteria();
    }
}
