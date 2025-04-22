package me.hubailmn.Labs.Lab3.input;

import me.hubailmn.utils.Exercise;
import me.hubailmn.utils.ProjectUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Exercise(
        exercise = 1,
        name = "User-Specified Text File Reader",
        description = "Prompts the user to enter a file name, reads the specified text file line by line, and prints its contents. " +
                "Demonstrates dynamic file input and basic error handling using Scanner."
)

public class TextFileInput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = keyboard.next();

        Scanner inputStream = null;
        System.out.println("The file " + fileName + "\ncontains the following lines:\n");

        try {
            inputStream = new Scanner(new File(ProjectUtil.getUNIVERSITY_COMPUTER_PROJECT_PATH() + "Lab3\\resources\\" + fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }
        while (inputStream.hasNextLine()) {
            String line = inputStream.nextLine();
            System.out.println(line);
        }

        inputStream.close();
    }
}
