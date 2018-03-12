package part_06.ex3;

public class Sub2 extends Sub1 {

    private int sub2int;
    private double sub2doub;
    private String sub2string;

    public Sub2(int answerToLife, String hey, int sub1int, double sub1doub, String sub1string, int sub2int, double sub2doub, String sub2string) {
        super(answerToLife, hey, sub1int, sub1doub, sub1string);
        this.sub2int = sub2int;
        this.sub2doub = sub2doub;
        this.sub2string = sub2string;
    }

    public static void main(String[] args) {

        // Exercise 1
        Sub2 a = new Sub2(42, "hey", 21, 77.7, "subone", 55, 55.6, "subtwo");

        int yee = a.hey(8,9);

        System.out.println(yee);

        // Exercise 2

        a.setAnswerToLife(42);

        System.out.println(a.getAnswerToLife());




    }

    // Exercise 1
    public int hey(int a, int b){

        super.addAndReturn(a, b);
        return a + b;
    }


}
