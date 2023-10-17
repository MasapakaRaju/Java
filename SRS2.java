import java.util.*;

public class SRS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string :");
        String s = sc.nextLine();
        String s2 = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0)
                s2 += s.charAt(i);
            else if (i == (s.length() - 1)) {
                s2 += count;
                s2 += s.charAt(i);
            } else
                count++;
        }
        System.out.println(s2);
        sc.close();
    }
}
