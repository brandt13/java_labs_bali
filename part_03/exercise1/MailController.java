package part_03.exercise1;

public class MailController {

    public static void main(String[] args) {


        MailPerson person = new MailPerson("PDX0898Y", "Jack Jones",
                "PDX_NE_AlbertaNeighborhood_2", 235);

        System.out.println(person.toString());

        MailTruck truck = new MailTruck(person.getName(), "PDX47", 147);

        System.out.println();

    }
}
