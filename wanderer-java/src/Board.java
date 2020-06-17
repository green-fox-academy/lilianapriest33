import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    Hero hero;
    int heroX;
    int heroY;
    int WIDTH = 720;
    int HEIGHT = 720;

    public Board() {
        hero = new Hero();
        heroX = 0;
        heroY = 0;
        setPreferredSize(new Dimension(this.WIDTH, this.HEIGHT));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Map map = new Map(graphics);
        hero.currentPosition(graphics);
        //graphics.fillRect(testBoxX, testBoxY, 72, 72);
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
            hero.moveUp(getGraphics());
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.moveDown(getGraphics());
        }  else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.moveLeft(getGraphics());
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.moveRight(getGraphics());
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
    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }
}