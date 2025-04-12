package me.hubailmn.Labs.Lab2;

public class Exercise3Range {

    public static void main(String[] args) {

        int start = 1;
        int end = 10;

        range(start, end);
    }

    private static void range(int num1, int num2) {

        if (num1 > num2) {
            return;
        }

        System.out.println(num1);
        num1++;
        range(num1, num2);
    }
}
