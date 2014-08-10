/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg08;

/**
 *
 * @author GRU-PC
 */
class ExCeptionA extends Exception{
  
}
class ExCeptionB extends ExCeptionA{

}
class ExCeptionC extends ExCeptionB{
 
}
public class TestCau1{
    public static void main(String[] args) {
        try{
            System.out.println("");
        throw new ExCeptionB();
        }catch(ExCeptionA e){
            
        }
        try{
            System.out.println("");
        throw new ExCeptionC();
        }catch(ExCeptionA e){
            
        }
    }
}