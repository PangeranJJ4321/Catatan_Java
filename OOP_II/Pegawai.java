package OOP_II;

public class Pegawai {
    // ini adalah class animal
    String nama;
    int gaji;

    Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    void info (){
        System.out.println("Nama : " + nama + " Gaji : " + gaji);
    }

    int infoGaji(){
        return gaji;
    }
}

class Manager extends Pegawai {
    int tunjangan;

    Manager(String nama, int gaji, int tunjangan){
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    void infoGajiTunjangan(){
        super.info();   
        System.out.println("Tunjangan : " + tunjangan);
    }
}

class Programer extends Pegawai {
    int bonus;

    Programer(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }

    void infoGajiTunjangan(){
        super.info();
        System.out.println("Bonus : " + bonus);
    }
}




