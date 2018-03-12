package part_04.ex7;

public class Stack {

    private int stack[];
    private int popNum, pushNum;

    Stack(int size){

        stack = new int[size];
        popNum = pushNum = 0;
    }

    void push (char ch){

        if (popNum == 0){
            System.out.println();
            System.out.print("Pushing...");

        }

        if (popNum == stack.length){

            System.out.println(" Stack is full.");

            System.out.println("Stack: ");
            for (int i = stack.length; i > 0; i--){

                System.out.println((char)stack[i-1] + " ");
            }

            return;
        }


        stack[pushNum++] = ch; // stack[0]=a pushNum = 1 , stack[1]=b pushNum = 2 , stack[2]=c pushNum = 3

        popNum++;               // popNum = 1 , popNum = 2 , popNum = 3

    }

    void pop() {

        if (pushNum == stack.length){

            System.out.println();
            System.out.println("Popping...");
        }

        pushNum--;                                          // pushNum = 3 , pushNum = 2 , pushNum = 1

        System.out.println("Popped: " + (char) stack[(popNum-1)]);       // print: stack[2] , stack[1] , stack[0]

        popNum--;                                           // popNum = 3 , popNum = 2 , popNum = 1

        if (pushNum == 0){

            System.out.println("Stack is empty.");
        }

    }

}
