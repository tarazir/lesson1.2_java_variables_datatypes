/*
Program by: Mr. Tarazi, Computer Science Teacher
Date: June 20th, 2021
Learning Objectives:
    - How do I define Java variables and Primitive Data Types
    - How do I set values to the primitive data type variables
    - How to run a program with the defined primitive data type variables

// Coding Execution:
        My name is Mr. Tarazi
        I am 50 years old
        Are you a Data Scientist? True

Source Code:
    Github => tarazir/
 */

public class Main {

    public static void main(String[] args) {

        // Initialize a variable of type String
        String name ="Mr. Tarazi";

	    // Initialize a variable of type Integer
        int age = 50;

        // Initialize a variable of type Boolean
        boolean data_scientist = true;

        // Print to the console the three variables
        System.out.println("My name is " + name);
        System.out.println("I am " + age  + " years old");
        System.out.println("Are you a Data Scientist? " + data_scientist);
    }
}
