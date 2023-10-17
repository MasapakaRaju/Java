import java.util.*;

public class eligibletovote {
    public static void main(String[] args) {
        System.out.println(eligibilitytovote());
    }

    public static String eligibilitytovote() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if (age <= 18)
            return "not eligible";
        else
            return "eligible";
    }
}