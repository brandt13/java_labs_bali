package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 999,999,999: ");
        int num = input.nextInt();

        // use the && operator to see if the user's number is divisible by both 4 and 7
        System.out.println("AND:");
        if (num % 4 == 0 && num % 7 == 0)
            System.out.println("    The number is divisible by both 4 and 7.");
        else System.out.println("    The number is not divisible by both 4 and 7.");


        // use the || operator to see if the user's number is divisible by 4 or 7
        System.out.println("OR:");
        if (num % 4 == 0 || num % 7 == 0) {
            if (num % 4 == 0)
                System.out.println("    The number is divisible by either 4 or 7. This time it is divisble by 4.");
            if (num % 7 == 0)
                System.out.println("    The number is divisible by either 4 or 7. This time it is divisble by 7.");

        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        System.out.println("XOR:");
        if (num % 4 == 0 ^ num % 7 == 0) {
            if (num % 4 == 0)
                System.out.println("    The number is divisible by either 4 or 7. This time it is divisble by 4.");
            if (num % 7 == 0)
                System.out.println("    The number is divisible by either 4 or 7. This time it is divisble by 7.");
        }
        else System.out.println("    This number was not exclusively divisible by either 4 or 7.");

        // print out the results

    }
}


