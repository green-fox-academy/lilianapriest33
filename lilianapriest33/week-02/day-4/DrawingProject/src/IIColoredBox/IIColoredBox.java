package IIColoredBox;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class IIColoredBox {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH / 4, HEIGHT / 4, WIDTH - 160, HEIGHT - 480);

        graphics.setColor(Color.BLUE);
        graphics.drawLine(WIDTH -160, HEIGHT -480, WIDTH - 160, HEIGHT - 160);

        graphics.setColor(Color.ORANGE);
        graphics.drawLine(WIDTH -160, HEIGHT -160, WIDTH - 480, HEIGHT - 160);

        graphics.setColor(Color.PINK);
        graphics.drawLine(WIDTH -480, HEIGHT -160, WIDTH /4, HEIGHT /4);
    }

    // Draw a box that has different colored lines on each edge.
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