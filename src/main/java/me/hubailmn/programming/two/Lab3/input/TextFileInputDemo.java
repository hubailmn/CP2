package me.hubailmn.programming.two.Lab3.input;

import me.hubailmn.utils.Exercise;
import me.hubailmn.utils.ProjectUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Exercise(
        exercise = 2,
        name = "Text File Input Demo",
        description = "Reads a text file line by line using a Scanner, printing its contents to the console. " +
                "Demonstrates basic file input handling and error management."
)
public class TextFileInputDemo {

    public static void main(String[] args) {
        String fileName = ProjectUtil.getUNIVERSITY_COMPUTER_PROJECT_PATH() + "Lab3\\resources\\out.txt";

        Scanner inputStream = null;
        System.out.println("The file " + fileName + "\ncontains the following lines:\n");

        try {
            inputStream = new Scanner(new File(fileName));
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