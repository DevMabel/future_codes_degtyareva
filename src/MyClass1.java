import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MyClass1 {
    public static void main(String[] args) {
        Scanner c  = new Scanner(System.in);
        System.out.println("Впишите год. Enter year.");
        int x = c.nextInt();
        System.out.println("Впишите месяц. Enter month.");
        int y = c.nextInt();
        System.out.println("Впишите день. Enter the day.");
        int t = c.nextInt();
        System.out.println("Впишите час. Enter the hour.");
        int r = c.nextInt();
        System.out.println("Впишите минуту. Enter a minute.");
        int d = c.nextInt();

        System.out.println("Впишите год. Enter year.");
        int g = c.nextInt();
        System.out.println("Впишите месяц. Enter month.");
        int h = c.nextInt();
        System.out.println("Впишите день. Enter the day.");
        int j = c.nextInt();
        System.out.println("Впишите час. Enter the hour.");
        int n = c.nextInt();
        System.out.println("Впишите минуту. Enter a minute.");
        int b = c.nextInt();

        ZonedDateTime DateTime1 = ZonedDateTime.of(x,y,t,r,d,0,0,ZoneId.of("Europe/Moscow"));
        ZonedDateTime DateTime2 = ZonedDateTime.of(g,h,j,n,b,0,0,ZoneId.of("Europe/Moscow"));

        long v = ChronoUnit.HOURS.between(DateTime1,DateTime2);
        long m = ChronoUnit.DAYS.between(DateTime1,DateTime2);
        long s = ChronoUnit.YEARS.between(DateTime1,DateTime2);
        long q = ChronoUnit.MINUTES.between(DateTime1,DateTime2);
        long e = ChronoUnit.MONTHS.between(DateTime1,DateTime2);
        System.out.print("год/year: ");
        System.out.println(s);
        System.out.print("месяц/month: ");
        System.out.println(e);
        System.out.print("день/day: ");
        System.out.println(m);
        System.out.print("час/hour: ");
        System.out.println(v);
        System.out.print("минута/minute: ");
        System.out.println(q);
    }
}

