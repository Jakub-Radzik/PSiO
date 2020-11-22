package training.MultiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool implements Runnable{
    private String msg;

    public Pool(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---"+msg);
        processmessage();
        System.out.println(Thread.currentThread().getName()+"+++end");
    }

    private void processmessage(){
        try {
            Thread.sleep(200);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new Pool("Watek#"+i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()){}
        System.out.println("Finished all");
    }
}
