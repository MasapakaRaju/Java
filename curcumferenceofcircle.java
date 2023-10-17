import java.util.*;

public class curcumferenceofcircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println("circumference of " + radius + " radius: " + circumference(radius));
        input.close();
    }

    public static Double circumference(Double rad) {

        return 2 * 3.14 * rad;

    }
}
