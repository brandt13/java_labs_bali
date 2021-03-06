package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a number up to a billion and I'll print it back to you using a while loop: ");

        int num = scanner.nextInt();
        int i = 0;

        while (i < num) i++;

        System.out.println("Your number is: " + i);
    }

}

