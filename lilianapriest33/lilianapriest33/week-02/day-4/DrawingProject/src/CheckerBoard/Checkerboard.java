package CheckerBoard;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {

        // Fill the canvas with a checkerboard pattern.

        for (int line = 0; line < 4 ; line++) {
            for (int row1elements = 0; row1elements < 4 ; row1elements++) {

                graphics.setColor(Color.cyan);
                graphics.fillRect(0+row1elements*80, 0+line*80, 40, 40);

            }
            for (int row2elements = 0; row2elements < 4 ; row2elements++) {

                graphics.setColor(Color.cyan);
                graphics.fillRect(40+row2elements*80, 40+line*80, 40, 40);
            }
        }
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

            this.setBackground(Color.PINK);
        }
    }
}