package me.hubailmn.programming.one.Lab4;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's final mark: ");
        double score = scanner.nextDouble();

        if(score >= 60 && score < 100){
            System.out.println("pass");
        } else if (score < 60 && score > 0) {
            System.out.println("fail");
        } else {
            System.out.println("Wrong number!");
        }

        if (score > 100 || score < 0) {
            System.out.println("Out of Range: number cant be greater than 100 and less than 0.");
            System.exit(0);
        }

        if (score >= 60) {
            System.out.println("Result: pass");
        } else {
            System.out.println("Result: Fail");
        }

    }
}
