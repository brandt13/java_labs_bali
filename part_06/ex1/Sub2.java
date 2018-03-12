package part_06.ex1;

public class Sub2 extends SuperClass {

    public static void main(String[] args) {

        Sub2 a = new Sub2();

        int yee = a.hey(8,9);

        System.out.println(yee);

    }

    public int hey(int a, int b){

        super.addAndReturn(a, b);
        return a + b;
    }
}
