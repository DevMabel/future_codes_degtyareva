
    import java.util.Scanner;
    public class FuCode3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число  ");
            double x = scan.nextInt();
            double y = Math.pow(x, 3);
            double i = y / 10;
            double mod = i % 7;
            System.out.println(mod);
        }
    }


