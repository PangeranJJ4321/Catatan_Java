package Arrays;

import java.util.Arrays;

public class CopyArray2D {
    public static void main(String[] args) {
        
        // 1. Copying 2d Arrays Using Loop

            // sama dengan 1 dimensi, contoh :
            
            int[][] source = {
                {1, 2, 3, 4}, 
                {5, 6},
                {0, 2, 42, -4, 5}
                };
            
                // lapisan luar
                int[][] destination = new int[source.length][];

                for (int i = 0; i < destination.length; ++i) {
                    // lapisan dalam
                    destination[i] = new int[source[i].length];
        
                    for (int j = 0; j < destination[i].length; ++j) {
                        // isi element
                        destination[i][j] = source[i][j];
                    }

                }
            // namun untuk panggil arraynya tidak bisa pakai Arrays.toString()
            // dengan Arrays.deepToString() // karean array 2 d
            System.out.println( "Array Asli" + Arrays.deepToString(source));  
            System.out.println( "Array Copy" + Arrays.deepToString(destination)); 

        // 2. Copying 2d Arrays using arraycopy()

                // bisa juga pakai System.arrayCopy()

                // lapisan luuar
                int[][] destination1 = new int[source.length][];

                for (int i = 0; i < source.length; ++i) {

                    // alokasi lapisan dalam
                    destination1[i] = new int[source[i].length];
                    System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
                }
                

    }
}
