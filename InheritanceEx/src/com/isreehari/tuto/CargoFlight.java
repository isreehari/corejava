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
public class CargoFlight extends Flight {
    
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;
    int seats = 12; 
    
    @Override
    int getSeats(){
        
        return 12;
    }
    
    
//    public int getAvailableSeats(){
//        return this.seats;
//    }
    
    public void add1Package(float h, float w, float d){
        double size = h * w * d;
        
        System.out.println(size);
        
        if(hasCargoSpace(size)){
            this.usedCargoSpace += size;
        } else{
            handleNoSpace();
        }
        
    }
    
    private boolean hasCargoSpace(double size){
        return this.usedCargoSpace + size <= this.maxCargoSpace; 
    }
    
    private void handleNoSpace(){
        System.out.println("No space available");
    }
    
    
}
