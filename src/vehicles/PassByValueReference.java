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
public class PassByValueReference {
    
    public static void main(String[] args) {
        Vehicle neon = new Neon();
        neon.setGallonsOfGas(10);
        neon.setMilesPerGallon(10);
        neon.setOdometer(10000);
        
        Vehicle cavalier = new Cavalier();
        cavalier.setGallonsOfGas(20);
        cavalier.setMilesPerGallon(20);
        cavalier.setOdometer(20000);
        
        int firstTrip = 100;
        int secondTrip = 200;
        
        moveVehicles(neon, cavalier, firstTrip, secondTrip);
        
        System.out.println("Neon: " + neon);
        System.out.println("Cavalier: " + cavalier);
        System.out.println("Trip 1: " + firstTrip + " Trip 2: " + secondTrip);
    }

    private static void moveVehicles(Vehicle neon, Vehicle cavalier, int firstTrip, int secondTrip) {
       firstTrip = 300;
       secondTrip = 400;
       
       cavalier = new Cavalier();
       cavalier.setGallonsOfGas(30);
       cavalier.setMilesPerGallon(30);
       cavalier.setOdometer(30000);   
       
       neon.setGallonsOfGas(40);
       neon.setMilesPerGallon(40);
       neon.setOdometer(40000);
    }
}
