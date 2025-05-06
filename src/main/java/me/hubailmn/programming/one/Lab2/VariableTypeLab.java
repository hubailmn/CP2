package me.hubailmn.programming.one.Lab2;

public class VariableTypeLab {

    public static void main(String[] args) {

        //Declaring and initiating some variables with different data type.
        int age = 25;
        double height = 1.75;
        boolean isStudent = true;
        char grade = 'A';

        //Printing the values of the variables.
        System.out.println("\nPrinting the values of the variables.");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Final Grade: " + grade);

        //Implicit Type Casting.
        System.out.println("\nImplicit Type Casting.");
        int integerExamGrade = 40;
        double doubleExamGrade = integerExamGrade;

        System.out.println("Integer Exam Grade: " + integerExamGrade);
        System.out.println("Double Exam Grade: " + doubleExamGrade);

        //Explicit Type Casting.
        System.out.println("\nExplicit Type Casting.");
        double doubleAssignment = 5.5;
        int integerAssignment = (int) doubleAssignment;

        System.out.println("Double Assignment: " + doubleAssignment);
        System.out.println("Integer Assignment: " + integerAssignment);

        //Calculating Student Grades.
        System.out.println("\nCalculating Student Grades.");
        double mathExam = 35, scienceExam = 42, englishExam = 20;
        int mathAssignment = 20, lateSubmission = 2;

        double mathScore = mathExam + mathAssignment;
        double scienceScore = scienceExam - lateSubmission;
        double englishScore = englishExam * 4;

        double averageScore = (mathScore + scienceScore + englishScore) / 3.0;
        System.out.println("The average student grade is: " + averageScore);

        //Using Assignment Operators.
        System.out.println("\nUsing Assignment Operators.");
        double arabicScore = 90;

        System.out.println("The Arabic Score is: " + arabicScore);

        arabicScore += 5;
        System.out.println("Value after operation: " + arabicScore);

        arabicScore -= 3;
        System.out.println("Value after operation: " + arabicScore);

        arabicScore *= 2;
        System.out.println("Value after operation: " + arabicScore);

        arabicScore /= 4;
        System.out.println("Value after operation: " + arabicScore);
        System.out.println("The Final Arabic Score is: " + arabicScore);

        //Using Increment and Decrement Operators
        System.out.println("\nUsing Increment and Decrement Operators");
        int count = 0;

        count++;
        System.out.println("Count value after the operation: " + count);

        count--;
        System.out.println("Count value after the operation: " + count);
        System.out.println("The Final Count Value is: " + count);

    }
}
