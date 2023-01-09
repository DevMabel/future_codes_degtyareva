import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
public class Homework6 {
    public static void main(String args[]) {
        ZonedDateTime msTime = ZonedDateTime.of(2022,11,26,23,45,0,0,ZoneId.of("Europe/Moscow"));
        ZonedDateTime mgTime = ZonedDateTime.of(2022,11,27,16,25,0,0,ZoneId.of("Asia/Magadan"));
        System.out.println("Длительность полета: ");
        System.out.println(ChronoUnit.HOURS.between(msTime, mgTime) + "ч " + (ChronoUnit.MINUTES.between(msTime, mgTime) % 60) + "мин ");
    }
}