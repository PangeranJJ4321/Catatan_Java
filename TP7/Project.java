package TP7;

class Project {
    private int jumlahProjek;

    public Project(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }

    public int getJumlahProjek() {
        return jumlahProjek;
    }

    public void setJumlahProjek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }

    public void tampilkanJumlahProjek() {
        System.out.println("Jumlah Projek: " + getJumlahProjek());
    }
}
