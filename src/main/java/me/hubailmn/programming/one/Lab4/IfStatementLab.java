package me.hubailmn.programming.one.Lab4;

public class IfStatementLab {
    public static void main(String[] args) {

        System.out.println("\nBasic If Statement");
        int numb1 = 10;
        if (numb1 > 5) {
            System.out.println("The number \"" + numb1 + "\" is greater than 5.");
        }

        System.out.println("\nIf-Else Statement");
        int numb2 = 3;
        System.out.println((numb2 > 5) ? "The Number is greater than 5" : "The Number is not greater than 5");

        System.out.println("\nUsing Logical Operators (AND, OR)");
        boolean isRaining = false;
        boolean isSunny = true;

        if (isRaining && isSunny) {
            System.out.println("It's Raining and it is Sunny");
        }

        if (isRaining || isSunny) {
            System.out.println("It's either Raining or it's Sunny");
        }

        boolean isWarm = true;

        if ((isWarm && isSunny) || (isWarm && isRaining)) {
            System.out.println("It's Warm and either Raining or Sunny");
        }

    }
}
