package Arrays.Colors;

public class Colors {
    public static void main(String[] args) {

        String[] green = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] red = {"orange red", "red", "tomato"};
        String[] pink = {"orchid", "violet", "pink", "hot pink"};

        String[][] colors = {green, red, pink};

        for (int row = 0; row < colors.length; row++) {
            for (int col = 0; col < colors[row].length; col++) {
                System.out.print(colors[row][col] + ", ");
            }
            System.out.println();
        }
    }
}
// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`