import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;
public class Home2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¬ведите с клавиатуры регион из списка https://gist.github.com/silnov-v1/ce2a23e47201022691c9827d9c879d83 : ");
        String text = scan.next();
        ZonedDateTime nowButNotThere = ZonedDateTime.now(ZoneId.of(text));
        System.out.println(nowButNotThere);
    }
}
