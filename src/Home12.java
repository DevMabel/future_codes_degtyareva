import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home12{

    static int [] canvas = {0,0,0,
            0,0,0,
            0,0,0};


    public static void main(String[] args){

        boolean b;
        boolean isCurrentX = false;
        do {
            isCurrentX = !isCurrentX;
            drawCanvas();
            System.out.println("ход " + (isCurrentX ? "X" : "O"));
            int n = getNumber();
            canvas[n] = isCurrentX ? 1 : 2;
            b = !isGameOver(n);
            if (isDraw()){
                System.out.println("Напишите");
                return;
            }
        } while (b);
        drawCanvas();
        System.out.println();

        System.out.println("Победителем становиться " + (isCurrentX ? "X" : "O") + "!");
    }

    static int getNumber(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                int n = Integer.parseInt(reader.readLine());
                if (n >= 0 && n < canvas.length && canvas[n]==0){
                    return n;
                }
                System.out.println("Выберите свободную ячейку и введите номер");
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста введите номер ");
            } catch (IOException e) {
            }
        }
    }

    static boolean isGameOver(int n){
        // 0 1 2
        // 3 4 5
        // 6 7 8
        //поиск совпадений по горизонтали
        int row = n-n%3;
        if (canvas[row]==canvas[row+1] &&
                canvas[row]==canvas[row+2]) return true;

        int column = n%3;
        if (canvas[column]==canvas[column+3])
            if (canvas[column]==canvas[column+6]) return true;

        if (n%2!=0) return false;
        if (n%4==0){
            if (canvas[0] == canvas[4] &&
                    canvas[0] == canvas[8]) return true;
            if (n!=4) return false;
        }
        return canvas[2] == canvas[4] &&
                canvas[2] == canvas[6];
    }

    static void drawCanvas(){
        System.out.println("     |     |     ");
        for (int i = 0; i < canvas.length; i++) {
            if (i!=0){
                if (i%3==0) {
                    System.out.println();
                    System.out.println("_____|_____|_____");
                    System.out.println("     |     |     ");
                }
                else
                    System.out.print("|");
            }

            if (canvas[i]==0) System.out.print("  " + i + "  ");
            if (canvas[i]==1) System.out.print("  X  ");
            if (canvas[i]==2) System.out.print("  O  ");
        }
        System.out.println();
        System.out.println("     |     |     ");
    }

    public static boolean isDraw() {
        for (int n : canvas) if (n==0) return false;
        return true;
    }
}

