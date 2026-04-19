class Employee {
    String name = "kiya";
    String department = "IT";

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize = 5;

    // Overriding method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        e.displayDetails();
        System.out.println();
        m.displayDetails();
    }
}
