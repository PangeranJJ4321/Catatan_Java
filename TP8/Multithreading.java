package TP8;

public class Multithreading implements Runnable {
    private String threadName;

    public Multithreading(String threadName){
        this.threadName = threadName;
    }

    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println(threadName + " : " + i);
        

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println(threadName + " thread interupted.");
            }
        }
     }

     public static void main(String[] args) {
        Thread thread1 = new Thread(new Multithreading("Thread 1"));
        Thread thread2 = new Thread(new Multithreading("Thread 2"));


        thread1.start();
        thread2.start();
     }
    
}
