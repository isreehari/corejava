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
public class Flight implements Comparable<Flight>, Iterable<Passenger>{
    private int flightNumber; 
    private int flightTime;
    private Passenger[] listPassengers; 
    
    public Flight(){}
    public Flight(int flightNumber){
        this.flightNumber = flightNumber; 
    }   
    public Flight(int flightNumber, int flightTime){
        this.flightNumber = flightNumber; 
        this.flightTime = flightTime; 
    }
    
    public int compareTo(Flight f){
            return this.flightTime - f.flightTime;
    }
    
    public Iterable<Passenger> iterator(Passenger p){
    
            
    }
    
}
