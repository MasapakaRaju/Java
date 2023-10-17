import java.io.*;
import java.util.*;

public class WriteCharDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        sc.close();
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write('A');
            writer.write(new char[] { 'B', 'C', 'D' });
            writer.write("java");
            writer.write("[]()!@#$%^&*][");
            writer.write(100);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
