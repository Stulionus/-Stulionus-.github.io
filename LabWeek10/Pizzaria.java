/**
 * Pizzaria class: for making Pizzas and testing their methods.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Pizzaria {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza('M', 1, 1, false);
        String whatspizza1 = pizza1.getDescription();
        System.out.println(whatspizza1);

        Pizza orderOne = new Pizza();
        double cost1 = orderOne.calcCost();
        System.out.printf("\n" + "pizzaOne: size = " + orderOne.getSize() + ", meat toppings = "
            + orderOne.getMeatToppings() + ", veg toppings = " + orderOne.getVeggieToppings()
            + ", " + "isVegan = " + orderOne.isVegan() + ", your total = $" + "%.2f", cost1);

        System.out.println("\n" + orderOne.getDescription());                    

        Pizza orderTwo = new Pizza('S', 2, 4, false);
        double cost2 = orderTwo.calcCost();
        System.out.printf("\n" + "pizzaTwo: size = " + orderTwo.getSize() + ", meat toppings = "
            + orderTwo.getMeatToppings() + ", veg toppings = "  + orderTwo.getVeggieToppings()
            + ", " + "isVegan = " + orderTwo.isVegan() + ", your total = $" + "%.2f", cost2);

        System.out.println("\n" + orderTwo.getDescription());                     

        Pizza orderThree = new Pizza('L', 2, 4, false);
        double cost3 = orderThree.calcCost();
        System.out.printf("\n" + "pizzaThree: size = " + orderThree.getSize() + ", meat toppings = " 
            + orderThree.getMeatToppings() + ", veg toppings = "  + orderThree.getVeggieToppings()
            + ", " + "isVegan = " + orderThree.isVegan() + ", your total = $"  + "%.2f", cost3);

        System.out.printf("\n" + orderThree.getDescription());
        System.out.println();

        Pizza orderFour = new Pizza('L', 1, 1, false);
        double cost4 = orderFour.calcCost();
        System.out.printf("\n" + "pizzaFour: size = " + orderFour.getSize() + ", meat toppings = "
            + orderFour.getMeatToppings() + ", veg toppings = "  + orderFour.getVeggieToppings()
            + ", " + "isVegan = " + orderFour.isVegan() + ", your total = $" + "%.2f", cost4 );  

        System.out.println("\n" + orderFour.getDescription());     
    }
}
