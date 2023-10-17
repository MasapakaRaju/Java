
//Complete this code or write your own from scratch
import java.util.*;

class Person {
    String name;
    int phoneNo;

    Person(String s, int ph) {
        name = s;
        phoneNo = ph;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + "=" + phoneNo;
    }
}

public class PersonHackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Person[] p = new Person[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int ph = sc.nextInt();
            p[i] = new Person(name, ph);
            sc.nextLine();
        }
        String[] find = new String[3];
        for (int i = 0; i < n; i++) {
            find[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (find[i].equals(p[i].getName())) {
                    System.out.println(p[i].toString());
                    break;
                } else if (j == 2) {
                    System.out.println("Not found");
                    break;
                } else
                    continue;
            }
        }
        sc.close();
    }

}