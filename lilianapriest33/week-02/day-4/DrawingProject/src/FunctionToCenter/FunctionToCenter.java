package FunctionToCenter;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {

        Random random = new Random();
        int a = 40;
        for (int i = 0; i <= 320; i+=a) {
            for (int j = 0; j <= 320; j+=a) {
                int r = random.nextInt(256);
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                graphics.setColor(new Color(r, g, b));

                if (i==0||j==0||i==320||j==320)
                    drawLine(i,j,graphics);
            }
        }
    }

    public static void drawLine (int x, int y, Graphics graphics){
        graphics.drawLine(x,y,320/2,320/2);
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
