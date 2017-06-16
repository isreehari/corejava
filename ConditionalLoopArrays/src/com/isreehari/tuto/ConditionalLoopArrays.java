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
public class ConditionalLoopArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float students = 0.0f;
        float rooms = 4.0f;
        
        if(students > 0.0f){
            if( rooms > 0.0f)
            System.out.println(students/rooms);
        }            
        else
            System.out.println("No Students");
        
        
        
        
        // logical operators
        boolean valA = false;
        boolean valB = true;
        
        if( valA ^ valB )
        {
            System.out.println(" True Condtion ");
        }
        else{
            System.out.println(" False Condtion ");
        }
        
        
        int numberStudents = 150 ;
        int numberRooms = 0;
        
//        if(numberRooms > 0 & numberStudents / numberRooms > 30){
//            System.out.println("Crowded");
//        }

        if(numberRooms > 0 && numberStudents / numberRooms > 30){
            System.out.println("Crowded");
        }
        
        //loops 
        // 1) while 
        
        int kValue = 5; 
        int factorial = 1;
        
        while( kValue > 1){
            factorial *= kValue;
            kValue -= 1;
        }
        
        System.out.println(factorial);
        
        kValue = 5;
        factorial = 1;
        while( kValue > 1)
        factorial *= kValue--;        
        System.out.println(factorial);
        
        //2) do while
        int iVal = 5;
        do{
            System.out.println(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
            
        } while( iVal < 100);
        
        
       
        
        for(int jVal =1; jVal < 100; jVal *=2){
            System.out.println(jVal);            
        }
        
        // Arrays
        
        float[] theFloatVal = new float[3];
        
        theFloatVal[0] = 10.0f;
        theFloatVal[1] = 20.0f;
        theFloatVal[2] = 1.0f;
        
        float sum = 0.0f;
        
        for( int i = 0 ; i < theFloatVal.length; i++){
            sum += theFloatVal[i];
        }
        
        System.out.println("Sum: " + sum);
        
        
        float[] theFloatVal2 = {10.0f, 11.0f, 23.0f};
        
        float sum2 = 0.0f;
        
        for( int i = 0 ; i < theFloatVal2.length; i++){
            sum2 += theFloatVal2[i];
        }
        
        System.out.println("Sum: " + sum2);
        
        
        //for each loop
        
        float[] theFloatVal3 = {10.0f, 11.0f, 23.0f};
        
        float sum3 = 0.0f;
        
        for(float theVal:theFloatVal3){
            sum3 += theVal;
        }
        
        System.out.println("Sum: " + sum3);

        
        System.out.println();
        System.out.println("** end programm **");        
        
                    
        
    }
    
}
