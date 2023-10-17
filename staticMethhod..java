import java.util.*;

class staticMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        Double rad = sc.nextDouble();
        Double area = (22 * rad * rad) / 7;
        System.out.println("Area of the circle : " + area);
        sc.close();
    }
}