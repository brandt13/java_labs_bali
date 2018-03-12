package part_05.ex3;

public class Class2 {

    private String omString;
    private int omInt;
    private double omDouble;


    public String overloadedMethod(String omString, int omInt, double omDouble){

        this.omString = omString;
        this.omDouble = omDouble;
        this.omInt = omInt;

        return omString;
    }

    public int overloadedMethod(int omInt, double omDouble, String omString){

        this.omString = omString;
        this.omDouble = omDouble;
        this.omInt = omInt;

        return omInt;
    }

    public double overloadedMethod(double omDouble, String omString, int omInt){

        this.omString = omString;
        this.omDouble = omDouble;
        this.omInt = omInt;

        return omDouble;
    }

    public int overloadedMethod(int omInt, double omDouble){

        this.omDouble = omDouble;
        this.omInt = omInt;

        return omInt;
    }

    public double overloadedMethod(double omDouble, int omInt){

        this.omDouble = omDouble;
        this.omInt = omInt;

        return omDouble;
    }

    public String overloadedMethod(String omString, double omDouble){

        this.omString = omString;
        this.omDouble = omDouble;

        return omString;
    }

    public double overloadedMethod(double omDouble, String omString){

        this.omString = omString;
        this.omDouble = omDouble;

        return omDouble;
    }

    public String overloadedMethod(String omString, int omInt){

        this.omString = omString;
        this.omInt = omInt;

        return omString;
    }

    public int overloadedMethod(int omInt, String omString){

        this.omString = omString;
        this.omInt = omInt;

        return omInt;
    }

    public String overloadedMethod(String omString){

        this.omString = omString;

        return omString;
    }

    public int overloadedMethod(int omInt){

        this.omInt = omInt;

        return omInt;
    }

    public double overloadedMethod(double omDouble){

        this.omDouble = omDouble;

        return omDouble;
    }


}
