package PositionSquare;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
    public static void mainDraw(Graphics graphics){

        int x= 50;
        int y = 50;
        // square (x, y, graphics);

        for (int i = 0; i < 3; i++) {
            square(x, y, graphics);
            y = y+60;
            x = x+60;
        }
    }
    public static void square (int x, int y, Graphics g) {
        g.drawRect(x, y, 50, 50);
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
