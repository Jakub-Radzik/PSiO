package train1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class _timer {
    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Siema");
            }
        };

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.MINUTE, 44);
        calendar.set(Calendar.SECOND, 0);
        Date time = calendar.getTime();
        System.out.println(time);

        Timer myT = new Timer();
        myT.schedule(task, time);

        
    }
}
