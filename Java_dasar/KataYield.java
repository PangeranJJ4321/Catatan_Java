package Java_dasar;


public class KataYield {
    /*kata kunci yield unutk mengembalikan nilai 
     * pada switch statement mirip dengan return.
     */


    public static void main(String[] args) {
        
    
        // switch tanpa menggunakan yield
        String nilai = "A";
        String ucapan;

        switch(nilai){
            case "A" -> ucapan = "Wow Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Anda lulus";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Apa ini?";
        }

        System.out.println(ucapan);
        
        // switch menggunakan yield

        String coment = switch(nilai){
            case "A" : 
                yield "Wow Anda lulus dengan baik";
            case "B", "C" :
                yield "Anda lulus";
            case "D" :
                yield "Anda tidak lulus";
            default :
                yield "Apa ini?";
        }; // jangan lupa ini ;

        System.out.println(coment);
        

    
    }

}
