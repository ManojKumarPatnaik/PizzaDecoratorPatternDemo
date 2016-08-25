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
public class Thin extends Base {
    
    @Override
     public String getDescription(){
        return "Thin crust w/ Sweet Sauce";
    }
    
    @Override
     public double getCost(){
         return 2.50;
    }
}
