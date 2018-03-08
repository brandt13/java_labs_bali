package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean makeWork = true;

        if (makeWork){

            System.out.println();
            System.out.print ("Give me a number (1-9) and I'll print it in English: ");

            int num = scanner.nextInt();
            System.out.println();

            if (num == 1) System.out.println("One!");
            else if (num == 2) System.out.println("Two!");
            else if (num == 3) System.out.println("Three!");
            else if (num == 4) System.out.println("Four!");
            else if (num == 5) System.out.println("Five!");
            else if (num == 6) System.out.println("Six!");
            else if (num == 7) System.out.println("Seven!");
            else if (num == 8) System.out.println("Eight!");
            else if (num == 9) System.out.println("Nine!");
            else if (num < 1 || num > 9) System.out.println("Other!");

        }
    }
}

