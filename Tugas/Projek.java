package Tugas;

public class Projek extends Kehidupan {

    int jumlahProjek;

    public Projek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }

    public int getJumlahProjek() {
        return jumlahProjek;
    }

    public void tampilkanJumlahProjek() {
        System.out.println("Jumlah Projek: " + getJumlahProjek());
    }

    @Override
    public void tampilkan() {
        // TODO Auto-generated method stub
        tampilkanJumlahProjek();
    }

    @Override
    public void prosesKehidupan() {
        // TODO Auto-generated method stub
        System.out.println("Yah");
    }
    
}
