import java.io.Serializable;

public class Course implements Serializable {
    private int id;
    private static int nextId = 2000;
    private String name;

    public Course() {
        id = nextId++;
    }

    public void setCName(String name) {
        this.name = name;
    }

    public Course(String name) {
        id = nextId++;
        this.name = name;
    }

    public String getCourse() {
        return "{ id : " + id + "\n" + " name :" + name + "}";
    }
}
