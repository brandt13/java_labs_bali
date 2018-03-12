package part_06.ex5;

public class SuperClass {

    protected static String yay = "yay";

    private int answerToLife;
    private String hey;

    public SuperClass(int answerToLife, String hey) {
        this.answerToLife = answerToLife;
        this.hey = hey;
    }

    public SuperClass(int answerToLife) {
        this.answerToLife = answerToLife;
    }

    public SuperClass(String hey) {
        this.hey = hey;
    }

    public SuperClass() {
    }

    public static void main(String[] args) {


    }

    public static void printString(){

        System.out.println("Eyyyy Sub2! Triple yay");
    }

    public static int addAndReturn(int a, int b){

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


    public static int subtract(int a, int b){

        return a - b;
    }





}
