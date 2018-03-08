package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Give me a weight in pounds and I will convert it to kilos: ");

        double pounds = scanner.nextDouble();

        double kilos = pounds*0.454;

        System.out.println();
        System.out.println("The weight in kilos is " + kilos);

    }


}