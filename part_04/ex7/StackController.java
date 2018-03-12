package part_04.ex7;


import java.util.Scanner;

public class StackController {



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int stackSize;
        char ch;

        System.out.println();
        System.out.print("Enter the size of the stack: ");

        stackSize = s.nextInt();

        Stack stack = new Stack(stackSize);

        for (int i = 0; i <= stackSize/*3*/; i++){

            stack.push((char) ('a' + i));

        }

        for (int i = stackSize; i > 0; i--){

            stack.pop();


        }

    }
}
