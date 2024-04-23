package OOP_I;

public class ThisKeyword {
    /*dyword digunakan untuk i java, this keywor unutk menyimpan
      object dalam method atau constructor, contoh :
      saya bisa katakan object = this, namun beda tempat

    */
    int insVar;

    // ThisKeyword(int insVar){
    //     this.insVar = insVar;
    //     System.out.println("this reference = " + this.insVar);

    // }

    // Use of this Keyword
        // 1. Using this for Ambiguity Variable Names
            // contohnya diats tadi jika kita tidak pake this maka
            // nilainya tidak akan diubah karena blm disimpan

        // 2. this with Getters and Setters
            /*Another common use of this keyword is in setters and getters methods 
            of a class. For example: */
        String name;

        //setter 
        void setName(String name){
            this.name = name;
        }

        // getter
        String getName(){
            return this.name;
        }
    
    // 3. Using this in Constructor Overloading
        /*Ketika bekerja dengan overloading konstruktor, kita mungkin perlu 
        memanggil satu konstruktor dari konstruktor lainnya. Dalam kasus seperti itu, 
        kita tidak bisa memanggil konstruktor secara eksplisit. Sebaliknya, kita harus 
        menggunakan kata kunci this.

        Di sini, kita menggunakan bentuk lain dari kata kunci this. Yaitu, this(). 
        contoh, */

        private int a, b;

        // constructor 2 parameter
        ThisKeyword(int i, int j){
            this.a = i;
            this.b = j;
        }

        //contructor 1 parameter
        ThisKeyword(int i){
            this(i,i); //panggil contructor berparameter 2
        }

        // tanpa parameter
        ThisKeyword(){
            this(0); // panggil yang bersatu parameter

        }

        @Override
        public String toString(){
            return this.a + " + " + this.b + "i";
        }

    public static void main(String[] args) {
        // ThisKeyword obj = new ThisKeyword(8);
        // System.out.println("Object reference = " + obj.insVar);;

        // for setter getter
        // ThisKeyword obj1 = new ThisKeyword();
        // obj1.setName("Hane");
        // System.out.println("obj1.name : " +obj1.getName());

        ThisKeyword c1 = new ThisKeyword(2,2);
        ThisKeyword c2 = new ThisKeyword(3);
        ThisKeyword c3 = new ThisKeyword();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }   


}
