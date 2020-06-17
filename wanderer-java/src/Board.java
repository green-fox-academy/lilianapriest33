import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    int WIDTH = 720;
    int HEIGHT = 720;

    public Board() {
        testBoxX = 0;
        testBoxY = 0;
        setPreferredSize(new Dimension(this.WIDTH, this.HEIGHT));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Map map = new Map(graphics);
        graphics.fillRect(testBoxX, testBoxY, 72, 72);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 72;
        }  else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            testBoxX -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            testBoxX += 72;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);
    }
}