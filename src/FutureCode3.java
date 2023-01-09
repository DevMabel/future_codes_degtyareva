import java.util.Scanner;

public class FutureCode3 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число ");
        x = input.nextInt();
        System.out.println("Число: " + x);
        x = x^3/10;
        x = x%7;
        System.out.println("Остаток: " + x);
    }
}