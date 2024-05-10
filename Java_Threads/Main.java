package Java_Threads;

/*Threads allows a program to operate more 
efficiently by doing multiple
 things at the same time. Threads can be used 
 to perform complicated tasks in the background 
 without interrupting the main program */

// create a Thread

/*There are two ways to create a thread.

It can be created by extending the Thread class and overriding its run() method:
 */

 public class Main extends Thread {

    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);

        // run
        thread.start();
        System.out.println("diluar class Threads");


    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
