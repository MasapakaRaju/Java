import java.io.*;
import java.util.Scanner;

public class ObjectIDDemo {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("Student-info.dat"));
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("Student-info.dat"));
            Scanner sc = new Scanner(System.in);
            String choice;
            int count = 0;
            do {
                System.out.println("enter Student details :");
                String name = sc.nextLine();
                double avg = sc.nextDouble();
                sc.nextLine();
                String cname = sc.nextLine();
                Student s = new Student(name, avg);
                s.setCourse(new Course(cname));
                objOut.writeObject(s);
                count++;
                System.out.println("do u want to continue (y/n):");
                choice = sc.nextLine();
            } while (choice.equals("y"));
            for (int i = 0; i < count; i++)
                System.out.println(objIn.readObject());
            objIn.close();
            objOut.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}