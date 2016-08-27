/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzatester;

/**
 * Model for the concrete thick and thin crust components.
 * @author Brannon R. Brakefield
 */
public class Base implements Pizza {
    
    @Override
    public String getDescription() {
        
        return "Ambigous Pizza Crust";
    }  
    
    @Override
    public double getCost() {
        
        return 0.00;
    }
}
