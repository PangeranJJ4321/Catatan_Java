package Tugas;

public class Pengalaman extends Kehidupan {
    String jenisPekerjaan;
    String[] sertifikat;
    String[] organisasi;

    
    public Pengalaman(String jenisPekerjaan, String[] sertifikat, String[] organisasi) {
        this.jenisPekerjaan = jenisPekerjaan;
        this.sertifikat = sertifikat;
        this.organisasi = organisasi;
    }

    public String getJenisPekerjaan() {
        return jenisPekerjaan;
    }
    public void setJenisPekerjaan(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }
    public String[] getSertifikat() {
        return sertifikat;
    }
    public void setSertifikat(String[] sertifikat) {
        this.sertifikat = sertifikat;
    }
    public String[] getOrganisasi() {
        return organisasi;
    }
    public void setOrganisasi(String[] organisasi) {
        this.organisasi = organisasi;
    }

    @Override
    public void prosesKehidupan() {
        // TODO Auto-generated method stub
        System.out.println("yah");
    }

    @Override
    public void tampilkan() {
        System.out.println("Berkerja sebagai " + getJenisPekerjaan());
        if (getSertifikat().length > 0) {
            System.out.println("Memiliki sertifikasi: ");
            for (String sertifikasi : getSertifikat()) {
                System.out.print(sertifikasi + ", ");
            }
            System.out.println();
        }
        if (getOrganisasi().length > 0) {
            System.out.println("Bergabung dalam organisasi: ");
            for (String organisasi : getOrganisasi()) {
                System.out.print(organisasi + ", ");
            }
            System.out.println();
        }
    }


}
