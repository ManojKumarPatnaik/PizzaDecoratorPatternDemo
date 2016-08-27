/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzatester;

/**
 * Concrete thick crust class that is an extension of the simple base class
 * and shall become decorated by the subclasses of Topping.
 * @author Brannon R. Brakefield
 */
public class Thick extends Base {
    
    @Override
    public String getDescription() {
        
        return "Thick crust w/ Spicy Sauce";
    }
    
    @Override
     public double getCost() {
         
         return 3.00;
    }
}
