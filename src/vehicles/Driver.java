/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import javax.swing.JOptionPane;

/**
 *
 * @author ucint
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("In driver main");
        
        // call the prompt user method
        promptUser();
    }
    
    public static void promptUser() {
        System.out.println("In prompt user");
        
        // create an object of type Vehicle, and store it in the variable myVehicle
        Vehicle myVehicle = new Vehicle();
        
        // set the attributes in myVehicle object.
        myVehicle.setGallonsOfGas(12.0);
        myVehicle.setMilesPerGallon(20);
        myVehicle.setOdometer(10000);
        
        // move the vehicle
        myVehicle.go(40);
        
        // print the current state of the vehicle.
        System.out.println(myVehicle.toString());
        
    }
    
}
