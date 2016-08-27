/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzatester;

/**
 *
 * @author Brannon R. Brakefield
 */
public class Onions extends Topping {
    
    public Onions(Pizza newPizza) {
        super(newPizza);
        
        System.out.println("Adding onions to pizza");
    }
    
    @Override
    public String getDescription() {
        
        return tempPizza.getDescription() + ", Onions";
    }
    
    @Override
    public double getCost() {
        
        return tempPizza.getCost() + .50;
    }
}
