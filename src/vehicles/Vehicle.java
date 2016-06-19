/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author jonesbr
 */
public class Vehicle {
    
    private double gallonsOfGas;
    private int milesPerGallon;
    private int odometer;


    /**
     * Move this car the specified distance.
     * @param distance 
     */
    public void go(int distance) {
        // compute gallons consumed
        double gallonsConsumed = distance/milesPerGallon;
        // subtract gallons consumed from gallons of gas.
        gallonsOfGas = gallonsOfGas - gallonsConsumed;
        
        // increase odometer, using shortcut.
        odometer += distance;
        
    }
    
    /**
     * @return the gallonsOfGas
     */
    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    /**
     * @param gallonsOfGas the gallonsOfGas to set
     */
    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    /**
     * @return the milesPerGallon
     */
    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    /**
     * @param milesPerGallon the milesPerGallon to set
     */
    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    /**
     * @return the odometer
     */
    public int getOdometer() {
        return odometer;
    }

    /**
     * @param odometer the odometer to set
     */
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        return "Gallons of Gas: " + gallonsOfGas + " Odometer: " + odometer;
    }
    
    
    
}
