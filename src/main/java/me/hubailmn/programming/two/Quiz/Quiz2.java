package me.hubailmn.programming.two.Quiz;

import java.util.Scanner;

// Name: محمد نضال مكي آل حبيل
public class Quiz2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an even number: ");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            System.out.println("Invalid input! Please Enter an even number.");
            return;
        }

        int sum = sumOfEven(number);
        System.out.println(sum);
        System.out.println("The sum of all even numbers of \"" + number + "\" is " + sum + ".");
    }

    private static int sumOfEven(int amount) {
        if (amount <= 0) {
            System.out.print(amount + " = ");
            return amount;
        }
        System.out.print(amount + " + ");
        return amount + sumOfEven(amount - 2);
    }
}

