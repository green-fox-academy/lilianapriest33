import java.awt.*;

public class Map {
    int[][] mapLayout = {
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}
    };
    String floor = "C:/Users/Viktória/Documents/GREENFOX/wanderer-java/img/floor.png";
    String wall = "C:/Users/Viktória/Documents/GREENFOX/wanderer-java/img/wall.png";

    public Map(Graphics graphics) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.mapLayout[j][i] == 0) {
                    PositionedImage floor = new PositionedImage(this.floor, i * 72, j * 72);
                    floor.draw(graphics);
                } else {
                    PositionedImage wall = new PositionedImage(this.wall, i * 72, j * 72);
                    wall.draw(graphics);
                }
            }
        }
    }
}