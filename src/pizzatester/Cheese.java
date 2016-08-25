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
public class Cheese extends Topping{
    
    public Cheese(Pizza newPizza){
        super(newPizza);
            
        System.out.println("Adding cheese to pizza");
    }
    
     public String getDescription(){
        
        return tempPizza.getDescription()+ ", Cheese";
    }
    
    public double getCost(){
        
        return tempPizza.getCost()+ 1.00;
    }
}
