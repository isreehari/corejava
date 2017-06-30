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
public class Passenger implements Comparable<Passenger> {
    private String memberName;
    private int memberLevel;
    private int memberDays;
    
    public Passenger(){}
    public Passenger(String memberName, int memberLevel, int memberDays){
        this.memberName = memberName;
        this.memberLevel = memberLevel;
        this.memberDays = memberDays;
    }
    
    public String getMemberName(){
        return this.memberName; 
    }
    
    public int compareTo(Passenger p){        
        if(memberLevel > p.memberLevel)
            return -1;
        else if (memberLevel < p.memberLevel)
            return 1;
        else {
            if(memberDays > p.memberDays)
                return -1;
            else if(memberDays < p.memberDays)
                   return 1;
            else
                return 0;
        }
    }
    
}
