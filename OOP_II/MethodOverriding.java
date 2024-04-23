package OOP_II;

public class MethodOverriding {
    /*Method overriding adalah ketika kelas anak (subclass) memiliki metode 
    dengan nama yang sama seperti metode yang sudah didefinisikan di kelas 
    induknya (superclass). Ini berarti kelas anak dapat menimpa atau mengganti 
    perilaku metode tersebut dengan perilaku yang berbeda sesuai kebutuhan kelas anak. 
    Saat objek dari kelas anak dipanggil, metode yang ada di kelas anak yang akan dieksekusi, 
    bukan metode dari kelas induk, kecuali jika metode dari kelas anak tersebut memanggil 
    metode kelas induk menggunakan kata kunci super. */
    public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.displayInfo();
   }
}

// contoh
class Animal {
    protected void displayInfo() {
       System.out.println("I am an animal.");
    }
 }
 
class Dog extends Animal {
    // ini method overriding, biar jelas kita kasih tanda @override
    @Override
    public void displayInfo() {
       super.displayInfo();
       System.out.println("I am a dog.");
    }
 }
 

/*Dalam contoh ini, kelas `Dog` menimpa (override) metode `displayInfo()` 
yang ada di kelas `Animal`. Saat memanggil metode `displayInfo()` pada objek `Dog`, 
pesan "I am a dog." dicetak, bukan pesan "I am an animal." yang berasal dari kelas `Animal`. 

Aturan-aturan overriding dalam Java adalah sebagai berikut:
    - Baik superclass maupun subclass harus memiliki nama metode yang sama, 
      tipe pengembalian yang sama, dan daftar parameter yang sama.
    - Kita tidak dapat melakukan overriding terhadap metode yang dideklarasikan 
      sebagai final dan static.
    - Kita harus selalu melakukan overriding terhadap metode-metode abstrak dari 
      superclass (akan dibahas lebih lanjut dalam tutorial selanjutnya).
    
    */
// Supper Keyword di method Overriding
/*Untuk mengakses metode dari superclass dari dalam subclass, kita menggunakan kata kunci `super`. 
 
 Penting untuk dicatat bahwa konstruktor dalam Java tidak diwarisi. 
 Oleh karena itu, tidak ada yang disebut sebagai constructor overriding di Java.
 Namun, kita dapat memanggil konstruktor dari superclass dari dalam subclassnya.
*/


