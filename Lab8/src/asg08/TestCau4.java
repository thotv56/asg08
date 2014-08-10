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
public class TestCau4 {
    public static void main(String[]args){
        try{
            SomeException se = new SomeException(3, 0);
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
    }
}
class SomeException{
	public SomeException(int a, int b) throws Exception {
		if (b==0)
			throw new Exception("Error");
        }		
}