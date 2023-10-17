//import java.util.*;
public class avgof3 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int avg = avgval(arr, 3);
        System.out.println(avg);
    }

    public static int avgval(int arr[], int size) {
        int sum = 0;
        for (int i = 0; i < size; i++)
            sum = sum + arr[i];
        sum = sum / size;
        return sum;
    }
}