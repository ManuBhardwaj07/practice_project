class Employee {
    double baseSalary = 10000;

    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    @Override
    double calculateSalary() {
        return baseSalary + 5000; // Manager gets bonus
    }
}

class Developer extends Employee {
    @Override
    double calculateSalary() {
        return baseSalary + 3000; // Developer gets bonus
    }
}

class Intern extends Employee {
    @Override
    double calculateSalary() {
        return baseSalary / 2; // Intern gets half
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        Employee e3 = new Intern();

        System.out.println("Manager Salary: " + e1.calculateSalary());
        System.out.println("Developer Salary: " + e2.calculateSalary());
        System.out.println("Intern Salary: " + e3.calculateSalary());
    }
}
