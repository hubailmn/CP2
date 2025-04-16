package me.hubailmn.utils;

public @interface Exercises {

    String name();

    String description();

    int exercise() default 0;

}
