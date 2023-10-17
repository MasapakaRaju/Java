import java.util.Scanner;

public class readarray {
    public static void main(String[] args) {
        int len_i;
        int len_j;
        Scanner input_i = new Scanner(System.in);
        System.out.print("enter the size of array=");
        len_i = input_i.nextInt();
        Scanner input_j = new Scanner(System.in);
        System.out.print("enter the size of array=");
        len_j = input_j.nextInt();
        int[][] arr = new int[5][5];
        System.out.println("enter the elements of array=");
        for (int i = 0; i < len_i; i++)
            for (int j = 0; j < len_j; j++)
                arr[i][j] = input_j.nextInt();
        for (int i = 0; i < len_i; i++) {
            System.out.println("elements of " + i);
            for (int j = 0; j < len_j; j++)
                System.out.print(arr[i][j] + " ");
            if (i < len_i - 1)
                System.out.print("\n");
        }
        System.out.println("\n" + "sum of arrays=" + sum(arr));
        input_i.close();
        input_j.close();
    }

    public static int sum(int[][] arr) {
        int total = 0;
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                total = total + arr[row][col];
        return total;
    }
}