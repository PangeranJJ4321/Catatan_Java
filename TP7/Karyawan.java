package TP7;
import java.util.ArrayList;


public class Karyawan{
    private String nama;
    private Pendidikan pendidikan;
    private Pengalaman pengalaman;
    private Projek projek;
    private ArrayList<Kehidupan> kehidupans;

    public Karyawan(String nama) {
        this.nama = nama;
        kehidupans = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public void addKehidupan(Kehidupan kehidupan) {
        kehidupans.add(kehidupan);
    }

    public void prosesKehidupan() {
        for (Kehidupan kehidupan : kehidupans) {
            kehidupan.prosesKehidupan();
        }
    }

    public void memenuhiKriteria() {
        for (Kehidupan kehidupan : kehidupans) {
            kehidupan.memenuhiKriteria();
        }
    }
}
