package me.hubailmn.programming.one.Lab3;

public class  StringManipulationLab {

    public static void main(String[] args) {

        System.out.println("\nCreating and Manipulating Strings");
        String messages = "Hello, World!";
        System.out.println("Original Messages: " + messages);

        int length = messages.length();

        String upperCase = messages.toUpperCase();
        String lowerCase = messages.toLowerCase();

        char firstCharacter = messages.charAt(0);

        boolean startWithHello = messages.startsWith("Hello");
        boolean endWithWorld = messages.endsWith("World!");

        String replaced = messages.replace("World", "Universe");
        String subString = messages.substring(7, 12);

        System.out.println("Length: " + length);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Character at index 0: " + firstCharacter);
        System.out.println("Starts with 'Hello': " + startWithHello);
        System.out.println("Ends with 'World!': " + endWithWorld);
        System.out.println("Replaced: " + replaced);
        System.out.println("Substring: " + subString);

        System.out.println("\nConcatenating Strings");
        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name: " + fullName);

        System.out.println("\nJoining Strings");
        String joinedSentence = String.join("-", "Hello", "my", "name", "is", "Mohammad", "Al", "Hubail");
        System.out.println("Joined Sentence: " + joinedSentence);

        System.out.println("\nComparing Strings");
        String StudentName1 = "Ali";
        String StudentName2 = "Fahad";

        int comparingResult = StudentName1.compareTo(StudentName2);
        System.out.println(comparingResult);

    }
}
