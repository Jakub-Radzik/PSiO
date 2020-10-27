package train1;

import java.time.LocalDateTime;
import java.util.Calendar;

public class _calendar {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        Calendar kal = Calendar.getInstance();
        kal.set(now.getYear(), now.getMonthValue() ,now.getDayOfMonth(),now.getHour(),now.getMinute(),now.getSecond());

        info(kal);
        kal.add(kal.MONTH, 20);
        info(kal);
    }

    public static void info(Calendar kal) {
        System.out.println(kal.get(Calendar.DATE) +" "+kal.get(Calendar.MONTH)+" "+ kal.get(Calendar.YEAR)+" "+
                kal.get(Calendar.HOUR_OF_DAY)+":"+kal.get(Calendar.MINUTE)+":"+kal.get(Calendar.SECOND));
    }
}
