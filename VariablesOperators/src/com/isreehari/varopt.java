/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari;

/**
 *
 * @author sinukoll
 */
public class varopt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;
        
        int result1 = valA - valB / valC ;
        int result2 = (valA - valB) / valC ;
        
        System.out.println(result1);
        System.out.println(result2);
        
        int result3 = valA * valC / valD + valB;
        int result4 = valA / (valC * (valD + valB));
        
        System.out.println(result3);
        System.out.println(result4);
        
        
        ///Type conversions 
        
        
        float floatVal = 1.0f;
        double doubleval = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;
        
        short result11 = (short)longVal;
        short resutl12 = (short) (byteVal - longVal);

        
    }
    
}
