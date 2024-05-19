package TP8;

public class contohMultiLain implements Runnable {
    public static void main(String[] args) {
        Thread contoh1 = new Thread("Contoh 1 ");
        Thread contoh2 = new Thread("Contoh 2 ");

        contoh1.start();
        contoh2.start();
        System.out.println("Thread names are following:");
        System.out.println(contoh1.getName());
        System.out.println(contoh2.getName());
    }
    @Override
    public void run(){
        
    }
}
