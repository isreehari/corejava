/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.tuto;
//import com.isreehari.tuto.Flight;

/**
 *
 * @author sinukoll
 */
public class FirstClassEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Flight theFlight = new Flight();
        System.out.println(" ************* Available seats **************** ");        
        System.out.println(theFlight.getAvailableSeats());
        System.out.println(" ************* End Available seats *************");
        
        System.out.println(" ************* Add & Available seats **************** ");        
        theFlight.addPassenger();
        System.out.println(theFlight.getAvailableSeats());
        System.out.println(" ************* End Available seats *************");
        
        
        
        Flight theFlight1 = new Flight();
        Flight theFlight2 = new Flight();
        
        theFlight1.addPassenger();        
        System.out.println(" ************* Add passenger to flight1 & Available seats **************** ");                
        System.out.println(theFlight1.getAvailableSeats());
        System.out.println(" ************* End Available seats *************");
        
        System.out.println(" ************* flight2 & Available seats **************** ");                
        System.out.println(theFlight2.getAvailableSeats());
        System.out.println(" ************* End Available seats *************");
        
        theFlight2 = theFlight1;
        
        System.out.println(" ************* flight2 & Available seats **************** ");                
        System.out.println(theFlight2.getAvailableSeats());
        System.out.println(" ************* End Available seats *************");
        
                // theFligt2.passengers -- private access modifier - compile time error.
                // theFligt2.handleTooMany -- private access modifier - compile time error.
                
        Flight theFlight3 = new Flight();
        Flight theFlight4 = new Flight();
        
        theFlight3.setSeats(120); 
        theFlight4.setSeats(130); 
        
        Flight theFlight5 = null;
        
        if(theFlight3.hasRoom(theFlight4)){
            System.out.println("Room is available");
            theFlight5 = theFlight3.createNewWithBoth(theFlight4);
        }
            
        else
            System.out.println("Room is not available");
        
        
        if(theFlight5 != null)
            System.out.println(theFlight5.getAvailableSeats());
                
        
        
    }
    
}
