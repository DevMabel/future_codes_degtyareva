import java.util.Scanner;

public class HomeworkFive {


        public static int answercount = 0;

        public static boolean gameOver = false;

        public static int answer;

        public static void main(String[] args) {

            String[] q = new String[5];

            q[0] = "Вы зашли в темную комнату. В темноте слышен пугающий шорох. Ваши действия?";
            q[1] = "Выйти из комнаты";
            q[2] = "Включить свет";
            q[3] = "Шагнуть навстречу зловещему звуку";
            q[4] = "Крикнуть что есть сил 'уходи отсюда!'";

            int light = 0;

            while (!gameOver) {
                answercount ++;

                System.out.println(q[0]);
                for (int i = 1; i < 5; i++) {
                    System.out.println(i + ": " + q[i]);
                }

                System.out.print("Ваши действия: ");

                Scanner supperscaner = new Scanner(System.in);
                answer = supperscaner.nextInt();

                if (answer == 1) {
                    light = 0;
                    System.out.println("Разумно и безопасно. Вы остались целы, хоть и не узнали, что это было");
                    gameOver = true;
                }

                if (answer == 2) {
                    light++;
                    if (light == 5){
                        System.out.println("В комнате всего навсего говорящий попугай");
                        gameOver = true;
                    } else {
                        q[0] = "Выключатель предательски треснул. Свет не включился, пугающий шорох все ближе";
                        q[2] = "Еще раз попробовать включить свет {для самых одаренных}";
                    }
                }

                if (answer == 3 || answer == 4) {
                    light = 0;
                    if (q[0].endsWith("громче")) { // Если вопрос заканчивается на "... громче"
                        q[0] = q[0] + " и еще громче"; // Добавим к нему и еще громче
                    } else {
                        q[0] = "Звук становится громче и громче";
                    }
                }

                if (answercount>=10) {
                    System.out.println("Вы сделали больше шагов чем можно было. Игра окончена.");
                    gameOver = true;
                }
            }
        }

    }
