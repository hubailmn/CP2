# CP2 — Computer Programming Lab Workbook

A collection of Java exercises and labs from two computer programming courses, covering fundamentals through intermediate topics like recursion, file I/O, and object-oriented programming.

## Overview

This repository contains lab exercises and quizzes from **Programming 1** and **Programming 2** courses. Each exercise is a self-contained Java program demonstrating a specific concept. A reflective launcher (`Main.java`) auto-discercises all exercises and presents them in an interactive menu.

## Course Structure

### Programming 1 (Introductory)

| Lab | Topic | Exercises |
|-----|-------|-----------|
| Lab 2 | Variables & Data Types | Type casting, operators, increment/decrement |
| Lab 3 | User Input & Strings | Scanner, string manipulation methods |
| Lab 4 | Conditional Statements | if/else, ternary, logical operators |
| Lab 5 | Control Flow | Nested if/else, switch statements |
| Lab 6 | Loops | while, do-while, for loops |
| Quiz 3 | Conditionals | Positive & odd number checker |

### Programming 2 (Intermediate)

| Lab | Topic | Exercises |
|-----|-------|-----------|
| Lab 1 | Arrays | Array traversal, sum calculation, cashier simulation |
| Lab 2 | Recursion | Recursive factorial, string repetition, range |
| Lab 3 | File I/O | CSV parsing, transaction reader with error handling |
| Lab 5 | Object-Oriented Programming | Classes, encapsulation, Lombok, validation |
| Lab 6 | Enums & Overloading | Enum types, method overloading, static utilities |
| Quiz 1 | 2D Arrays | Character matrix initialization and printing |
| Quiz 2 | Recursion + Validation | Even number sum using recursion |

## Tech Stack

- Java 21
- Maven
- Lombok (boilerplate reduction)
- SLF4J + Logback (logging)
- Reflections library (exercise discovery)

## Project Structure

```
src/main/java/me/hubailmn/
├── utils/                  # Infrastructure utilities
│   ├── Exercise.java       # Custom annotation for exercise metadata
│   ├── CC.java             # ANSI console colors
│   ├── StringFormat.java   # CamelCase to readable string converter
│   └── ProjectUtil.java    # Cross-platform file path utility
├── programming/
│   ├── one/                # Programming 1 labs & quizzes
│   │   ├── Lab2/           # Variables & types
│   │   ├── Lab3/           # Strings & input
│   │   ├── Lab4/           # Conditionals
│   │   ├── Lab5/           # Control flow
│   │   ├── Lab6/           # Loops
│   │   └── Quiz/
│   └── two/                # Programming 2 labs & quizzes
│       ├── Lab1/           # Arrays
│       ├── Lab2/           # Recursion
│       ├── Lab3/           # File I/O
│       ├── Lab5/           # OOP
│       ├── Lab6/           # Enums & overloading
│       └── Quiz/
```

## Features

- **Auto-Discovery Launcher** — Uses reflection to scan for `@Exercise`-annotated classes and builds an interactive menu
- **Console Colors** — ANSI color output for formatted terminal display
- **Cross-Platform Paths** — Utility to handle different filesystem paths across machines

## Getting Started

### Prerequisites

- Java 21+
- Maven 3.6+

### Build

```bash
mvn clean package
```

### Run

```bash
mvn exec:java -Dexec.mainClass="me.hubailmn.Main"
```

Or run individual exercises by specifying their main class:

```bash
mvn exec:java -Dexec.mainClass="me.hubailmn.programming.two.Lab2.Factorial"
```

## Custom Annotation System

Exercises use the `@Exercise` annotation for metadata:

```java
@Exercise(name = "Factorial Calculator", description = "Demonstrates recursion", exercise = 1)
public class Factorial {
    public static void main(String[] args) { ... }
}
```

The launcher reads these annotations to build the menu dynamically.
