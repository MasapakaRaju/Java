
import java.util.*;

public class sumofodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int sum = sumofnodd(size);
        System.out.println(sum);
        input.close();
    }

    public static int sumofnodd(int size) {
        int sum = 0;
        for (int i = 1; i <= size; i++)
            if (i % 2 != 0)
                sum = sum + i;
        return sum;
    }
}
