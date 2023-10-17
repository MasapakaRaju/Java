import java.util.Set;
import java.util.Arrays;
import java.io.*;

public class palindromeInt {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(getPalindromes(n)));
    }

    public static int[] getPalindromes(int n) {
        int[] res=
        if (n < 10) {
            set.add(1);
            set.add(2);
            set.add(3);
            set.add(4);
            set.add(5);
            set.add(6);
            set.add(7);
            set.add(8);
            set.add(9);
        } else if (n > 10) {
            set.add(1);
            set.add(2);
            set.add(3);
            set.add(4);
            set.add(5);
            set.add(6);
            set.add(7);
            set.add(8);
            set.add(9);
            for (int i = 10; i <= n; i++)
                if (palind(i))
                    set.add(i);
        }
        int i = 0;
        int[] ans = new int[set.size()];
        try{
        for (int e : set)
            ans[i++] = e;
        }finally{}
        return ans;
    }

    static boolean palind(int n) {
        int digit = n;
        int res = 0;
        while (digit > 0) {
            digit = digit % 10;
            res = res * 10 + digit;
            digit = n / 10;
        }
        return n == res ? true : false;
    }
}
