package part_06.ex2;

public class Sub1 extends SuperClass {

    public static void main(String[] args) {

        // Excercise 1
        System.out.println(SuperClass.yay);

        SuperClass.yay = "double yay";

        System.out.println(SuperClass.yay);

        Sub1 r = new Sub1();

        int sum = r.addAndReturn(8,7);

        System.out.println(sum);

        // Exercise 2

        r.setHey("hey");
        System.out.println(r.getHey());

    }
}
