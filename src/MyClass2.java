import java.util.Scanner;
// Это игра в крестики нолики. Задачи:
// 1: добавить проверку, что можно ставить крестик/нолик в выбранную ячейку | Готово
// 2: добавить проверку на то, что игра закончена - вывести, кто победил | Готово
// 3: добавить проверку на ничью | Готово
// усложненные варианты (по желанию):
// усложненный вариант на 5+ - сделать вместо второго игрока бота
// усложненный вариант на 5++++ - разделить код на несколько методов (функций)
public class MyClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] gameField = new char[9];
        boolean gameOver = false;
        for (int i=0; i<9; i++) {
            gameField[i] = ' ';
        }
        char LastTurn = '0';
        int Actions = 0;
        char currentTurn = 'X';
        while (!gameOver) {
            System.out.println(" 1   2   3");
            for (int i = 0; i < 9; i++) {
                System.out.print("[" + gameField[i] + "] ");
                if ((i + 1) % 3 == 0) {
                    System.out.println();
                }
            }
            System.out.println(" 7   8   9");
            System.out.println();
            for (int i = 0; i<=2; i++) {
                int b = i + 3;
                int c = i + 6;
                if (gameField[i] == LastTurn && gameField[b] == LastTurn && gameField[c] == LastTurn) {
                    System.out.println("Победил: " + LastTurn);
                    gameOver = true;
                    Actions = 10;
                }
            }
            for (int i = 0; i<=6; i += 3) {
                int b = i + 1;
                int c = i + 2;
                if (gameField[i] == LastTurn && gameField[b] == LastTurn && gameField[c] == LastTurn) {
                    System.out.println("Победил: " + LastTurn);
                    gameOver = true;
                    Actions = 10;
                }
            }
            for (int i = 0; i<=1; i ++) {
                if (i == 0) {
                    if (gameField[0] == LastTurn && gameField[4] == LastTurn && gameField[8] == LastTurn) {
                        System.out.println("Победил: " + LastTurn);
                        gameOver = true;
                        Actions = 10;
                    }
                } else {
                    if (gameField[2] == LastTurn && gameField[4] == LastTurn && gameField[6] == LastTurn) {
                        System.out.println("Победил: " + LastTurn);
                        gameOver = true;
                        Actions = 10;
                    }
                }
            }
            if (Actions >= 9) {
                if (Actions == 9) {
                    System.out.println("Все возможные ходы закончились . Ничья!");
                    gameOver = true;
                }
            } else {
                System.out.println("Выберите, куда поставить " + currentTurn + " - цифра от 1 до 9: ");
                int chosenCell = scanner.nextInt();
                int chosenIndex = chosenCell - 1;
                if (gameField[chosenIndex]==' ') {
                    System.out.println("Игрок поставил " + currentTurn + " в клетку " + chosenCell);
                    System.out.println();
                    gameField[chosenIndex] = currentTurn;
                    if (currentTurn == 'X') {
                        LastTurn = currentTurn;
                        currentTurn = '0';
                        Actions += 1;
                    } else {
                        LastTurn = currentTurn;
                        currentTurn = 'X';
                        Actions += 1;
                    }
                } else {
                    System.out.println("Вы не сможете поставить  " + currentTurn + " в выбранную вами клетку.");
                    System.out.println();
                }
            }
        }
    }
}
