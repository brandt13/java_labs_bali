package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready
        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array

    public static int getMaxVal(int[][] yo){

        int newNum;
        int currentMaxNum = 0;

        for (int i = 0; i < yo.length; i++){
            for (int j = 0; j < yo[i].length; j++){

                newNum = yo[i][j];

                if (newNum > currentMaxNum)
                    currentMaxNum = newNum;

            }
        }

        System.out.println();
        System.out.print("Max Value in array: ");

        return currentMaxNum;
    }

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    public static int getMinVal(int[][] yo){

        int newNum;
        int currentMinNum = 0;

        for (int i = 0; i < yo.length; i++){
            for (int j = 0; j < yo[i].length; j++){

                newNum = yo[i][j];

                if (currentMinNum == 0){

                    currentMinNum = newNum +1;
                }

                if (newNum < currentMinNum)
                    currentMinNum = newNum;

            }
        }

        System.out.println();
        System.out.print("Min Value in array: ");

        return currentMinNum;

    }
}