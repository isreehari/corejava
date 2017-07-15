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
public class Flight {
    
    int flightNumber;
    
    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
    }
    
    
    public void setFlightNumber( int flightNumber){
        this.flightNumber = flightNumber;
    }
    
    public int getFlightNumber(){        
        return this.flightNumber;
    }
    
}
