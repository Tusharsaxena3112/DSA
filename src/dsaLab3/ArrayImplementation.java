package dsaLab3;

public class ArrayImplementation implements ArrayAdt<Employee> {
    //    private int length;
    private Employee[] employees;
    private int elementCount = 0;

    public ArrayImplementation(int length) {
        employees = new Employee[length];
    }

    @Override
    public void insert(Employee employee) {
        if (elementCount < employees.length) {
            employees[elementCount] = employee;
            elementCount++;
        } else {
            System.out.println("Employees full.");
        }

    }


    public void display(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getIdentification());
        }
    }

    @Override
    public Employee[] sort() {
        Employee temp;
        for (int i = employees.length - 1; i >= 1; i--) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[j].getIdentification() < employees[j + 1].getIdentification()) {
                    temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
        return employees;
    }

}
