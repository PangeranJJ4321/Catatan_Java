package Java_dasar;


public class BreakStatement {
    /*Pernyataan break dalam Java mengakhiri loop secara langsung, 
    dan kendali program berpindah ke pernyataan berikutnya setelah loop.

    Biasanya, pernyataan ini digunakan dengan pernyataan pengambilan 
    keputusan (Java if...else Statement).

    Berikut adalah sintaks dari pernyataan break dalam Java: 
    
        break;
        
    contoh:
        */
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++){
            if (i == 5){break;}
            System.out.print(i + " ");
        }
        // berhenti saat i == 5, dan otomatis 5 tidak dicetak
        // kecuali print di atas kondisi.

        // Break dan Nested Loop

            /*while (expression) {
                // codes
                while(expression){
                    // codes

                    if (condisi to break){break;}

                    // codes
                } 
                
                // codes
            }*/
        

        // Label break Statement
            /*Di sini, pernyataan break mengakhiri pernyataan berlabel (yaitu, loop luar). 
            Kemudian, kendali program melompat ke pernyataan setelah pernyataan 
            berlabel tersebut.
            
            label:
            for (int; expression; update){
                // codes
                for (int; expression; update){
                    // codes
                    if (kondis to break){break label;}

                    // codes
                }
                // codes
            }
            // codes jika label break(langsung lompat)*/

            // conoh lain
                /*while (testExpression) {
                // codes
                second:
                while (testExpression) {
                    // codes
                    while(testExpression) {
                        // codes
                        break second;
                    }
                }
                // control jumps here
                } 
                
                Pada contoh di atas, ketika pernyataan break second; dieksekusi, loop while 
                yang diberi label sebagai second diakhiri. Dan, kendali program berpindah ke 
                pernyataan setelah loop while second.*/

                // Contoh pengguaan
                System.out.println();
                first:
                for( int i = 1; i < 5; i++) {
                    // second:
                    for(int j = 1; j < 3; j ++ ) {
                        System.out.println("i = " + i + "; j = " +j);
                        if ( i == 2)
                            break first;
                    }
                }




    }   
}
