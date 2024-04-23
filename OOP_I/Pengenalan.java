package OOP_I;

class definisi {
    
    // dah, kelas itu cetak biru. gini
    // sebelum kita sebut dia manusi, kita pasti memastikannya
    //  dia berakal, jalan, dan lain lain. nah itu class.

        // contoh : class ini,

            /*class ClassName{
             * fields (variabel)
             * method (apa yang bisa dilakuin si Object)
             
            }*/
        // contoh di bawah class Sepeda
}

class Sepeda{

    // field atau atribut
    String jenisSepeda = "Sport";
    // method / perilaku
    void braking(){
        System.out.println("Working of Braking");
    }

    /*cara memanggilnya, tentunya kita embutuhkan objct
     * dan untuk menjalankan kita butuh method main
     * Liat di bawah
    */
}

public class Pengenalan {

    public static void main(String[] args) {
        // disini kita bisa panggil

        //buat object sepeda
            /*NamaClass nama_obj = new NamaClass();
             * ...
             */

            Sepeda sepedaOlahraga = new Sepeda();

        // akses field dan method
        String jenis = sepedaOlahraga.jenisSepeda; // Mengakses dan menyimpan nilai atribut jenisSepeda
        sepedaOlahraga.braking(); // Memanggil metode braking()
 
        System.out.println("Jenis Sepeda : " + jenis);
    }
    
}
