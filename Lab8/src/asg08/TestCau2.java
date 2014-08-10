/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg08;

import java.io.IOException;

/**
 *
 * @author GRU-PC
 */
public class TestCau2 {
    public static void main(String[]args){
        try{
            throw new ExceptionA();
        }catch(Exception e){
            System.out.println("Ex ");
        }
        
        try{
            throw new ExceptionA();
        }catch(Exception e){
            System.out.println("Ex ");
        }
        
        try{
            throw new NullPointerException();
        }catch(Exception e){
            System.out.println("Ex ");
        }
        
        try{
            throw new IOException();
        }catch(Exception e){
            System.out.println("Ex ");
        }
    }
}
class ExceptionA extends Exception{
    
}
class ExceptionB extends ExceptionA{
    
}