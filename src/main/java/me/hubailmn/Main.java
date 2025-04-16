package me.hubailmn;

import me.hubailmn.utils.CC;
import me.hubailmn.utils.Exercises;
import me.hubailmn.utils.StringFormat;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ConfigurationBuilder;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String option;

        do {
            Menu();
            System.out.print(CC.BRIGHT_YELLOW + "\nTest Another Class? (Y/N): " + CC.RESET);
            option = scanner.nextLine();
        } while (option.equalsIgnoreCase("y") || option.equalsIgnoreCase(""));

    }

    private static void Menu() {
        Reflections reflections = new Reflections(
                new ConfigurationBuilder()
                        .forPackages("me.hubailmn.Labs")
                        .addScanners(new SubTypesScanner(false))
        );

        Set<Class<?>> allClasses = reflections.getSubTypesOf(Object.class);
        Map<String, List<Class<?>>> packageToClasses = new TreeMap<>();

        for (Class<?> clazz : allClasses) {
            try {
                Method mainMethod = clazz.getMethod("main", String[].class);
                if (Modifier.isStatic(mainMethod.getModifiers()) && Modifier.isPublic(mainMethod.getModifiers())) {
                    String pkg = clazz.getPackageName();
                    packageToClasses.computeIfAbsent(pkg, k -> new ArrayList<>()).add(clazz);
                }
            } catch (NoSuchMethodException ignored) {
            }
        }

        if (packageToClasses.isEmpty()) {
            System.out.println("No classes with a main method found.");
            return;
        }

        String basePackage = "me.hubailmn.Labs.";

        System.out.println(CC.BRIGHT_YELLOW + "\nSelect a class to run its main method:\n" + CC.RESET);

        List<Class<?>> indexedClasses = new ArrayList<>();
        int index = 1;

        for (Map.Entry<String, List<Class<?>>> entry : packageToClasses.entrySet()) {
            entry.getValue().sort(Comparator.comparing(Class::getSimpleName));

            String fullPackage = entry.getKey();
            String shortPackage = fullPackage.startsWith(basePackage)
                    ? fullPackage.substring(basePackage.length())
                    : fullPackage;

            System.out.println(CC.BRIGHT_PURPLE + " - " + shortPackage + CC.RESET);

            for (Class<?> clazz : entry.getValue()) {
                indexedClasses.add(clazz);
                String formattedName = StringFormat.formatClassName(clazz.getSimpleName());
                System.out.printf("     %s[%d] %s%s%n", CC.BRIGHT_GREEN, index, CC.BRIGHT_BLUE, formattedName + CC.RESET);

                index++;
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print(CC.BRIGHT_CYAN + "\n > Enter the number of the class to run: " + CC.RESET);
        int choice;

        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.");
            return;
        }

        if (choice < 1 || choice > indexedClasses.size()) {
            System.out.println("Invalid choice.");
            return;
        }

        Class<?> selectedClass = indexedClasses.get(choice - 1);
        System.out.println(CC.BRIGHT_BLUE + "\nRunning: " + selectedClass.getName() + CC.RESET);

        if (selectedClass.isAnnotationPresent(Exercises.class)) {
            Exercises exercisesAnnotation = selectedClass.getAnnotation(Exercises.class);
            System.out.println(CC.BRIGHT_YELLOW + "\nDescription: \n\t" + CC.RESET + exercisesAnnotation.description().replaceAll(", ", ",\n\t") + "\n");
        }

        try {
            Method mainMethod = selectedClass.getMethod("main", String[].class);
            mainMethod.invoke(null, (Object) new String[]{});
        } catch (Exception e) {
            System.out.println("Error running main method:");
            throw new RuntimeException(e);
        }
    }
}
