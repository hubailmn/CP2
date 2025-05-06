package me.hubailmn.programming.one.Lab3;

import java.util.Scanner;

public class ScannerLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
