package oops;

class Pen {
    String color;
    String brand;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class penclass {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.brand = "apsara";
        Pen pen2 = new Pen();
        pen2.color = "blue";
        pen2.type = "ballpoint";
        pen2.brand = "naraj";
        pen1.write();
        pen2.write();
        pen1.printColor();
        pen2.printColor();
    }

}
