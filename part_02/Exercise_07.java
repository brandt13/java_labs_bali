package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a number of minutes up to one billion, and I will tell you how many years and days it is: ");

        int minutes = scanner.nextInt();;

        double days = (minutes / 60) / 24;
        double yearsPlusDaysLeftoverInYears = days / 365;

        double years = (int) yearsPlusDaysLeftoverInYears;
        double daysLeftoverInYears = yearsPlusDaysLeftoverInYears - (int) yearsPlusDaysLeftoverInYears;

        daysLeftoverInYears = daysLeftoverInYears * 365;

        System.out.println();
        System.out.println(minutes + " minutes is equal to " + yearsPlusDaysLeftoverInYears + " years, or " + (int) years + " years and " + (int) daysLeftoverInYears + " days.");


    }
}


