package Java_Threads;


class Koin {
    private int count = 0;

    public int getCount(){
        return count;
    }

    public synchronized void increment(){
        count++;
    }
}
public class Synchronized {
    public static void main(String[] args) {
        
        Koin koin = new Koin();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                koin.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                koin.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Count : " + koin.getCount());
    }
}
