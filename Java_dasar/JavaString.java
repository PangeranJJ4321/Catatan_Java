package Java_dasar;


public class JavaString {
    public static void main(String[] args) {
        /*A String variable contains a collection of characters surrounded by double quotes: */

        String greeting = "Hallo Semua";

        // Join Two Java Strings

        String first = "Java";
        System.out.println("First String : " + first);
        
        String second = "Programming";
        System.out.println("Second String : " + second);

        String joinedString = first.concat(second);
        System.out.println("Joined String : " + joinedString);

        // Compare Two Strings

        first = "java programming"; // disini saya membuat String baru yang berisi nilai yang diubah, bukan mengubah nilai String yang sudah ada.
        second = "java programming"; //  karena sifat String immutable
        String third = "python programming";

        boolean result1 = first.equals(second);
        System.out.println("Strings first and second are equal: " + result1);

        boolean result2 = first.equals(third);
        System.out.println("Strings first and third are equal: " + result2);
        
        // kita juga bisa pakai ==
        boolean result3 = (second == third);
        System.out.println("Strings second and third are equal: " + result3);
        // method string
            // length : cari panjang string
            System.out.println("Panjang dari string greting : " + greeting.length());

            // toUpper/toLowerCase()
            System.out.println(greeting.toUpperCase());
            System.out.println(greeting.toLowerCase());
        
        // Menemukan index char di sebuah string, pakai indexOf()

            String txt = "Please locate where 'locate' occurs!";
            System.out.println(txt.indexOf("locate")); // Outputs 7

        
        // create a string using the new keyword

        String nama = new String("Pangeran");
        /*nah diatas ada contoh string dibuat dengan menggunakan new keyword */
        System.out.println("\nNama saya : " + nama);

            // aapa perbedaanya?

            // saat kita buat string dengan literal
            String example1 = "Java";

            System.out.println("Example 1 : " + example1);
            

            String example2 = new String("Java");
            System.out.println("Example 2 : " + example2);
            /*Perbedaan utama antara kedua cara ini adalah dalam penanganan memori 
            dan bagaimana objek String diinisialisasi. Literal String akan menggunakan 
            string pool untuk mengurangi penggunaan memori, sedangkan penggunaan new akan 
            membuat objek baru di dalam memori, tanpa mempertimbangkan string pool. 
            Dalam kebanyakan kasus, penggunaan literal String lebih disukai karena pengelolaan 
            memori yang lebih efisien dan penggunaan yang lebih nyaman. */







        


    }   
}
