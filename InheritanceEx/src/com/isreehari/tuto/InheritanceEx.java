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
        
        // Object class
        
        Object o = new Flight[5];
        
         o = new CargoFlight();
        
       // o.add1Package(1.0, 2.5, 3.0);
       
       if(o instanceof CargoFlight){
         CargoFlight cf4 = (CargoFlight) o;       
         cf.add1Package(1.4f, 14.0f, 1.2f);
    }
       
       // Object Equality
       
       Flight ftt1 = new Flight(175);
       Flight ftt2 = new Flight(175);
       
       System.out.println("*********************************************");
       if(ftt1.equals(ftt2))
       System.out.println(ftt1);
       System.out.println(ftt2);
       System.out.println("*********************************************");       
       
       
       ftt2 = ftt1; // testing super special reference.
       
       System.out.println("*********************************************");
       if(ftt1.equals(ftt2))
       System.out.println(ftt1);       
       System.out.println("*********************************************");       
       
       
       
       
       
      
        
        
        
                
        
        
       
    }
    
}
