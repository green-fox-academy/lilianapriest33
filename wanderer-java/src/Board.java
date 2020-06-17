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

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Map map = new Map(graphics);
    }

    // To be a KeyListener the class needs to have these 3 methods in it
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
}