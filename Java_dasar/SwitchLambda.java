package Java_dasar;


public class SwitchLambda {
    /*Ini adalah switch expresion
     *karena kita tdak memerluakn kata break
     
     
     Ekspresi memiliki sintaks yang mirip 
     dengan Lambda (case ... -> label) dan dapat 
     digunakan tidak hanya sebagai pernyataan, 
     tetapi juga sebagai ekspresi yang dievaluasi 
     menjadi satu nilai tunggal.*/

     // contoh :

     /**
     * @param args
     */
    public static void main(String[] args){
        String str = "A";
    
        int result = switch (str) {
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> 3;
            case "D" -> 4;
            default -> throw new IllegalStateException("Unexpected value: " + str);
        }; 

        System.out.println(result);

        // varibel result juga bisa di taruh di dalam switch

        int hasil;
        switch (str) {
            case "A" -> hasil = 1;
            case "B" -> hasil = 2;
            case "C" -> {
                hasil = 3;
                System.out.println("3!");
            }
            default -> {
                System.err.println("Unexpected value: " + str);
                hasil = -1;
            }
        }

        System.out.println(hasil);

        // kita juga bisa meggunakan return/yield
        
        var value = switch (str) {
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> {
                System.out.println("3!");
                yield 3; // return
            }
            case "D", "E", "F" -> 4;
            default -> throw new IllegalStateException("Unexpected value: " + str);
        };
        System.out.println(value);


        // Contoh lainnya : 
        double x = 4;
        double y = 2;
        String operator = "/";

        double result_operator;
            switch (operator) {
                case "+" -> result_operator = x + y;
                case "-" -> result_operator = x - y;
                case "*" -> result_operator = x * y;
                case "/" -> {
                    if (y == 0) {
                        throw new IllegalArgumentException("Can't divide by 0");
                    }
                    result_operator = x / y;
                }
                default -> throw new IllegalArgumentException("Unknown operator '%s'".formatted(operator));
            };
            
        System.out.println(result_operator);



    
    }

}
