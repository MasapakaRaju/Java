import java.io.*;
import java.util.*;

public class ReadCharDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the file name : ");
        String fileName = sc.next();
        sc.close();
        try {
            FileReader fr = new FileReader(fileName);
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found..");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
