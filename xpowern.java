import java.util.*;

public class xpowern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = powofx(x, n);
        sc.close();
        System.out.println(res);
    }

    public static int powofx(int x, int n) {
        int pow = 1;
        for (int i = 1; i <= n; i++)
            pow = pow * x;
        return pow;
    }

}
