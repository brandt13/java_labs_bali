package part_07.part7;

import java.util.Scanner;

public class Cafe implements FoodServiceBusiness {

    private static String[] coffeeTypes;
    private static String[] coffeeDrinks;
    private static double[] coffeePrice;

    private static boolean milk;

    private static String[] teaTypes;
    private static double[] teaPrice;

    private static String[] pastries;
    private static double[] pastryPrice;

    private static String baristaName;
    private static String album;
    private static String artist;


    private static double totalPrice = 0.00;
    private static double payment = 0.00;


    public static void main(String[] args) {

        createCoffeeShop();

        showMenu();

        System.out.println();
        System.out.print("What would you like today? Enter a number to order: ");

        makeAnOrder();

        System.out.println();

        wantAnythingElse();

        calculatePaymentAndChange();


    }

    // Constructors //////////////////////////////////

    public Cafe(String baristaName) {
        this.baristaName = baristaName;
    }

    public Cafe(String artist, String album) {
        this.artist = artist;
        this.album = album;
    }

    public Cafe() {
    }

    // Interface Methods ////////////////////////////////////
    // Could build all of these out, but want to move on ///

    public void dateTimeCheckAndCustomerNumber(){
    }

    static void cleanBusiness(){
    }

    static void calculatePaymentAndChange(){

        System.out.println();
        System.out.println("Alright, that comes to $" + totalPrice + "0.");
        System.out.println("You can pay me with exact change, or I can give you change back.");
        System.out.print("Enter how much you'll be paying with: $");

        Scanner x = new Scanner(System.in);
        payment = x.nextDouble();

        if (payment == totalPrice){

            System.out.println();
            System.out.println("Thank you, enjoy!");
        }

        while (payment < totalPrice){

            System.out.println();
            System.out.print("This isn't enough money. Please give me an exact or higher amount: $");

            payment = x.nextDouble();
        }

        if (payment > totalPrice){

            double change = payment - totalPrice;

            System.out.println("Thank you! Here is your change: $" + change + " Have a nice day!");
        }
    }

    // Methods ///////////////////////////////////////



    public static void wantAnythingElse(){

        int anythingElse;
        int menuAgain;

        System.out.print("Would you like anything else? Enter 1 for yes or 0 for no: ");

        Scanner scanner = new Scanner(System.in);
        anythingElse = scanner.nextInt();

        while (anythingElse > 1 || anythingElse < 0) {
            System.out.print("Please enter a valid choice: ");
            anythingElse = scanner.nextInt();
        }

        if (anythingElse == 0) return;

        do {

            System.out.println();
            System.out.print("Need to see the menu again? 1 for yes or 0 for no: ");
            menuAgain = scanner.nextInt();

            if (menuAgain == 1) {

                System.out.println();
                showMenu();
                System.out.println();
            }

            while (menuAgain > 1 || menuAgain < 0) {
                System.out.print("Please enter a valid choice: ");
                menuAgain = scanner.nextInt();

                if (menuAgain == 1) {
                    System.out.println();
                    showMenu();
                    System.out.println();
                }

            }

            System.out.print("What else would you like? Enter a number: ");

            makeAnOrder();

            System.out.print("Would you like anything else? Enter 1 for yes or 0 for no: ");

            anythingElse = scanner.nextInt();

            while (anythingElse > 1 || anythingElse < 0) {
                System.out.print("Please enter a valid choice: ");
                anythingElse = scanner.nextInt();
            }

        } while (anythingElse == 1);

    }

    public static void makeAnOrder(){

        Scanner scanner = new Scanner(System.in);
        int order;
        int coffeeRegion;

        do {
            order = scanner.nextInt();

            if (order >= 1 && order <= 6){

                totalPrice += coffeePrice[order-1];
                System.out.println();
                System.out.println("Okay! A(n) " + coffeeDrinks[order-1] + " coming right up. ");
                System.out.println();
                System.out.println("We have coffee from all over the world. Which would you like in your drink?");
                System.out.println("Countries to choose from: ");

                for (int i = 0; i < coffeeTypes.length; i++){
                    System.out.println((i+1) + ". " + coffeeTypes[i]);
                }

                System.out.println();
                System.out.print("Enter a number to choose: ");

                do{
                    coffeeRegion = scanner.nextInt();
                    if (coffeeRegion < 1 || coffeeRegion > 4) System.out.print("Please enter a valid choice: ");
                } while (coffeeRegion < 1 || coffeeRegion > 4);

                System.out.println("Great :) A(n) " + coffeeDrinks[order-1] + " with " + coffeeTypes[coffeeRegion-1] + " coffee.");
            }

            if (order >= 7 && order <= 12){

                totalPrice += teaPrice[order-7];
                System.out.println();
                System.out.println("Okay! A(n) " + teaTypes[order-7] + " tea coming right up. ");
            }

            if (order >= 13 && order <= 16){

                totalPrice += pastryPrice[order-13];
                System.out.println();
                System.out.println("Mmm! A(n) " + pastries[order-13] + " coming right up. ");
            }

            if (order > 16 || order < 1){
                System.out.print("Please enter a valid order: ");
            }

        } while ((order > 16 || order < 1));

        System.out.println();
        System.out.println("Your current total is $" + totalPrice + "0");


    }

