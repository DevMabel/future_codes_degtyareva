import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.event.MouseInputListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

// ################ код ниже вам интересен ##################

class MyForm extends JPanel implements MouseInputListener, KeyListener {
    int ovalX =25; // координата Х овала
    int ovalY =25 ; // координата Y овала
    int j;
    private long startTime = System.currentTimeMillis();

    /*
    Насколько быстро кликнули на шарик.
    1. Уметь определять, попал ли клик в шарик +
    2. Уметь считать, сколько времени прошло с запуска программы +
    3. Уметь выводить пользователю результат
     */

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

        if (j < 10) {

            int xCoordinate = mouseEvent.getX();
            int yCoordinate = mouseEvent.getY();
            System.out.println("Мышку нажали в точке х:" + xCoordinate + " y:" + yCoordinate);
            int distanceFromClickToCenterOfBall_x = Math.abs(xCoordinate - ovalX);
            int distanceFromClickToCenterOfBall_y = Math.abs(yCoordinate - ovalY);

            if (Math.sqrt(distanceFromClickToCenterOfBall_x * distanceFromClickToCenterOfBall_x
                    + distanceFromClickToCenterOfBall_y * distanceFromClickToCenterOfBall_y) > 25
            ) {
                System.out.println("не попал");
            } else {
                System.out.println(distanceFromClickToCenterOfBall_x);
                System.out.println(distanceFromClickToCenterOfBall_y);
                long currentTime = System.currentTimeMillis();

                ovalX += 25;
                ovalY += 25;
                while (ovalX > 275) ;
                while (ovalY > 275) ;

                JOptionPane.showMessageDialog(null, (float) (currentTime - startTime) / 1000 + "сек");
                startTime = System.currentTimeMillis();
                j++;
            }   }

        else JOptionPane.showMessageDialog(null, "конец игры");

        repaint();
    }


    @Override
    public void keyPressed(KeyEvent keyEvent) {
        // тут код, который происходит при нажатии на кнопку клавиатуры
        System.out.println("Нажата клавиша с кодом " + keyEvent.getKeyCode());

        // сюда писать ваш творческий код

        repaint();
    }

    // ################ код ниже пока не трогаем. Только если вы уже чувствуете свою Силу :) ##################

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(ovalX - 25, ovalY - 25, 50, 50);
    }

    private void showGui() {
        setPreferredSize(new Dimension(800, 600));
        JFrame frame = new JFrame("Программируем");
        frame.addKeyListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(this, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MyForm myForm = new MyForm();
        myForm.addMouseListener(myForm);
        myForm.showGui();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        // что будет происходить при отпускании кнопки мыши
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        // что будет происходить во входе курсора на формы

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        // что будет происходить в выходе курсора из формы
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        // что будет происходить в перетаскивании мышкой
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        // что будет происходить при движении мышкой
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}