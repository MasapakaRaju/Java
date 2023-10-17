import java.util.*;

public class userlimitinput {
    public static void main(String[] args) {
        int negative = 0, positive = 0, zero = 0;
        System.out.println("enter 1 to continue 0 to stop");
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        while (1 == c) {
            System.out.println("enter your number:");
            int in = input.nextInt();
            if (in == 0)
                zero++;
            else if (in > 0)
                positive++;
            else
                negative++;
            System.out.println("enter 1 to continue 0 to stop");
            c = input.nextInt();
        }
        System.out.println("positive=" + positive);
        System.out.println("zeros=" + zero);
        System.out.println("negative=" + negative);
        input.close();
    }

}
