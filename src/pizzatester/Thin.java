/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzatester;

/**
 * Concrete thin crust class that is an extension of the simple base class
 * and shall become decorated by the subclasses of Topping.
 * @author Brannon R. Brakefield
 */
public class Thin extends Base {
    
    @Override
     public String getDescription() {
         
        return "Thin crust w/ Sweet Sauce";
    }
    
    @Override
     public double getCost() {
         
         return 2.50;
    }
}
