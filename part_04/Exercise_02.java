package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class OhYeah {

    public static void main(String[] args) {

        int arr[] = new int[2018];

        for (int i = 0; i <= 2017; i++){
            arr[i] = i;
        }

        for (int i = 2017; i >= 1; i= i-2)
            System.out.println(arr[i]);


    }


}
