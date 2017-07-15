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
public abstract class CalculateBase {
    private double leftValue;
    private double rightValue;    
    private double resultValue;
    
    public void setLeftValue(double leftValue){ this.leftValue = leftValue; }    
    public double getLeftValue(){ return this.leftValue; }
    public void setRightValue(double rightValue){ this.rightValue = rightValue; }    
    public double getRightValue(){ return this.rightValue; }    
    public void setResultValue(double resultValue){ this.resultValue = resultValue; }    
    public double getResultValue(){ return this.resultValue; }
    
    public CalculateBase(){}
    public CalculateBase(double leftValue, double rightValue){ 
        this.leftValue = leftValue;
        this.rightValue = rightValue; 
    }
    
    public abstract void execute();
    
}
