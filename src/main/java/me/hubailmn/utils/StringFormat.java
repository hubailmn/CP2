package me.hubailmn.utils;


public class StringFormat {

    public static String formatClassName(String className) {
        return className
                .replaceAll("(?<=[a-zA-Z])(?=[A-Z0-9])", " ")
                .replaceAll("(?<=[0-9])(?=[A-Za-z])", " ")
                .trim();
    }

}
