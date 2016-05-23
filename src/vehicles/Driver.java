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

        // print the current state of the vehicle.
        System.out.println(myVehicle.toString());
        
        // prompt user
        String strGallonsOfGas = JOptionPane.showInputDialog("Enter gallons of gas");
        
        // convert the string return to a double
        double dblGallonsOfGas = Double.parseDouble(strGallonsOfGas);
        
        // set the attributes in myVehicle object.
        myVehicle.setGallonsOfGas(dblGallonsOfGas);
        
        final String strMilesPerGallon = JOptionPane.showInputDialog("Enter miles per gallon");
        
        final int intMilesPerGallon = Integer.parseInt(strMilesPerGallon);
        
        myVehicle.setMilesPerGallon(intMilesPerGallon);
        
        final String strOdometer = JOptionPane.showInputDialog("Enter odometer");
        final int intOdometer = Integer.parseInt(strOdometer);
        
        myVehicle.setOdometer(intOdometer);
        
        final String strDistanceTravelled = JOptionPane.showInputDialog("Enter distance to travel");
        final int intDistance = Integer.parseInt(strDistanceTravelled);
        
        // print the current state of the vehicle.
        System.out.println(myVehicle.toString());
        
        // move the vehicle
        myVehicle.go(intDistance);
        
        // print the current state of the vehicle.
        System.out.println(myVehicle.toString());
        
    }
    
}
