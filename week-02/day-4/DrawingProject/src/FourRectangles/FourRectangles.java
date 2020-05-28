package FourRectangles;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
    public static void mainDraw(Graphics graphics){

        Random random = new Random();
        for (int i = 1; i <= 4; i++) {

            int x = random.nextInt(450);
            int y = random.nextInt(450);

            int width = random.nextInt(500);
            int height = random.nextInt(500);

            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);

            graphics.fillRect(x, y, width, height);
            graphics.setColor(new Color( r, g, b,150));
        }
    }
    // draw four different size and color rectangles.
    // avoid code duplication.
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