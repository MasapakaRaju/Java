import java.util.*;

public class searcharray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];
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
        System.out.print("enter a element to search:");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (x == array[i][j]) {
                    System.out.println("element " + x + " is at " + "[" + i + "]" + "[" + j + "]" + "index");
                    break;
                }
            }
        }
        sc.close();
    }
}
