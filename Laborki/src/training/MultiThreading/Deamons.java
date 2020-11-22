package training.MultiThreading;

public class Deamons extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("demon works");
        }else {
            System.out.println("other tread");
        }
    }

    public static void main(String[] args) {
        Deamons d1 = new Deamons();
        Deamons d2 = new Deamons();
        Deamons d3 = new Deamons();

        d1.setDaemon(true);

        d1.start();
        d2.start();
        d3.start();
    }

}
