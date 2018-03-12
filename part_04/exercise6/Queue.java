package part_04.exercise6;

public class Queue {

    int q[];
    int putNum, getNum;

    Queue(int size){

        q = new int[size];
        putNum = getNum = 0;
    }

    void put (int num){

        if (putNum == q.length){
            System.out.println(" - Queue is full.");
            return;
        }

        q[putNum++] = num;
    }

    int get(int num) {

        if (getNum == putNum){

            System.out.println(" - Queue is empty.");
            return 0;
        }

        return q[getNum++] = num;

    }


}
