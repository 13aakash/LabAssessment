class Employee {
    String name;
    double salary;

    void setDetails(String n, double s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: $" + salary);
    }
}

public class MultipleObjectsDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setDetails("Alice", 50000);
        e2.setDetails("Bob", 60000);

        e1.display();
        e2.display();
    }
}
