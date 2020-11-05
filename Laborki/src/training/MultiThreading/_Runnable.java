package training.MultiThreading;

public class _Runnable implements Runnable{

    public void run(){
        doDziela();
    }

    public void doDziela(){
        System.out.println("zaraz wywołam nextJob");
        nextJob();
        System.out.println("wróciłem z nextJob");
    }

    public void nextJob(){
        System.out.println("wywołanie nextJob");
    }
}

class _RunnableTester {
    public static void main(String[] args) {
        Runnable zadanie = new _Runnable();
        Thread myThread = new Thread(zadanie);
        myThread.start();

        System.out.println("main again");
    }
}
