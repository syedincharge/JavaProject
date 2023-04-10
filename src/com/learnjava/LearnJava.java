package com.learnjava;

// Single-line comments start with //

/*
Multi-line comments look like this.
*/

/**
 * JavaDoc comments look like this. Used to describe the Class or various
 * attributes of a Class.
 * Main attributes:
 *
 * @author         Name (and contact information such as email) of author(s).
 * @version     Current version of the program.
 * @since        When this part of the program was first added.
 * @param         For describing the different parameters for a method.
 * @return        For describing what the method returns.
 * @deprecated  For showing the code is outdated or shouldn't be used.
 * @see         Links to another part of documentation.
 */

// Import ArrayList class inside of the java.util package
import java.io.BufferedReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
// Import all classes inside of java.security package
import java.security.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LearnJava {

    // In order to run a java program, it must have a main method as an entry
    // point.
    public static void main(String[] args) {

        ///////////////////////////////////////
        // Input/Output
        ///////////////////////////////////////

        /*
         * Output
         */

        // Use System.out.println() to print lines.
        System.out.println("Hello World!");
        System.out.println(
                "Integer: " + 10 +
                        " Double: " + 3.14 +
                        " Boolean: " + true);

        // To print without a newline, use System.out.print().
        System.out.print("Hello ");
        System.out.println("World");

        // Use System.out.printf() for easy formatted printing.
        System.out.printf("pi = %.5f", Math.PI); // => pi = 3.14159


        /*
         * Input
         */

        // use Scanner to read input
        // must import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);

        // read string input
        String name = scanner.next();

        // read byte input
        byte numByte = scanner.nextByte();

        // read int input
        int numInt = scanner.nextInt();

        // read long input
        float numFloat = scanner.nextFloat();

        // read double input
        double numDouble = scanner.nextDouble();

        // read boolean input
        boolean bool = scanner.nextBoolean();

    }
}