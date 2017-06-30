/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.tuto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author sinukoll
 */
public class ErrorHandlingEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader reader = null; 
        int total = 0;
        
        try{
            System.out.println(ErrorHandlingEx.class.getResource("Numbers.txt"));
            URL path = ErrorHandlingEx.class.getResource("Numbers.txt");
            File f = new File(path.getFile());
            
            reader = new BufferedReader(new FileReader(f));
            
            String line = null; 
            
            while((line = reader.readLine()) != null){
              total += Integer.valueOf(line);
        }
            System.out.println("Total: " + total);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            if(reader != null)
                reader.close();
        }
        
        
    }
    
}
