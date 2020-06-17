package SymmetricMatrix;

public class SymmetricMatrix {

    public static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] != matrix[j][i])
                    return false;
            }
        return true;
    }
    public static void main (String[] args) {
        int[][] matrix = { { 1, 3, 5 }, { 3, 2, 4 }, { 5, 4, 1 } };
        if (isSymmetric (matrix))
            System.out.println("true");
        else
            System.out.println("false");
    }
}