/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzatester;

/**
 *
 * @author brann
 */
public class PizzaTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza pizza1 = new Mushrooms(new Cheese(new Thick()));
        System.out.println();
        
        Pizza pizza2 = new Olives(new Onions(new Pepperoni(new Thin())));
        System.out.println();
        
        System.out.println("Description: " + pizza1.getDescription());
        System.out.printf("The price of your pizza is $%.2f\n"
                    , pizza1.getCost());
        System.out.println();
        
        System.out.println("Description: " + pizza2.getDescription());
        System.out.printf("The price of your pizza is $%.2f\n"
                    , pizza2.getCost());
        System.out.println();
    }
    
}
