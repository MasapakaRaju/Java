import java.io.*;

// import java.util.*;
public class ReaderDemoAssignment {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.print("enter the file name : ");
        // String fileName=sc.next();
        String nums = "";
        String str = "";
        // sc.close();
        try {
            FileReader fr = new FileReader("sample.txt");
            int ch = 0;
            int choice = 2;

            switch (choice) {
                case 1:
                    while ((ch = fr.read()) != -1) {
                        if (ch > 'A')
                            str = str + (char) ch;
                    }
                    System.out.println(str);
                    break;
                case 2:
                    while ((ch = fr.read()) != -1) {
                        if (ch <= 9)
                            nums = nums + ch;
                    }
                    System.out.println(nums);
                    break;
                default:
                    System.out.println("invalid choice");
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
