import java.util.Scanner;

public class TicTacToeTest {




        public void main(String[] args) {

            TicTacToe t = new TicTacToe();
            Scanner s = new Scanner(System.in);
            int x,y;
            do
            {
                System.out.println(t.player==TicTacToe.X ?"Ход игрока 1":"Ход игрока 2");
                System.out.println("Выберите координаты вашего хода: y и x");
                x=s.nextInt();
                y=s.nextInt();

                t.putSign(x, y);
                System.out.println(t);
                System.out.println("_____________________________");
                t.displayWinner();

            }while(t.isEmpty);
        }
    }

    class TicTacToe
    {
        public static final int X = 1, O = -1;
        public static final int EMPTY = 0;

        public int player = X;
        private int[][] board = new int[3][3];
        public boolean isEmpty = false;

        public void putSign(int x, int y) {
            if (!(x>=0 && x<=2 && y>=0 && y<=2)) {
                System.out.println("Недопустимое значение:(");
                return;
            }
            if (board[x][y] != EMPTY) {
                System.out.println("Позиция на доске занята");
                return;
            }
            board[x][y] = player;
            player = -player;
        }

        public boolean isWin(int player)
        {
            return ((board[0][0] + board[0][1] + board[0][2] == player*3) ||
                    (board[1][0] + board[1][1] + board[1][2] == player*3) ||
                    (board[2][0] + board[2][1] + board[2][2] == player*3) ||
                    (board[0][0] + board[1][0] + board[2][0] == player*3) ||
                    (board[0][1] + board[1][1] + board[2][1] == player*3) ||
                    (board[0][2] + board[1][2] + board[2][2] == player*3) ||
                    (board[0][0] + board[1][1] + board[2][2] == player*3) ||
                    (board[2][0] + board[1][1] + board[0][2] == player*3));
        }

        public void displayWinner()
        {
            if(isWin(X))
            {
                System.out.println("Игрок номер 1 выиграл!!");
                isEmpty=false;
            }
            else if(isWin(O))
            {
                System.out.println("Игрок номер 2 выиграл!!");
                isEmpty=false;
            }
            else
            {
                if(!isEmpty)
                {
                    System.out.println("Ничья");
                }

            }
        }

        public String toString()
        {
            StringBuilder s = new StringBuilder();
            isEmpty = false;
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    switch(board[i][j])
                    {
                        case X:
                            s.append(" X ");
                            break;
                        case O:
                            s.append(" O ");
                            break;
                        case EMPTY:
                            s.append(" ");
                            isEmpty=true;
                            break;
                    }
                    if(j<2)
                    {
                        s.append("|");
                    }

                }
                if(i<2)
                {
                    s.append("\n-----------\n");
                }
            }
            return s.toString();
        }
    }


