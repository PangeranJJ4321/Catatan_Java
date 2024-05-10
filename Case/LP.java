package Case;

abstract class Artikel {;

    String nama;
    String publisher;
    int yearOfRilis;

    public abstract void addArtikel();
    public abstract void hapusArtikel();

}

class LP extends Artikel {
    String namaofArtis;
    int noRecord;

    LP(String nama, String publisher, int yearOfRilis, String namaofArtis, int noRecord) {
        super();
        this.nama = nama;
        this.publisher = publisher;
        this.yearOfRilis = yearOfRilis;
        this.namaofArtis = namaofArtis;
        this.noRecord = noRecord;
    }

    public void addArtikel() {
        System.out.println("Judul : " + this.nama);
        System.out.println("Penulis : " + this.namaofArtis);
        System.out.println("Tahun : " + this.yearOfRilis);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("No. Record : " + this.noRecord);
    }

    public void hapusArtikel() {
        System.out.println("Artikel " + this.nama + " di hapus");
    }
}

class Book extends Artikel {
    String writer;
    String gendre;

    Book(String nama, String publisher, int yearOfRilis, String writer, String gendre) {
        super();
        this.nama = nama;
        this.publisher = publisher;
        this.yearOfRilis = yearOfRilis;
        this.writer = writer;
        this.gendre = gendre;
    }

    public void addArtikel() {
        System.out.println("Judul : " + this.nama);
        System.out.println("Penulis : " + this.writer);
        System.out.println("Tahun : " + this.yearOfRilis);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("Gendre : " + this.gendre);
    }

    public void hapusArtikel() {
        System.out.println("Artikel " + this.nama + " di hapus");
    }


}

class BoardGame extends Artikel {
    int nrOfPlayer;
    int AveragePlaytime;

    BoardGame(String nama, String publisher, int yearOfRilis, int nrOfPlayer, int AveragePlaytime) {
        super();
        this.nama = nama;
        this.publisher = publisher;
        this.yearOfRilis = yearOfRilis;
        this.nrOfPlayer = nrOfPlayer;
        this.AveragePlaytime = AveragePlaytime;
    }

    public void addArtikel() {
        System.out.println("Artikel " + this.nama + " ditambahkan");
        System.out.println("Judul : " + this.nama);
        System.out.println("Tahun : " + this.yearOfRilis);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("Jumlah Player : " + this.nrOfPlayer);
        System.out.println("Average Playtime : " + this.AveragePlaytime);
    }

    public void hapusArtikel() {
        System.out.println("Artikel " + this.nama + " di hapus");
    }
}

class Main {

    public static void main(String[] args) {
        LP l = new LP("Halo", "Halo", 2020, "Halo", 2020);
        l.addArtikel();
        l.hapusArtikel();


    }

}