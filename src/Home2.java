import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;
public class Home2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        ZonedDateTime nowButNotThere = ZonedDateTime.now(ZoneId.of(text));
        System.out.println(nowButNotThere);
    }
}

