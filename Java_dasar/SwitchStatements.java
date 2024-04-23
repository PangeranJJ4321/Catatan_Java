package Java_dasar;


public class SwitchStatements {

  
    public static void main(String[] args) {
        
   
    /*Alih-alih menulis banyak pernyataan if..else, 
    Anda dapat menggunakan pernyataan switch. yang lebih simple.


    Pernyataan switch memilih satu dari banyak 
    blok kode yang akan dieksekusi: 
    
        switch(expression) {
        case x:
            // code block
            break;
        case y:
            // code block
            break;
        ...
        ...
        default:
            // code block
        }
        
        cara kerjanya sama seperti if, else if, else*/

        // contoh

        int day = 4;
        switch (day) {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
          default:
            System.out.println("Hari apa ini?");
        }
        /*Pernyataan break digunakan untuk mengakhiri pernyataan switch-case. 
        Jika break tidak digunakan, semua kasus setelah kasus yang cocok juga akan dieksekusi. 
        
        Pernyataan switch juga mencakup kasus default opsional. 
        Ini dieksekusi ketika ekspresi tidak cocok dengan salah satu kasus.*/


    }

}
