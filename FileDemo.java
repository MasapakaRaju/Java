import java.io.*;
import java.util.*;

public class FileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        sc.close();
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File exists..");
            System.out.println("path : " + file.getAbsolutePath());
            System.out.println("R/W : " + file.canRead() + " , " + file.canWrite());
            System.out.println("File name : " + file.getName());
            if (fileName.endsWith("txt")) {
                System.out.println("text file..");
            }
        } else {
            System.out.println("File doesn't exist..");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("error while creating in file.");
            }
            System.out.println("file created..");
        }
    }
}