package part_03;


/**
 * Implement the getMonthName() method
 */

class Exercise_03 {

    public static void main(String[] strings) {


        // use a for loop to iterate 1000 times
        for (int i = 0; i < 1000; i++) {

            // Generate a random int between >= 1 and <= 12
            int month = 1 + (int) (Math.random() * ((12 - 1) + 1));

            // call getMonthName(int month) and pass your random int
            String monthName = getMonthName(month);

            // print the name of the month and the random int generated to the console
            System.out.println(month + " " + monthName);

        }

    }

    // Get the name for the month using the random int you generated
    public static String getMonthName(int month) {

        String monthName = "";

        switch (month){

            case 1: monthName = "   Jan"; break;
            case 2: monthName = "   Feb"; break;
            case 3: monthName = "   Mar"; break;
            case 4: monthName = "   Apr"; break;
            case 5: monthName = "   May"; break;
            case 6: monthName = "   Jun"; break;
            case 7: monthName = "   Jul"; break;
            case 8: monthName = "   Aug"; break;
            case 9: monthName = "   Sep"; break;
            case 10: monthName = "  Oct"; break;
            case 11: monthName = "  Nov"; break;
            case 12: monthName = "  Dec"; break;
        }


        // use a switch statement to determine the name of the month
        // for instance if the random int is 1 the name of month is January

        return monthName;
    }
}





