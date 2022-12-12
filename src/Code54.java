import java.util.Scanner;

public class Code54 {


        public static void main(String[] args) {
            Scanner aa = new Scanner(System.in);
            System.out.print("Введите число X:");
            int s = aa.nextInt();
            System.out.print("Остаток:");
            System.out.print((s * s * s / 10) % 7);
        }
    }



