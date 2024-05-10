package TP7;

public class Pengalaman extends Kehidupan {
    private String jenisPekerjaan;
    private String[] sertifikasi;
    private String[] organisasi;

    public Pengalaman(String jenisPekerjaan, String[] sertifikasi, String[] organisasi) {
        this.jenisPekerjaan = jenisPekerjaan;
        this.sertifikasi = sertifikasi;
        this.organisasi = organisasi;
    }

    public String getJenisPekerjaan() {
        return jenisPekerjaan;
    }

    public void setJenisPekerjaan(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    public String[] getSertifikasi() {
        return sertifikasi;
    }

    public void setSertifikasi(String[] sertifikasi) {
        this.sertifikasi = sertifikasi;
    }

    public String[] getOrganisasi() {
        return organisasi;
    }

    public void setOrganisasi(String[] organisasi) {
        this.organisasi = organisasi;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Menjalani pekerjaan sebagai " + getJenisPekerjaan());
        if (getSertifikasi().length > 0) {
            System.out.println("Memiliki sertifikasi: ");
            for (String sertifikasi : getSertifikasi()) {
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
