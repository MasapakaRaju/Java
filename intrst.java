import java.util.*;
import java.io.*;

class intrst {

    public static void main(String args[]) {

        // Write code here
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        String a = sc.next();
        sc.close();

        double res = basic + 0.20 * basic + 0.50 * basic - 0.11 * basic;
        System.out.println(res);
        if ('A' == a.charAt(0)) {
            System.out.println(Math.round(res + 1700));
        } else if ('B' == a.charAt(0))
            System.out.println(Math.round(res + 1500));
        else
            System.out.println(Math.round(res + 1300));
    }

}