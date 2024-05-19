package TP8;

public class Tradersss extends Thread{

    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // Menunda eksekusi thread selama 1 detik
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted.");
            }
        }
    }

    public static void main (String[] args){
        Tradersss thread = new Tradersss();

        thread.start();

        // lanjut eksekusi
        for (int i = 1; i <= 5; i++){
            System.out.println("Main thread : " + i);
            try {Thread.sleep(5000); //tunda eksekusi selama 5 detik

            } catch (InterruptedException e){
                System.out.println("Main thread interupted.");
            }
        }
    }
    
}
