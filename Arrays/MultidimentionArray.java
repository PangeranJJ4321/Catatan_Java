package Arrays;

public class MultidimentionArray {
    /*A multidimensional array is an array of arrays. Each 
    element of a multidimensional array is an array itself. 
    For example,

    int[][] a = new int[3][4];

    Here, we have created a multidimensional array named a. 
    It is a 2-dimensional array, that can hold a maximum of 12 elements, 
    
    
    Let's take another example of the multidimensional array. 
    This time we will be creating a 3-dimensional array. 
    For example,

    String[][][] data = new String[3][4][2];

    Here, data is a 3d array that can hold a maximum of 24 
    (3*4*2) elements of type String.*/

    public static void main(String[] args) {
        
        // cara inisialisasi array 2d
        int[][] array2d = {{1,2,3},{4,5,6,7,8},{9}};

        
        // hitung panjang disalam array
        System.out.println("Panjang array 1: " + array2d[0].length);
        System.out.println("Panjang array 1: " + array2d[1].length);
        System.out.println("Panjang array 1: " + array2d[2].length);

        // akses 8 di array2d
        System.out.println(array2d[1][4]);
        // atau
        int lastIndeks = array2d[1].length - 1;
        System.out.println(array2d[1][lastIndeks]);

        // Print all elements of 2d array Using Loop

        for (int i = 0; i < array2d.length; ++i){
            for (int j = 0; j < array2d[i].length; ++j){
                System.out.print(array2d[i][j] + " ");
            }
        }

        // atau menggunakan for each, untuk akses elemen array

        System.out.println();
        for (int[] elemen : array2d){
            for( int value : elemen){
                System.out.print(value + " ");
            }
        }
    }
}

