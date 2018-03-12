package part_06.ex3;

public class Sub1 extends SuperClass {

    private int sub1int;
    private double sub1doub;
    private String sub1string;

    public Sub1(int answerToLife, String hey, int sub1int, double sub1doub, String sub1string) {
        super(answerToLife, hey);
        this.sub1int = sub1int;
        this.sub1doub = sub1doub;
        this.sub1string = sub1string;
    }

    public static void main(String[] args) {

        // Excercise 1
        System.out.println(SuperClass.yay);

        SuperClass.yay = "double yay";

        System.out.println(SuperClass.yay);

        Sub1 r = new Sub1(42000, "hi", 88, 88.8, "subone");

        int sum = r.addAndReturn(8,7);

        System.out.println(sum);

        // Exercise 2

        r.setHey("hey");
        System.out.println(r.getHey());

    }
}
