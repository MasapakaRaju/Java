import java.util.*;
import java.text.*;

public class currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat usnf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat innf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        NumberFormat Chinaf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat Francef = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usnf.format(payment));
        System.out.println("India: " + innf.format(payment));
        System.out.println("China: " + Chinaf.format(payment));
        System.out.println("France: " + Francef.format(payment));
    }
}