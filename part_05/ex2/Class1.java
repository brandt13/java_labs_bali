package part_05.ex2;

public class Class1 {

    public static void main(String[] args) {

        Class2 obj = new Class2();

        method1(obj);

    }


    public static void method1(Class2 objMethod1){

        objMethod1.setCtwodouble(44.4);
        objMethod1.setCtwoint(4);
        objMethod1.setDrpeppersays("You have dysentery.");
        objMethod1.setCtwostring("Charmander");

        System.out.println();
        System.out.println("Method 1: ");
        System.out.println(objMethod1.getCtwodouble());
        System.out.println(objMethod1.getCtwoint());
        System.out.println(objMethod1.getDrpeppersays());
        System.out.println(objMethod1.getCtwostring());

        method2(objMethod1);

    }

    public static void method2(Class2 objMethod2){

        objMethod2.setCtwodouble(77.7);
        objMethod2.setCtwoint(7);
        objMethod2.setDrpeppersays("I taste good.");
        objMethod2.setCtwostring("Bulbasaur");

        System.out.println();
        System.out.println("Method 2: ");
        System.out.println(objMethod2.getCtwodouble());
        System.out.println(objMethod2.getCtwoint());
        System.out.println(objMethod2.getDrpeppersays());
        System.out.println(objMethod2.getCtwostring());


    }

}
