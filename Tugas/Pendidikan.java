package Tugas;

public class Pendidikan extends Kehidupan {
    String[] riwayatPendidikan;

    public Pendidikan(String[] riwayatPendidikan) {
        this.riwayatPendidikan = riwayatPendidikan;
    }

    
    public void tampilkanRiwayatPendidikan() {
        System.out.println("Riwayat Pendidikan: ");
        for (String pendidikan : getRiwayatPendidikan()) {
            System.out.println(pendidikan);
        }
    }

    public String[] getRiwayatPendidikan() {
        return riwayatPendidikan;
    }


    @Override
    public void prosesKehidupan() {
        // TODO Auto-generated method stub
        tampilkanRiwayatPendidikan();
    }

    @Override
    void tampilkan() {
        // TODO Auto-generated method stub
        prosesKehidupan();
    }



}
