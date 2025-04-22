package me.hubailmn.Labs.Lab3.output;

import me.hubailmn.utils.Exercise;
import me.hubailmn.utils.ProjectUtil;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

@Exercise(
        exercise = 3,
        name = "Text File Output Demo",
        description = "Prompts the user to input three lines of text and writes them to a file, each line prefixed with a number. " +
                "Demonstrates basic file output handling using PrintWriter."
)
public class TextFileOutputDemo {


    public static void main(String[] args) {
        String fileName = ProjectUtil.getUNIVERSITY_COMPUTER_PROJECT_PATH() + "Lab3\\resources\\out.txt";

        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }

        System.out.println("Enter three lines of text:");
        Scanner keyboard = new Scanner(System.in);

        for (int count = 1; count <= 3; count++) {
            String line = keyboard.nextLine();
            outputStream.println(count + ". " + line);
        }

        outputStream.close();
        System.out.println("Those lines were written to " + fileName);
    }
}
