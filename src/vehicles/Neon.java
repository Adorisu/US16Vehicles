/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author ucint
 */
public class Neon extends Vehicle {

    @Override
    public String toString() {
        String state = super.toString(); 
        
        return "Neon " + state; 
                
    }
    
}
