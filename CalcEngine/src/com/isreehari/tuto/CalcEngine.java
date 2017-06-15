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
public class CalcEngine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double val1 = 100.0d;
        double val2 = 50.0d;
        double result;
        char opCode = 'a';
        
        if(opCode == 'a')
            result = val1 + val2;
        else if(opCode == 's')
            result = val1 - val2;
        else if(opCode == 'd')
            result = val1 / val2;
        else if( opCode == 'm')
            result = val1 * val2;
        else
            result = 0.0d;
        
        System.out.println(result);
            
        
    }
    
}
