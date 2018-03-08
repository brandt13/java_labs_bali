package part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {

        double radius = 3.14;
        double area;
        double circum;

        area = (3.14)*(radius*radius);
        circum = 2*3.14*radius;

        System.out.println();
        System.out.println("Area: " + area + " units squared");
        System.out.println("Circumference: " + circum + " units");


    }



}
