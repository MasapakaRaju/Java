import java.util.*;

public class srsWipro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "wipro12345";
        String nums = "";
        String str = "";

        int i = 0;
        System.out.println("1.numbers" + "\n" + "2.string" + "\n" + "enter your choice : ");
        int choice = sc.nextInt();
        sc.close();
        switch (choice) {
            case 1:
                while (i < fileName.length()) {
                    if (fileName.charAt(i) > 'A')
                        str = str + fileName.charAt(i);
                    i++;
                }
                System.out.println(str);
                break;
            case 2:
                while (i < fileName.length()) {
                    if (fileName.charAt(i) <= '9')
                        nums = nums + (char) fileName.charAt(i);
                    i++;
                }
                System.out.println(nums);
                break;
            default:
                System.out.println("invalid choice");
        }

    }
}
