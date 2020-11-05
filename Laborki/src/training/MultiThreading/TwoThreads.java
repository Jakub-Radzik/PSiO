package training.MultiThreading;

public class TwoThreads implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        TwoThreads zadania = new TwoThreads();
        Thread alfa = new Thread(zadania);
        alfa.setName("alfa");
        alfa.start();
    }
}
