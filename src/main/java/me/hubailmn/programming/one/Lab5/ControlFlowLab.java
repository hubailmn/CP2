package me.hubailmn.programming.one.Lab5;

public class ControlFlowLab {

    public static void main(String[] args) {

        // step 1 & step 2
        int age = 25;

        if (age >= 18) {
            if (age < 30) {
                System.out.println("You are a young adult");
            } else {
                System.out.println("You are an adult");
            }
        } else {
            System.out.println("You are under 18 years old");
        }

        // step 3

        boolean isSunny = false, isRainy = true, isWarm = false;

        if (!isWarm && isRainy) {
            System.out.println("It’s cold and rainy");
        } else if (isWarm && isSunny) {
            System.out.println("“It’s warm and sunny");
        } else {
            System.out.println("The weather conditions are as expected");
        }

        // step 4
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade!");
                break;
        }


    }

}
