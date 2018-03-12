package part_05.ex3;

public class Class1 {

    public static void main(String[] args) {

        Class2 obj = new Class2();

        System.out.println();

        System.out.println("One:    This method takes parameters omString, omInt, and omDouble and returns omString: " +
                obj.overloadedMethod("'Heyo'" ,4,64.2));

        System.out.println("Two:    This method takes in omDouble and omInt and returns omDouble: " + obj.overloadedMethod(8.8, 8));

        System.out.println("Three:  This method takes in omInt and returns omInt: " + obj.overloadedMethod(9));

        System.out.println("Four:   This method takes in omString and omDouble and returns omString: " +
                obj.overloadedMethod("'I could do this all day. This method is overloaded a buuuuuuunch.'", 88.8));
    }
}
