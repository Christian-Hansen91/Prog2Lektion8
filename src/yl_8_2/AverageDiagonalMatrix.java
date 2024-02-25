package yl_8_2;

public class AverageDiagonalMatrix {

    public static void main(String[] args) {
        double[][] matrix =
                {{1, 2, 3, 4},
                {5, 6.5, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(averageMajorDiagonal(matrix));
    }

    public static double averageMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum / (double) matrix.length;
    }
}
