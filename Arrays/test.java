// package Arrays;
// import java.util.ArrayList;
// import java.util.Collections;

// public class test {
//   private static Object list;

//   public static void main(String[] args) {

//     int[][] array = {{1, 2, 3}, {4, 5}, {100, 101, 102}};

//     // for (int i = 0; i < array.length; i++) {
//     //   for (int j = 0; j < array[i].length; j++) {
//     //     list.add(array[i][j]);
//     //   }
//     // }
    
//     // Sort the list for accurate median calculation (especially for even sizes)
//     Collections.sort(list);
//     int median;
//     int n = list.size();
//     int indeks;
//     if (n % 2 == 0) {
//       indeks = n / 2;
//       median = (list.get(indeks) + list.get(indeks - 1)) / 2;
//     } else {
//       indeks = (n + 1) / 2;
//       median = list.get(indeks - 1);
//     }

//     System.out.println("Isi ArrayList:");
//     for (Integer num : list) {
//       System.out.print(num + " ");
//     }

//     System.out.println("\nMedian = " + median);








//   }
// }
