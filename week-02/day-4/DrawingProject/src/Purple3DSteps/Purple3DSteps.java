package Purple3DSteps;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Purple3DSteps {
    public static void mainDraw(Graphics graphics){

        int x= 1;
        int y = 1;

        for (int i = 0; i < 5; i++) {
            square(x += y ,y += 10, graphics);
        }
    }
    public static void square (int x, int y, Graphics g) {

        g.setColor(Color.MAGENTA);
        g.fill3DRect(x, y, x, y,true);
        g.setColor(Color.black);
        g.drawRect(x, y, x, y);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
