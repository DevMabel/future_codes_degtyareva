import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Home3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую дату(год месяц день): ");
        int year1 = scan.nextInt();
        int month1 = scan.nextInt();
        int day1 = scan.nextInt();
        System.out.println("Введите вторую дату(год месяц день): ");
        int year2 = scan.nextInt();
        int month2 = scan.nextInt();
        int day2 = scan.nextInt();
        LocalDateTime firstTime = LocalDateTime.of(year1, month1, day1, 0,0);
        LocalDateTime secondTime = LocalDateTime.of(year2, month2, day2, 0,0);
        System.out.print("Дней между этими датами: ");
        System.out.println(ChronoUnit.DAYS.between(firstTime,secondTime));
    }
}
