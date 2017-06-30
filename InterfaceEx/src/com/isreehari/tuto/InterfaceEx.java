/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.tuto;

import java.util.Arrays;

/**
 *
 * @author sinukoll
 */
public class InterfaceEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Passenger p1 = new Passenger("p1", 1, 145);
        Passenger p2 = new Passenger("p2",3, 130);
        Passenger p3 = new Passenger("p3",2, 145);
        Passenger p4 = new Passenger("p4",3, 130);
        Passenger p5 = new Passenger("p5",2, 180);
        Passenger p6 = new Passenger("p6",1, 190);
        
        Passenger[] listPassengers ={ p1, p2, p3, p4, p5, p6 };
        
        Arrays.sort(listPassengers); 
        
        for(Passenger p: listPassengers)
            System.out.println("Passenger: " + p.getMemberName());
        
    }
    
}
