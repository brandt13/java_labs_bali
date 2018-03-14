package part_07.part7;

public class Pastries extends Barista {     // i.e. Barista can make 'x' for customer

    public void setPastries(){

        setPastries(new String[] {"Pear Danish", "Blueberry Scone", "Pain au Chocolat", "Ham and Cheese Croissant"});
    }

    public void setPastryPrice(){

        setPastryPrice(new double[] {3.00, 2.50, 3.50, 4.00});
    }

}
