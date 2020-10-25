package ex3;

public class Matrix {

    private int rows;
    private int columns;

    double[][] array;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        array = new double[this.rows][this.columns];
    }

    // 1)
    double[][] addToArray(double[][] arr) {
        double[][] result = array;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] += arr[i][j];
            }
        }
        return result;
    }

    // 2)
    double[][] multiplyByNumber(int number) {
        double[][] result = array;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] *= number;
            }
        }
        return result;
    }

    // 3)
    void printArray() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("[" + array[i][j] + "] ");
                if(j == columns -1) System.out.println();
            }
        }
    }

    // 4)
    double[][] multiplyByArray(double[][] arr) {
        double[][] result = array;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] *= arr[i][j];
            }
        }
        return result;
    }
}
