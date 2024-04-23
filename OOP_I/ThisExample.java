package OOP_I;

public class ThisExample {
    //  Passing this as an Argument
    /*We can use this keyword to pass the current object as an argument to a method. 
    For example,*/

    int x, y;

    ThisExample(int x, int y){
        this.x = x;
        this.y = y;

        // sebelum di add
        System.out.println("Before passing this to add addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        //calling method
        add(this);
        // sesudah calling add

        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

    }

    void add(ThisExample o){
        o.x += 2;
        o.y += 2;
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample(1, -2);
        
    }
}
