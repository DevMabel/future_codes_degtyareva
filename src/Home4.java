import java.time.LocalDateTime;
public class Home4 {
    public static void main(String[] args) {
        LocalDateTime nowT = LocalDateTime.now();
        LocalDateTime endT = nowT.plusHours(10);
        while(nowT.isBefore(endT)) {
            nowT = nowT.plusMinutes(45);
            System.out.println(nowT);
        }
    }
}