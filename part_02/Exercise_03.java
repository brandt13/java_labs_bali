package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double meters;

        System.out.println();
        System.out.print("Give me a distance in feet and I will give you the distance in meters: ");

        double feet = scanner.nextDouble();

        meters = feet*0.305;

        System.out.println();
        System.out.println("The distance in meters is: " + meters);

    }

}