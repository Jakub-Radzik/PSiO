package train1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class _format {
    public static void main(String[] args) {

        ZoneId zone1 = ZoneId.of("America/Phoenix");
        ZoneId zone2 = ZoneId.of("Europe/Warsaw");
        LocalTime time1 = LocalTime.now(zone1);
        LocalTime time2 = LocalTime.now(zone2);

        System.out.printf("time1 = %1$tH:%1$tM:%1$tS", time1);
        System.out.println();
        System.out.printf("time2 = %1$tH:%1$tM:%1$tS", time2);
        System.out.println();

        long hours = ChronoUnit.HOURS.between(time1, time2);
        long minutes = ChronoUnit.MINUTES.between(time1, time2)-(60*hours);
        System.out.println("time:" + hours+":"+minutes);
    }
}
