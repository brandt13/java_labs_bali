package part_06.ex3;

import part_06.ex2.Sub1;

public class SuperClass {

    protected static String yay = "yay";

    private int answerToLife;
    private String hey;

    public SuperClass(int answerToLife, String hey) {
        this.answerToLife = answerToLife;
        this.hey = hey;
    }

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
