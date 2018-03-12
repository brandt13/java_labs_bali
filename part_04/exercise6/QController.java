package part_04.exercise6;

public class QController {

    public static void main(String[] args) {

        Queue hund = new Queue(100);

        int i;

        for (i = 0; i < 100; i++){

            hund.put(i);
        }

        for (i = 0; i <= 100; i += 2){
            int loc;
            loc = hund.get(i);
            System.out.print(loc + " ");
        }
    }
}
