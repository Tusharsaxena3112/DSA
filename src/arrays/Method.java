package arrays;

class XYZ {
    private StringBuilder id;
    private String name;
    private int age;

    XYZ(int age, String name) {
        this.age = age;
        this.name = name;
        id = new StringBuilder();
        this.id.append(age).append(name);
    }
}

public class Method {
    public static void main(String[] args) {
        XYZ s = new XYZ(40, "Ram");
    }
}
