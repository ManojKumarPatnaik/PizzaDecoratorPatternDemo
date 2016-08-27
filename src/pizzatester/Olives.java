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
public class Olives extends Topping {
    
    public Olives(Pizza newPizza) {
        super(newPizza);
        
        System.out.println("Adding olives to pizza");
    }
    
    @Override
    public String getDescription() {
        
        return tempPizza.getDescription() + ", Olives";
    }
    
    @Override
    public double getCost() {
        
        return tempPizza.getCost() + .75;
    }
}
