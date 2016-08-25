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
public abstract class Topping implements Pizza {
    
    protected Pizza tempPizza;
    
    public Topping(Pizza newPizza){
        
        tempPizza = newPizza;
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription();
    }
    
    public double getCost(){
        
        return tempPizza.getCost();
    }
}
