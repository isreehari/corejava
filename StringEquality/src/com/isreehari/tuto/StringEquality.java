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
public class StringEquality {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1 = "Hi Sreehari";
               s1 += " Java";
        String s2 = "Hi";
               s2 += " Sreehari Java";
         
        if( s1 == s2)
            System.out.println("Two stings are equal");
        else
            System.out.println("Two stings are not equal");
        
        if(s1.equals(s2))
                System.out.println("Two stings are equal");
        else
            System.out.println("Two stings are not equal");
        
        String s3 = s1.intern();        
        String s4 = s2.intern();
        
        if(s1.intern() == s2.intern())
            System.out.println("Two stings are equal");
            else
            System.out.println("Two stings are not equal");
        
        int iVal = 115; 
        String jVal = String.valueOf(iVal);
        System.out.println(jVal);
        
        System.out.println("**************** To String method overriding *******************");
        FlightEx f1 = new FlightEx(175);
        System.out.println("My flight is : " + f1.toString());
        System.out.println("***********************************");
        
        System.out.println("************* StringBuilder **********************");
        
        StringBuilder sb = new StringBuilder(40);
        
        FlightEx myFlight = new FlightEx(145);
        String location = "Lubbock";
        int time = 9;
        
        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on ");
        sb.append(myFlight);
        
        // inserting new word into stringbuilder
        
        int pos = sb.length() - " on ".length() - myFlight.toString().length();
        
        sb.insert(pos, " at ");
        sb.insert(pos + 4, time);
        
        String message = sb.toString();
        
        System.out.println(sb.capacity());
        System.out.println(message);
        
        System.out.println("***********************************");
        
               
        
    }
    
}
