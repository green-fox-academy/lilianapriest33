package IMiddleLines;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class IMiddleLines {
    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.RED);
        graphics.drawLine(0, HEIGHT / 2, WIDTH, HEIGHT / 2);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(HEIGHT /2, 0, HEIGHT /2, HEIGHT);
    }

    // draw a red horizontal line to the canvas' middle.
    // draw a green vertical line to the canvas' middle.
    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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