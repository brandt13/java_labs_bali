package part_03.exercise2;

public class MultDiv {

    public static void main(String[] args) {

        int product = Mult(7,5);
        int dividend = Div(20,80);

        System.out.println();
        System.out.println("The sum of the product and dividend is " + (product+dividend));

    }

    public static int Mult(int a, int b) {

        return a * b;
    }

    public static int Div(int a, int b) {

        return b/a;
    }


}
