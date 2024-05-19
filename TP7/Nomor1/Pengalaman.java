package TP7.Nomor1;

public class Pengalaman extends Kehidupan {
    private String pengalamanSebelumnya;

    public Pengalaman(String pengalamanSebelumnya) {
        this.pengalamanSebelumnya = pengalamanSebelumnya;
    }

    public String getPengalamanSebelumnya() {
        return pengalamanSebelumnya;
    }

    public void setPengalamanSebelumnya(String pengalamanSebelumnya) {
        this.pengalamanSebelumnya = pengalamanSebelumnya;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Proses pengalaman: " + pengalamanSebelumnya);
    }

    @Override
    public boolean memenuhiKriteria() {
        return !pengalamanSebelumnya.equals("Tidak ada");
    }
}
