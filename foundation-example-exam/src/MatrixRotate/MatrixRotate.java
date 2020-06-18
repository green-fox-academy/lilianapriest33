package MatrixRotate;

import java.util.Arrays;

public class MatrixRotate {
    public static void main(String[] args) {

        int[][] inputMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(rotateMatrix(inputMatrix)));
    }

    public static int[][] rotateMatrix(int[][] inputMatrix) {

        int[][] rotatedMatrix = new int[inputMatrix.length][inputMatrix.length];
        int x = 0;
        int y = 0;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = inputMatrix.length - 1; j > -1; j--) {
                rotatedMatrix[y][x] = inputMatrix[j][i];
                x++;
            }
            x = 0;
            y++;
        }

        return rotatedMatrix;
    }
    
}
