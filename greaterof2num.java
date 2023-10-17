import java.util.*;

public class greaterof2num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int max = maxof2(x, y);
        System.out.println("max of two numbers:" + max);
        input.close();
    }

    public static int maxof2(int x, int y) {
        int max;
        if (x < y)
            max = y;
        else
            max = x;
        return max;
    }
}
