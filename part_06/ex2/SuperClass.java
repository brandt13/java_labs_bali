package part_06.ex2;

public class SuperClass {

    protected static String yay = "yay";

    private int answerToLife;
    private String hey;


    public static void main(String[] args) {


    }

    public static void printString(){

        System.out.println("Eyyyy Sub2! Triple yay");
    }

    public int addAndReturn(int a, int b){

        return a + b;
    }

    public int getAnswerToLife() {
        return answerToLife;
    }

    public void setAnswerToLife(int answerToLife) {
        this.answerToLife = answerToLife;
    }

    public String getHey() {
        return hey;
    }

    public void setHey(String hey) {
        this.hey = hey;
    }
}
