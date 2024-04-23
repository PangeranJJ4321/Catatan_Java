package Java_Method;

public class Recursion {
    /*rekursi adalah suatu pendekatan di mana suatu fungsi memanggil dirinya sendiri 
    dalam proses pemecahan masalah. Ini memungkinkan pemecahan masalah yang kompleks 
    untuk dipecahkan menjadi masalah yang lebih sederhana dan lebih mudah diselesaikan.
    Contoh klasik dari penggunaan rekursi adalah dalam perhitungan faktorial.  */

    public static void main(String[] args) {

        // contoh rekursif 
        System.out.println("Conoth rekrsif");
        int num = 5;
        int result = faktorial(5);
        System.out.printf("Faktorial dari %d : %d", num, result);
        result = sum(5);
        System.out.printf("\nSum dari %d : %d", num, result);

        /*Halting Condition (Kondisi Berhenti)
        Sama seperti loop bisa mengalami masalah dengan perulangan tak terbatas, 
        fungsi rekursif juga bisa mengalami masalah dengan rekursi tak terbatas. 
        Rekursi tak terbatas terjadi ketika fungsi terus-menerus memanggil dirinya sendiri. 
        Setiap fungsi rekursif harus memiliki kondisi berhenti, yaitu kondisi di mana fungsi 
        berhenti memanggil dirinya sendiri. Pada contoh sebelumnya, kondisi berhenti terjadi 
        ketika parameter k menjadi 0.

        Berguna untuk melihat berbagai contoh yang berbeda untuk lebih memahami konsep ini. 
        Pada contoh ini, fungsi menambahkan rentang angka antara awal dan akhir. Kondisi berhenti 
        untuk fungsi rekursif ini terjadi ketika akhir tidak lebih besar dari awal: */

        result = sum(5, 10);
        System.out.println(result);
    }

    public static int faktorial(int k){
        if (k > 0){
            return k * faktorial(k - 1);
        }else{
            return 1;
        }
    }

    public static int sum(int k){
        if (k > 0){
            return k * sum(k - 1);
        }else{
            return 1;
        }
    }

    public static int sum(int start, int end) {
        if (end > start) {
          return end + sum(start, end - 1);
        } else {
          return end;
        }
      }
}
