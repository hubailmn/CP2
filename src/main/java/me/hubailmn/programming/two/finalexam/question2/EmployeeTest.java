package me.hubailmn.programming.two.finalexam.question2;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee em1 = new Employee("Fasial", 100000);

        em1.displayInfo();

        em1.setSalary(-999);

        em1.displayInfo();

    }
}
