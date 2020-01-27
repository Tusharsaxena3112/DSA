package dsaLab3;

public class Employee {
    private int identification;
    private String name;
    private int age;

    public Employee(int identification, String name, int age) {
        this.identification = identification;
        this.age = age;
        this.name = name;
    }

    public int getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
