package CenteredBoxes;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {

    public static void mainDraw(Graphics graphics){
        int[] x = {50 , 150 , 250};

        for (int i = 0; i < x.length ; i++) {
            drawSquare(x[i],graphics);
        }
    }

    public  static void drawSquare( int x, Graphics graphics) {
        graphics.drawRect((WIDTH / 2) - (x / 2), (HEIGHT / 2) - (x / 2), x, x);
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
