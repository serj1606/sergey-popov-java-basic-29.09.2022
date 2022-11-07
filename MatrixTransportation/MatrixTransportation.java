package MatrixTransportation;

import java.util.Scanner;

public class MatrixTransportation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the row number in the array");
        int n = scanner.nextInt();
        System.out.println("you enter a number " + n);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter the column number in the array");
        int m = scanner1.nextInt();
        System.out.println("you enter a number " + m);
        int[][] result = getResult(n, m);

        printMatrix(result);
        System.out.println("-------------------------------");
        int[][] trans = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                trans[k][i] = result[i][k];
            }
        }
        printMatrix(trans);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int callum : row) {
                System.out.print(callum + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getResult(int n, int m) {
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = (int) (Math.random() * 10);
            }
        }

        return result;
    }
}
