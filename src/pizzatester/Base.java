/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzatester;

/**
 * Concrete class 
 * @author Brannon R. Brakefield
 */
public class Base implements Pizza {
    
    
    public String getDescription(){
        return "Ambigous Pizza Crust";
    }
    
    public double getCost(){
     return 0.00;
    }
}
