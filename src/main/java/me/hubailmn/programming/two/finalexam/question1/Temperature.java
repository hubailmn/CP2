package me.hubailmn.programming.two.finalexam.question1;

public class Temperature {

    public static void main(String[] args) {

        int[] temperatures = {-5, 9, 10, 11, 25, 28, 34, 35, 36, 40};

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Temperature " + temperatures[i] + ": ");
            if (temperatures[i] >= 35) {
                System.out.println("Hot");
            } else if (temperatures[i] < 10) {
                System.out.println("Cold");
            } else {
                System.out.println("Moderate");
            }
        }
    }
}
