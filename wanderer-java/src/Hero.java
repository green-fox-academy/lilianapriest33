import java.awt.*;
import java.util.HashMap;

public class Hero {
    private int heroX;
    private int heroY;
    private String heroUp = "C:/Users/Viktória/Documents/GREENFOX/wanderer-java/img/gif/hero-up.gif";
    private String heroDown = "C:/Users/Viktória/Documents/GREENFOX/wanderer-java/img/gif/hero-down.gif";
    private String heroRight = "C:/Users/Viktória/Documents/GREENFOX/wanderer-java/img/gif/hero-right.gif";
    private String heroLeft = "C:/Users/Viktória/Documents/GREENFOX/wanderer-java/img/gif/hero-left.gif";
    private String currentProfile = heroDown;
    private PositionedImage heroPos;

    public Hero() {
        heroX = 0;
        heroY = 0;
        heroPos = new PositionedImage(currentProfile, heroX, heroY);
    }

    public void currentPosition(Graphics graphics) {
        heroX = getHeroX();
        heroY = getHeroY();
        currentProfile = getCurrentProfile();
        heroPos = new PositionedImage(currentProfile, heroX, heroY);
        heroPos.draw(graphics);
    }

    public void moveUp(Graphics graphics) {
        if (heroY != 0) {
            heroY -= 720 / 10;
        } else {
            heroY -= 0;
        }
        this.currentProfile = heroUp;
    }

    public void moveDown(Graphics graphics) {
        if (heroY != 720 - 72) {
            heroY += 720 / 10;
        } else {
            heroY += 0;
        }
        this.currentProfile = heroDown;
    }

    public void moveRight(Graphics graphics) {
        if (heroX != 720 - 72) {
            heroX += 720 / 10;
        } else {
            heroX += 0;
        }
        this.currentProfile = heroRight;
    }

    public void moveLeft(Graphics graphics) {
        if (heroX != 0) {
            heroX -= 720 / 10;
        } else {
            heroX -= 0;
        }
        this.currentProfile = heroLeft;
    }

    public int getHeroX() {
        return heroX;
    }

    public void setHeroX(int heroX) {
        this.heroX = heroX;
    }

    public int getHeroY() {
        return heroY;
    }

    public void setHeroY(int heroY) {
        this.heroY = heroY;
    }

    public String getCurrentProfile() {
        return currentProfile;
    }
}