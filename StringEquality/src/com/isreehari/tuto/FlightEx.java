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
public class FlightEx {
    private int flightNumber;
    private char flightClass;
    
    public FlightEx(){}    
    public FlightEx(int flightNumber){ this.flightNumber = flightNumber; }
    public FlightEx(char flightClass){ this.flightClass = flightClass; }
    public FlightEx(int flightNumber, char flightClass){ this.flightNumber = flightNumber; this.flightClass = flightClass; } 
    
    @Override
    public String toString(){
        if(this.flightNumber > 0 )
            return "Flight #"+ this.flightNumber;
        else
            return "Flight Class "+  this.flightClass; 
    }
    
}
