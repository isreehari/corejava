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
public class Parameters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int val1 = 10;
    int val2 = 20;
    
//    System.out.println(val1);
//    System.out.println(val2);
//    
//     swap(val1, val2);
//     
//    System.out.println(val1);
//    System.out.println(val2);
//    

        Flight x = new Flight(6);        
        Flight y = new Flight(8);
        
        System.out.println("**************************");
        System.out.println(x.flightNumber);
        System.out.println(y.flightNumber);
        System.out.println("**************************");
        
        swapClassObj(x,y);
        
        System.out.println("**************************");
        System.out.println(x.flightNumber);
        System.out.println(y.flightNumber);
        System.out.println("**************************");
    
    
        
    }
    
    public static void swap(int a, int b){
        
        int c = b;
        b = a;
        a = c;
        
        System.out.println(a);
        System.out.println(b);
        
    }
    
    public static void swapClassObj(Flight i, Flight j){
        
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
        
        System.out.println("**************************");
        System.out.println(i.flightNumber);
        System.out.println(j.flightNumber);
        System.out.println("**************************");
        
       
              
    }
    
    
    
}
