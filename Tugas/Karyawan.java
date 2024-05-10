package Tugas;

public class Karyawan extends Kehidupan {
    protected String nama, jabatan;
    protected int umur, gaji;

    public Karyawan(){

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    @Override
    public void prosesKehidupan() {
        // TODO Auto-generated method stub
        System.out.println("Yah");
    }

    @Override
    public void tampilkan() {
        // TODO Auto-generated method stub
        System.out.println("Data karyawan : ");
        System.out.println("Nama : " + getNama());
        System.out.println("Jabaan : " + getJabatan());
        System.out.println("Umur : " + getUmur());
        System.out.println("Gajji : " + getGaji());
    }

    
    
    
}
