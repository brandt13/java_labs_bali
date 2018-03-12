package part_05.ex4;

public class Class2 {

    private String varString;
    private int varInt;
    private double varDouble;

    public void Class2(int varInt, String varString, double varDouble) {
        this.varString = varString;
        this.varInt = varInt;
        this.varDouble = varDouble;
    }

    public void Class2(String varString, int varInt) {
        this.varString = varString;
        this.varInt = varInt;
    }

    public void Class2(double varDouble) {
        this.varDouble = varDouble;
    }

    public String getVarString() {
        return varString;
    }

    public int getVarInt() {
        return varInt;
    }

    public double getVarDouble() {
        return varDouble;
    }
}
