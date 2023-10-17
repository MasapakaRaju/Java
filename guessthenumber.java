import java.util.*;

public class guessthenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;
        do {
            System.out.println("guess the number:");
            userNumber = sc.nextInt();
            if (userNumber == myNumber) {
                System.out.println("wohoooo....... correct");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("your number is too big");
            } else
                System.out.println("your number is too small");
        } while (userNumber >= 0);
        System.out.println("my number :" + myNumber);
        sc.close();
    }

}
