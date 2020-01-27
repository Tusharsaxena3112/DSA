package dsaLab3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        ArrayImplementation arrayImplementation = new ArrayImplementation(3);
        arrayImplementation.insert(new Employee(1, "Tushar", 18));
        arrayImplementation.insert(new Employee(2, "Tanishq", 17));
        arrayImplementation.insert(new Employee(3, "Taa", 16));

        employees = arrayImplementation.sort();

        arrayImplementation.display(employees);
    }
}
