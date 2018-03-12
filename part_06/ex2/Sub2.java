package part_06.ex2;

public class Sub2 extends SuperClass {

    public static void main(String[] args) {

        // Exercise 1
        Sub2 a = new Sub2();

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
