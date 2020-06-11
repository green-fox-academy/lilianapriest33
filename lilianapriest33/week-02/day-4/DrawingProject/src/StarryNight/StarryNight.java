package StarryNight;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {

        Random random = new Random ();

        for (int i = 0; i < 500; i++) {
            int x = random.nextInt(500);
            int y = random.nextInt(500);
            int w = random.nextInt(8);
            int color = random.nextInt(256);


            graphics.setColor(new Color(color, color, color,150));
            graphics.fillRect(x, y, w, w);
        }
    }
    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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

            setBackground(Color.BLACK);
        }
    }
}