    public static void createCoffeeShop(){

        // Creating coffee drinks and their prices

        CoffeeTea createCoffee = new CoffeeTea();           // Setting different types of coffee for a customer
        createCoffee.setCoffeeTypes();                      // to choose

        CoffeeTea createCoffeeDrinks = new CoffeeTea();     // Setting different coffee drinks to choose from
        createCoffeeDrinks.setCoffeeDrinks();

        CoffeeTea createCoffeePrice = new CoffeeTea();      // Setting the different coffee prices
        createCoffeePrice.setCoffeePrice();                 // etc, etc..

        // Creating tea drinks and their prices

        CoffeeTea createTeaDrinks = new CoffeeTea();
        createTeaDrinks.setTeaTypes();

        CoffeeTea createTeaPrice = new CoffeeTea();
        createTeaPrice.setTeaPrice();

        // Creating pastries & prices

        Pastries pastryTypes = new Pastries();
        pastryTypes.setPastries();

        Pastries createPastryPrice = new Pastries();
        createPastryPrice.setPastryPrice();

        // Creating barista and the music they play, using super in Barista

        Barista tommy = new Barista("Tommy");
        Barista music = new Barista("John Coltrane", "A Love Supreme");

        System.out.println();
        System.out.println("Hi! Welcome to Stumptown. I'm " + baristaName + ". Hope you like the music! It's " + artist + "'s album "
        + album + ".");
        System.out.println("Anyway, here is our menu: ");

    }

    public static void showMenu (){ // anyway....

        System.out.println();
        System.out.println("Coffee:\t\t\t\t\tTea:\t\t\t\t\t\t\tPastries:");

        for (int i = 0; i < coffeeDrinks.length; i++){      // loop

            System.out.print((i+1) + ". $" + coffeePrice[i] + "0 " + coffeeDrinks[i]);

            for (int j = i; j < teaTypes.length; j++){      // loop

                if (i == 4) {
                    System.out.print("\t");             // pause here. there are loops involved, which you don't
                }                                       // know how they work
                if (i == 5)
                    System.out.print("\t" + (i+7) + ".\t$" + teaPrice[i] + "0 " + teaTypes[i]);
                else System.out.print("\t\t" + (i+7) + ".\t$" + teaPrice[i] + "0 " + teaTypes[i]);

                if (j == i) break;
            }

            for (int x = i; x < pastries.length; x++){      // loop

                if (x == 0) System.out.print("\t\t\t");
                if (x == 1) System.out.print("\t");
                if (x == 2) System.out.print("\t");
                if (x == 3) System.out.print("\t\t\t");

                System.out.println("\t" + (i+13) + ". $" + pastryPrice[i] + "0 " + pastries[i]);

                if (x == i) break;
            }

            for (int y = i; y < coffeeDrinks.length; y++){    // loop

                if (y > 3) System.out.println();
                if (y == i) break;
            }
        }


    }


    // Getters and Setters //////////////////////////////


    public String[] getCoffeeTypes() {
        return coffeeTypes;
    }

    public void setCoffeeTypes(String[] coffeeTypes) {

        this.coffeeTypes = coffeeTypes;

    }

    public String[] getCoffeeDrinks() {
        return coffeeDrinks;
    }

    public void setCoffeeDrinks(String[] coffeeDrinks) {
        this.coffeeDrinks = coffeeDrinks;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public String[] getTeaTypes() {
        return teaTypes;
    }

    public void setTeaTypes(String[] teaTypes) {
        this.teaTypes = teaTypes;
    }

    public String[] getPastries() {
        return pastries;
    }

    public void setPastries(String[] pastries) {
        this.pastries = pastries;
    }

    public String getBaristaName() {
        return baristaName;
    }

    public void setBaristaName(String barista) {
        this.baristaName = barista;
    }

//    public String getAlbumAndArtist() {
//        return albumAndArtist;
//    }
//
//    public void setAlbumAndArtist(String albumAndArtist) {
//        this.albumAndArtist = albumAndArtist;
//    }

    public static double[] getCoffeePrice() {
        return coffeePrice;
    }

    public static void setCoffeePrice(double[] coffeePrice) {
        Cafe.coffeePrice = coffeePrice;
    }

    public static double[] getTeaPrice() {
        return teaPrice;
    }

    public static void setTeaPrice(double[] teaPrice) {
        Cafe.teaPrice = teaPrice;
    }

    public static double[] getPastryPrice() {
        return pastryPrice;
    }

    public static void setPastryPrice(double[] pastryPrice) {
        Cafe.pastryPrice = pastryPrice;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(double totalPrice) {
        Cafe.totalPrice = totalPrice;
    }
}
