package me.hubailmn.Labs.Lab2.practice;

public class RecursiveCountdown {
    public static void main(String[] args) {

        countDown(3);

    }

    public static void countDown(int num) {
        if (num <= 0) {
            System.out.println();
        }

        System.out.print(num);
        countDown(num - 1);

    }
}
