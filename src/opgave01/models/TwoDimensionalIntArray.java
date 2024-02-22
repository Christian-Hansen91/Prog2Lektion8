package opgave01.models;

import java.util.Arrays;

public class TwoDimensionalIntArray implements IntFunction{
    private int[][] intArray;

    public TwoDimensionalIntArray(int[][] intArray) {
        this.intArray = intArray;
    }

    public void setValueAt(int row, int column, int value) {
        intArray[row][column] = value;
    }

    public int getValueAt(int row, int column) {
        return intArray[row][column];
    }


    public int sumRow(int row) {
        int sum = 0;
        for (int i : intArray[row]) {
            sum += i;
        }

        return sum;
    }

    public int sumColumn(int column) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i][column];
        }

        return sum;
    }

    public int sumAll() {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                sum += intArray[i][j];
            }
        }

        return sum;
    }

    public void print() {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.printf("[%3d]",+ intArray[i][j]);
            }
            System.out.println();
        }
    }

    public void map(IntFunction function) {
    }


    @Override
    public int apply(int a) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] *= a;
            }
        }

        return a;
    }
}
