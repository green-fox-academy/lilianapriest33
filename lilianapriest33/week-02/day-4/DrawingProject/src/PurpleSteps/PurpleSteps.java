package PurpleSteps;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics){

        int x= 0;
        int y = 0;
        // square (x, y, graphics);

        for (int i = 0; i < 21; i++) {
            square(x, y, graphics);
            y = y+15;
            x = x+15;
        }
    }
    public static void square (int x, int y, Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fillRect(x, y, 15, 15);
        g.setColor(Color.black);
        g.drawRect(x, y, 15, 15);
    }

    // Don't touch the code below
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
