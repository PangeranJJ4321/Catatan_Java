package TP8;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Thread ui = new Thread(new UIThread());
        ui.start();
    }
}

class UIThread implements Runnable {
    public static int executionTime = 0;
    int jumlah_data_sumber = 4;
    public static int data_loaded = 0;
    public static int data_not_loaded = 0;

    @Override
    public void run() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        System.out.println("Start Load " + jumlah_data_sumber + " Data");
        for (int i = 0; i < 4; i++) {
            Runnable task = new BackgroundThread();
            executor.execute(task);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
            timer();
        }
        System.out.println("Task Finish");
        System.out.println("Time Execution : " + executionTime +"s");
        if (data_loaded == jumlah_data_sumber) {
            System.out.println("All Data Is Successfully Loaded");
        } else {
            System.out.println(data_loaded +" Successfully Loaded & " + data_not_loaded + " Data Failed To Load");
        }

    }

    public void timer(){
        try {
            Thread.sleep(1000);
            executionTime++;
            // System.out.printf("\nLoading...  (%ds)",executionTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}

class BackgroundThread implements Runnable{

    @Override
    public void run() {
        try {
            int sleepTime = 1000 * TaskTimeHelper.angkaRandom();
            Thread.sleep(sleepTime);
            if (sleepTime > 4000) {
                System.out.println("Request Timeout");
                UIThread.data_not_loaded++;
                return;
            }
            synchronized (UIThread.class) {
                UIThread.data_loaded++;
                System.out.printf("Loading...  (%ds)\n", UIThread.executionTime);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class TaskTimeHelper {
    public static int angkaRandom(){
        return new Random().nextInt(6) + 1;
    }
}