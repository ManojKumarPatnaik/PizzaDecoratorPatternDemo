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
public class Mushrooms extends Topping {
    
    public Mushrooms(Pizza newPizza) {
        super(newPizza);
     
        System.out.println("Adding mushrooms to pizza");
    }
    
    @Override
    public String getDescription() {
        
        return tempPizza.getDescription() + ", Mushrooms";
    }
    
    @Override
    public double getCost() { 
        
        return tempPizza.getCost() + 1.00;
    }
}
