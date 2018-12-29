/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author 
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         re rex = new re();
        
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        
            while (true) {
                
                System.out.println("Give number between 1-9 for checking");
                
                int x = sc.nextInt();
                switch (x) {
                    case 1:
                        flag = rex.One();
                        break;
                    case 2:
                        flag = rex.Two();
                        break;
                    case 3:
                        flag = rex.Three();
                        break;
                    case 4:
                        flag=rex.Four();
                        break;
                    case 5:
                        flag = rex.Five();
                        break;
                    case 6:
                        flag = rex.Six();
                        break;
                    case 7:
                        flag = rex.Seven();
                        break;
                    case 8:
                        flag = rex.Eight();
                        break;
                    case 9:
                        flag = rex.Nine();
                        break;
                    
                    default:
                        break;
                }
            
            if(flag){
                System.out.println("Valid");
            }
                
            else{
                System.out.println("Invalid");
            }
                
            
            }
        
    }
    
}
