import java.util.*;

interface AreaCrl {
    void circle();
}

// public class interfaceMethod implements
        AreaCrl {
    Double Area;

    void circle(Double rad) {
        Area = (22 * rad * rad) / 7;
    }

    public static void main(String[] args) {
        interfaceMethod c = new interfaceMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of the circle :");
        Double rad = sc.nextDouble();
        c.circle(rad);
        System.out.println("Area of thr circle : " + c.Area);
        sc.close();
    }

}
