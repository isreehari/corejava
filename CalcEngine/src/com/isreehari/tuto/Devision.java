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
public class Devision extends CalculateBase {
    
    
    public Devision(){}
    public Devision(double leftValue, double rightValue){
        super(leftValue, rightValue);
    }
    
    @Override
     public void execute(){         
         if(getRightValue() != 0.0d)
            setResultValue(getLeftValue() / getRightValue());          
         else
             setResultValue(0.0d);          
     }
    
}
