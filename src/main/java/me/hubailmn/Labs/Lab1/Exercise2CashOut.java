package me.hubailmn.Labs.Lab1;

import java.util.Scanner;

public class Exercise2CashOut {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the amount of items you wish to purchase: ");
        int itemsAmount = scan.nextInt();

        if (itemsAmount <= 0) {
            System.out.println("Invalid number of items. Exiting...");
            scan.close();
            return;
        }

        double[] items = new double[itemsAmount];
        double totalCost = 0;

        System.out.println("\nPlease Enter each item price:");
        for (int i = 0; i < items.length; i++) {
            System.out.print("item #" + (i + 1) + ": ");
            double price = scan.nextDouble();

            if (price < 0) {
                System.out.println("Item price cannot be negative. Please try again.");
                i--;
                continue;
            }

            items[i] = price;
            totalCost += price;
        }

        System.out.printf("\nThe cost of the items is $%.2f.\n", totalCost);

        double totalPaidAmount = 0;
        while (totalPaidAmount < totalCost) {
            System.out.print("\nPlease enter the amount you want to give to the cashier: ");
            double paidAmount = scan.nextDouble();

            if (paidAmount <= 0) {
                System.out.println("Invalid amount. Please enter a positive number.");
                continue;
            }

            totalPaidAmount += paidAmount;
            double remainingAmount = totalCost - totalPaidAmount;

            if (remainingAmount > 0) {
                System.out.printf("\nYou still need to pay $%.2f more.\n", remainingAmount);
            } else {
                System.out.printf("\nYour change is $%.2f.\n", Math.abs(remainingAmount));
            }
        }

        System.out.println("\nHave a nice day!");
        scan.close();
    }
}
