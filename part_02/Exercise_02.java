package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double surfaceArea;
        double volume;

        System.out.println();
        System.out.println("Give me the radius and height of a cylinder and I will give you the volume and surface area: ");
        System.out.println();
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();

        surfaceArea = (((2*3.1415*radius)*height) + ((radius*radius*3.1415)*2));

        volume = (radius*radius*3.1415)*height;

        System.out.println();
        System.out.println("The Surface Area is: " + surfaceArea + " units squared.");
        System.out.println("The Volume is: " + volume + " units cubed.");



    }


}