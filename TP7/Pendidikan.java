package TP7;

class Pendidikan {
    private String[] riwayatPendidikan;

    public Pendidikan(String[] riwayatPendidikan) {
        this.riwayatPendidikan = riwayatPendidikan;
    }

    public String[] getRiwayatPendidikan() {
        return riwayatPendidikan;
    }

    public void setRiwayatPendidikan(String[] riwayatPendidikan) {
        this.riwayatPendidikan = riwayatPendidikan;
    }

    public void tampilkanRiwayatPendidikan() {
        System.out.println("Riwayat Pendidikan: ");
        for (String pendidikan : getRiwayatPendidikan()) {
            System.out.println(pendidikan);
        }
    }
}
