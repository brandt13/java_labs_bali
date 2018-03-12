package part_05.ex4;

public class Class1 {

    public static void main(String[] args) {

        Class2 obj = new Class2();

        obj.Class2("Dragonite", 8);

        System.out.println();
        System.out.println("VarString   change1: " + obj.getVarString());
        System.out.println("VarInt      change1: " + obj.getVarInt());

        obj.Class2(77.7);

        System.out.println();
        System.out.println("VarDouble   change2: " + obj.getVarDouble());

        obj.Class2(9, "Chancey", 88.8);

        System.out.println();
        System.out.println("VarInt      change3: " + obj.getVarInt());
        System.out.println("VarString   change3: " + obj.getVarString());
        System.out.println("VarDouble   change3: " + obj.getVarDouble());
    }
}
