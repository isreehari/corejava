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
public class ConditionalLoopArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float students = 0.0f;
        float rooms = 4.0f;
        
        if(students > 0.0f){
            if( rooms > 0.0f)
            System.out.println(students/rooms);
        }            
        else
            System.out.println("No Students");
        
        
        
        
        // logical operators
        boolean valA = false;
        boolean valB = true;
        
        if( valA ^ valB )
        {
            System.out.println(" True Condtion ");
        }
        else{
            System.out.println(" False Condtion ");
        }
        
        
        int numberStudents = 150 ;
        int numberRooms = 0;
        
//        if(numberRooms > 0 & numberStudents / numberRooms > 30){
//            System.out.println("Crowded");
//        }

if(numberRooms > 0 && numberStudents / numberRooms > 30){
            System.out.println("Crowded");
        }
        
        
        System.out.println();
        System.out.println("** end programm **");        
        
                    
        
    }
    
}
