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
public class MathEquation {
    private double leftValue;
    private double rightValue;
    private char opCode;
    private double resultValue;
    
    public void setLeftValue(double leftValue){ this.leftValue = leftValue; }    
    public double getLeftValue(){ return this.leftValue; }
    public void setRightValue(double rightValue){ this.rightValue = rightValue; }    
    public double getRightValue(){ return this.rightValue; }
    public void setOpCodeValue(char opCode){ this.opCode = opCode; }    
    public char getOpCodeValue(){ return this.opCode; }
    public void setResultValue(double resultValue){ this.resultValue = resultValue; }    
    public double getResultValue(){ return this.resultValue; }
    
    public MathEquation(){}
    public MathEquation(char opCode){ this.opCode = opCode;  }
    public MathEquation(char opCode, double leftValue, double rightValue){ 
        this(opCode);
        this.leftValue = leftValue;
        this.rightValue = rightValue; 
    }
    
    public void execute(){
        switch(this.opCode){
            case 'a': this.resultValue  = this.leftValue + this.rightValue; break;
            case 's': this.resultValue = this.leftValue - this.rightValue; break;
            case 'm': this.resultValue = this.leftValue * this.rightValue; break; 
            case 'd':  if(this.rightValue > 0 )
                                this.resultValue = this.leftValue / this.rightValue; break;
            default: System.out.println("!Something went wrong"); break;
        }
    }
}
