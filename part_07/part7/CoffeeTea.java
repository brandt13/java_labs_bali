package part_07.part7;

public class CoffeeTea extends Barista {    // i.e. Barista can make 'x' for customer

    public void setCoffeeTypes(){

        setCoffeeTypes(new String[] {"Columbian", "Guatamalan", "Ethiopian", "Kenyan"});
    }

    public void setCoffeeDrinks(){

        setCoffeeDrinks(new String[] {"Cappuccino", "Americano", "Espresso", "Macchiato", "Mocha", "Drip Coffee"});
    }

    public void setCoffeePrice(){

        setCoffeePrice(new double[] {3.00, 1.50, 1.50, 2.00, 4.00, 1.00});
    }

    public void setTeaTypes(){

        setTeaTypes(new String[] {"Earl Grey", "English Breakfast", "Irish Breakfast", "Sencha", "Lapsang Suchong", "Matcha"});
    }

    public void setTeaPrice(){

        setTeaPrice(new double[] {2.00, 2, 1.50, 2.00, 4.00, 1.00});
    }

}
