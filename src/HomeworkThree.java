import java.util.Scanner;

//выводить значение поэтапно. Ваше число в степени умноженное на н. Остаток от деления ваш
public class HomeworkThree {
    public static void main(String[] args) {
        System.out.println("введите число ");
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        System.out.printf("ваше  число : %d \n", x);
        in.close();
        double e = (Math.pow(x,3))/10;
        System.out.println(e);
        double v = e % 7;
        System.out.println("результат: ");
        System.out.println(v);
      }
    }

