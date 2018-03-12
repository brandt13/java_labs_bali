package part_06.ex6;

public class Cont {
    public static void main(String[] args) {

        Hey heyOb = new Hey();
        Ola olaOb = new Ola();
        Privyet priOb = new Privyet();

        Hey greet;

        greet = heyOb;
        greet.greeting();

        greet = olaOb;
        greet.greeting();

        greet = priOb;
        greet.greeting();

        // comment for adding part 6


    }

}
