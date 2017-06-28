/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.tuto;

/**
 *
 * @author sinukoll
 */
public class InheritanceEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CargoFlight cf = new CargoFlight();
        cf.add1Package(6.0f, 200.0f, 1.0f);
        
        cf.addPassenger();
        
        System.out.println("**************************");
        System.out.println(cf.getAvailableSeats());
        System.out.println("**************************");
        
        
        Flight f = new CargoFlight();
        
        f.addPassenger();
        
        // f.add1Package(1.0f, 2.5f, 1.5f);  // its not a valid call.
        
        System.out.println("**************************");
        System.out.println(cf.getAvailableSeats());
        System.out.println("**************************");
        
        
        Flight f1 = new Flight();
        System.out.println(f1.seats);
        
        CargoFlight cf1 = new CargoFlight();        
        System.out.println(cf1.seats);
        
        System.out.println(cf1.getAvailableSeats());
        
        Flight f2 = new CargoFlight();
        System.out.println(f2.seats);
        
        // Function over riding 
        
        Flight f3 = new CargoFlight();
        System.out.println(f3.seats);
        
         CargoFlight cf2 = new CargoFlight();        
        System.out.println(cf2.seats);

        System.out.println("*****************************");
        
        Flight f4 = new CargoFlight();       
        f4.addPassenger();
        System.out.println(f4.getAvailableSeats());
        
         CargoFlight cf3 = new CargoFlight();        
         cf3.addPassenger();
        System.out.println(cf3.getAvailableSeats());        
        System.out.println("*****************************");
        
                
        
        
       
    }
    
}
