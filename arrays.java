import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] array = new int[row][col];
        int[][] array2 = new int[row2][col2];
        System.out.println("enter " + row + "x" + col + " numbers:");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                array[i][j] = sc.nextInt();
        System.out.println("matrix A as follows:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        System.out.println("enter " + row2 + "x" + col2 + " numbers:");
        for (int k = 0; k < row2; k++)
            for (int j = 0; j < col2; j++)
                array2[k][j] = sc.nextInt();
        sc.close();
        System.out.println("matrix B as follows:");
        for (int k = 0; k < row2; k++) {
            for (int j = 0; j < col2; j++)
                System.out.print(array2[k][j] + " ");
            System.out.println();
        }
        prod(array, row, col, array2, row2, col2);

    }

    public static void prod(int A[][], int r1, int c1, int B[][], int r2, int c2) {
        int prod[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < c1; k++)
                    prod[i][j] = prod[i][j] + A[i][k] * B[k][j];
            }
        for (int k = 0; k < r1; k++) {
            for (int j = 0; j < c2; j++)
                System.out.print(prod[k][j] + " ");
            System.out.println();
        }
    }
}