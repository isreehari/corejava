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
public class Addition extends CalculateBase {
    
    public Addition(){}
    public Addition(double leftValue, double rightValue){
        super(leftValue, rightValue);
    }
    
    @Override
     public void execute(){         
         setResultValue(getLeftValue() + getRightValue());          
     }
}
