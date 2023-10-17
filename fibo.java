import java.util.*;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1;
        System.out.print(a + " ");
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                int temp = b;
                b = b + a;
                a = temp;
            }
        }
    }
}
