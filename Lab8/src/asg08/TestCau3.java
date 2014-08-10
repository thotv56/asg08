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
public class TestCau3 {
    public static void main(String[] args) {
        try{
            throw new ExCeptionC2();
        } catch (ExCeptionB2 ex)
        {                           //Neu doi cho B2 cho A2 thi trinh
                                    //bien dich se bao loi
            
        }catch (ExCeptionA2 ex){      
        }
    }
}
class ExCeptionA2 extends Exception{
  
}
class ExCeptionB2 extends ExCeptionA2{

}
class ExCeptionC2 extends ExCeptionB2{
 
}