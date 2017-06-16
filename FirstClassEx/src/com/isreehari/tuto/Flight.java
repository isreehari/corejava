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
    private int passengers;
    private int seats;
    
    public Flight(){
        this.seats = 150;
        this.passengers = 0;
    }
    
   public void addPassenger(){
        if(this.passengers < this.seats){
            this.passengers += 1;
        }
        else
            handleTooMany();
    }
    
    public int getAvailableSeats(){
        return this.seats - this.passengers;
    }
    
    private void handleTooMany(){
        System.out.println("Too many");
    }
    
    public boolean hasRoom(Flight f2){
        int total = this.passengers + f2.passengers;
        return total <= this.seats; 
    }
    
    public Flight createNewWithBoth(Flight f2){
        Flight thisFlight = new Flight();        
        thisFlight.seats = this.seats + f2.seats;
        thisFlight.passengers = this.passengers + f2.passengers;
        
        return thisFlight;
    }
    
    public void setSeats(int seats){
        this.seats = seats; // Accessors and Mutators
    }
    
}
