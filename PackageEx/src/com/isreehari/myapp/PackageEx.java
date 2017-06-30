/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.myapp;

import com.isreehari.tuto.Addition;
import com.isreehari.tuto.CalculateBase;
import com.isreehari.tuto.Devision;
import com.isreehari.tuto.MathEquation;
import com.isreehari.tuto.Multiple;
import com.isreehari.tuto.Subtract;

/**
 *
 * @author sinukoll
 */
public class PackageEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MathEquation[] equations = new MathEquation[4];
        
        equations[0] = new MathEquation('a', 10.0d, 11.0d);
        equations[1] = new MathEquation('s', 10.0d, 11.0d);
        equations[2] = new MathEquation('m', 10.0d, 11.0d);
        equations[3] = new MathEquation('d', 10.0d, 11.0d);
        
        for(MathEquation equation: equations){
            equation.execute();            
            System.out.println("Reult: ");
            System.out.println(equation.getResultValue());
            
        }
        
        
        System.out.println("***************************************");
        System.out.println("Using Inheritance");
        System.out.println("***************************************");
        
        CalculateBase[] calculators = new CalculateBase[4];
        
        calculators[0] = new Addition(10.0d, 11.0d);
        calculators[1] = new Subtract(10.0d, 11.0d);
        calculators[2] = new Multiple(10.0d, 11.0d);
        calculators[3] = new Devision(10.0d, 11.0d);
        
        for(CalculateBase calculator: calculators){
            calculator.execute();
            System.out.println("Resut: " + calculator.getClass());
            System.out.println(calculator.getResultValue());
        }
    }
    
}
