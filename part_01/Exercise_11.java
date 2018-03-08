package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

    int bornPerYear = (60/6)*60*24*365;
    int diePerYear = (60/12)*60*24*365;
    int immigratesPerYear = (60*60*24*365)/40;

    int pop = 380123456;
    int futurePop = pop + (bornPerYear*3) - (diePerYear*3) + (immigratesPerYear*3);


        System.out.println("The U.S. population in three years will be " + futurePop);

    }
}