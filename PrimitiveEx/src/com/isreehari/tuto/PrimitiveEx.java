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
public class PrimitiveEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer a = 2; 
        int b = a;
        Integer c = a; 
        
        // Primitive wrapper classes        
        Integer d = Integer.valueOf(100);
        int e = d.intValue();
        Integer f = Integer.valueOf(e);
        
        Float g = Float.valueOf(10.125f);
        float h = g.floatValue();
        
        Float i = Float.valueOf(f);
        
        
        String s = "87.44";
        
        double s1 = Double.parseDouble(s);
        Double s2 = Double.parseDouble(s);
        
        System.out.println(Integer.toBinaryString(a));
        
        if(s1 == s2)
            System.out.println("Two values are equal");
        else
            System.out.println("Two values are not equal");
        
        
        // Equality
        
        Integer i1000A = 10 * 10 * 10;
        Integer i1000B = 10 * 10 * 10;
        
        if(i1000A == i1000B)
            System.out.println("Two integers are equal");
            else
            System.out.println("Two integers are not equal");
        
        if( i1000A.equals(i1000B))
            System.out.println("Two integers are equal");
            else
            System.out.println("Two integers are not equal");
        
    }
    
}
