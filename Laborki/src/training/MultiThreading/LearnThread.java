package training.MultiThreading;

public class LearnThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("thread works "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args){
        LearnThread m1 = new LearnThread();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
