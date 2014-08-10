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
public class TestCau5 {
    public String someMethod2(String chuoi) throws Exception{
        if(chuoi==null){
            throw new NullPointerException();
        }
        return chuoi;
    }
    public String someMethod() throws Exception{
        String chuoi = this.someMethod2("Tran Tho");
        return chuoi;
    }
    public static void main(String[] args){
        try{
            TestCau5 tc = new TestCau5();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
