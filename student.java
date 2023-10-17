package oops;

class St {
    String name;
    int age;
    String phone;

    public void printInfo() {
        System.out.println("name :" + this.name);
        System.out.println("age  :" + this.age);
        System.out.println("phone:" + this.phone);
    }
}

public class student {
    public static void main(String[] args) {
        St s1 = new St();
        s1.name = "raju";
        s1.age = 19;
        s1.phone = "9515281863";
        s1.printInfo();
        St s2 = new St();
        s2.name = "aman";
        s2.age = 24;
        s2.phone = "254841878";
        s2.printInfo();
    }
}
