package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 *
 * Write one class. This class must make use of an inner/nested class. Within the nested class, access the instance variables
 of the outer class. Also, within the inner class, call at least two methods that have a return type of int.
 */


class OuterClass {

    private int var1;
    private int var2;
    private String Yeee;
    private int add;

    public static void main(String[] args) {

        OuterClass obj = new OuterClass();

        obj.var1 = 10;
        obj.var2 = 20;

    //    obj.add = obj.test();
    }

    public void test(){

        InnerClass inOb = new InnerClass();

        inOb.one(7);
    }

    class InnerClass {

        public int one (int x){

            x = var1 + var2;

            int y = two(8);

            return x+y;
        }
    }


    public int two (int y){

        y = y + 2;

        return y;
    }

}