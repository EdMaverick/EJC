package ex3;

public class Starter {

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(5, 5);
        Matrix matrix2 = new Matrix(5, 5);

        for (int i = 0; i < 5; i++) {
            double num = 1;
            for (int j = 0; j < 5; j++) {
                matrix1.array[i][j] = num;
                num++;
            }
        }

        for (int i = 0; i < 5; i++) {
            double num = 2;
            for (int j = 0; j < 5; j++) {
                matrix2.array[i][j] = num;
                num++;
            }
        }

        System.out.println("Матрица 1:");
        matrix1.printArray();
        System.out.println("Матрица 2:");
        matrix2.printArray();

        System.out.println("Результат сложения 1 и 2 матриц:");
        matrix1.array = matrix1.addToArray(matrix2.array);
        matrix1.printArray();

        System.out.println("Результат умножения матрицы 2 на 2:");
        matrix2.array = matrix2.multiplyByNumber(2);
        matrix2.printArray();

        System.out.println("Умножение первого результата на второй:");
        matrix1.array = matrix1.multiplyByArray(matrix2.array);
        matrix1.printArray();
        System.out.println();
    }
}
