import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Pizza {
    private char size;
    private int numMeatToppings;
    private int numVeggieToppings;
    private boolean veganFriendly;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Pizza(){
        size = 'M';
        numMeatToppings = 0;
        numVeggieToppings = 0;
        veganFriendly = false;
    }

    public Pizza(char sizeArg, int meatToppings, int veggieToppings, boolean vegan){
        if (sizeArg == 'S' || sizeArg == 'M' || sizeArg == 'L'){
            size = sizeArg;
        }else {
            throw new IllegalArgumentException("The pizza can only be small, medium or large");
        }
        if (meatToppings >= 0){
            numMeatToppings = meatToppings;
        }else {
            throw new IllegalArgumentException("Number of toppings cannot be negative");
        }
        if (veggieToppings >= 0){
            numVeggieToppings = veggieToppings;
        }else {
            throw new IllegalArgumentException("Number of toppings cannot be negative");
        }
        veganFriendly = vegan;
    }

    public void setSize(char sizeArg){
        size = sizeArg;
    }

    public void setNumMeatToppings(int meatToppings){
        numMeatToppings = meatToppings;
    }

    public void setNumVeggieToppings(int veggieToppings){
        numVeggieToppings = veggieToppings;
    }

    public void setVeganFriendly(boolean isVegan){
        veganFriendly = isVegan;
    }

    public char getSize(){
        return  size;
    }

    public int getMeatToppings(){
        return numMeatToppings;
    }

    public int getVeggieToppings(){
        return numVeggieToppings;
    }

    public boolean isVegan(){
        return veganFriendly;
    }


    public double calcCost(){
        double pizzaCost;
        double basePrice = 0;
        if (size == 'S'){
            basePrice = 10;
        } else if (size == 'M'){
            basePrice = 12;
        }else if (size == 'L'){
            basePrice = 14;
        }
        pizzaCost = basePrice + (numMeatToppings * 2) + (numVeggieToppings);
        if (veganFriendly){pizzaCost= pizzaCost + 2;}
        return pizzaCost;
    }

    public String getDescription(){
        String description = "This pizza is " + size + ". It has " + numMeatToppings + " meat toppings and " +
                numVeggieToppings + " veggie toppings. \n";
        if (veganFriendly){
            description = description.concat("It is vegan-friendly");
        }else if (!veganFriendly){
            description = description.concat("It is not vegan-friendly");
        }
        description = description.concat("\n");
        description = description.concat("The price is " + calcCost());
        return description;
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza('L',6,4,false);
        System.out.println(pizza2.getDescription());
    }
}
