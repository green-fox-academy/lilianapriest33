package Arrays.Matrix;

public class Matrix {
    public static void main(String[] args) {

        int[][] map = new int[4][4];

        int a = 0;
        int b = 1;

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map.length; col++) {
                if (row == col) {
                    System.out.print(b + " ");
                } else {
                    System.out.print(a + " ");
                }
            }
            System.out.println();
        }
    }
}

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output