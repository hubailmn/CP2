package me.hubailmn.programming.two.finalexam.question2;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Negative salary.");
            System.out.println("Setting salary to 0.");
            this.salary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Negative salary.");
            System.out.println("Setting salary to 0.");
            this.salary = 0;
        }
    }

    public void displayInfo() {
        System.out.println(String.format("""
                
                Employee Info:
                    Name: %s
                    Salary: $%s
                """, name, salary));
    }
}
