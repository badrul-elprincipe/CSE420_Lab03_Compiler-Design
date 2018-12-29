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
public class re {
    
    boolean flaga = false;
    boolean flagb = false;
    boolean flagc = false;
    boolean flagd = false;
    
    public boolean One() {
       
        System.out.println("checking a(bc)*d");
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //checking for a at the beginning
        char[] charArray = str.toCharArray();
        if(charArray[0] == 'a'){
            flaga = true; 
        }
        
        
        //checking for d at the end
        int length = (charArray.length) - 1;
        if (charArray[length] == 'd') {
            flagd = true;
        }

        //checking for (bc)*
        int b=0; int c=0;
        for (int i = 1; i < str.length() - 1;) {
            if (charArray[i] == 'b') {
                flagb = true;
                b++;
            } 
            else {
                flagb = false;
                break;
            }
            i = i + 2;
        }
        for (int i = 2; i < str.length() - 1;) {
            if (charArray[i] == 'c') {
                flagc = true;
                c++;
            } 
            else {
                flagc = false;
                break;
            }
            i = i + 2;
        }
        return ((flagb && flagc && flaga && flagd && b==c) == true) || ((str.length() == 2) && flaga == true && flagd == true);
    }
    public boolean Two() {
       
        System.out.println("checking ab*c");
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //checking for a at the beginning
        char[] charArray = str.toCharArray();
        if(charArray[0] == 'a'){
            flaga = true; 
        }
        
        
        //checking for c at the end
        int length = (charArray.length) - 1;
        if (charArray[length] == 'c') {
            flagc = true;
        }

        //checking for b*
         
        for (int i = 1; i < str.length() - 1;) {
            if (charArray[i] == 'b') {
                flagb = true;
                
            } 
            else {
                flagb = false;
                break;
            }
            i = i+1;
        }
        
        return ((flagb && flagc && flaga ) == true) || ((str.length() == 2) && flaga == true && flagc == true);
    }
    
    public boolean Three() {
        
        System.out.println("checking a(bc)+d");
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //checking for a at the beginning
        char[] charArray = str.toCharArray();
        if(charArray[0] == 'a'){
            flaga = true;    
        }
        
        //checking for d at the end
        int length = (charArray.length) - 1;
        if (charArray[length] == 'd') {
            flagd = true;
        }

        //checking for (bc)+
        int b=0; int c=0;
        for (int i = 1; i < str.length() - 1;) {
            if (charArray[i] == 'b') {
                flagb = true;
                b++;
            } 
            else {
                flagb = false;
                break;
            }
            i = i + 2;
        }
        for (int i = 2; i < str.length() - 1;) {
            if (charArray[i] == 'c') {
                flagc = true;
                c++;
            } 
            else {
                flagb = false;
                break;
            }
            i = i + 2;
        }
        System.out.println(str.length());
        return (flagb && flagc && flaga && flagd && b==c && (str.length() > 2)) == true;
    }
    public boolean Four() {
       
        System.out.println("checking ab+c");
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //checking for a at the beginning
        char[] charArray = str.toCharArray();
        if(charArray[0] == 'a'){
            flaga = true; 
        }
        
        
        //checking for c at the end
        int length = (charArray.length) - 1;
        if (charArray[length] == 'c') {
            flagc = true;
        }

        //checking for b+
         
        for (int i = 1; i < str.length() - 1;) {
            if (charArray[i] == 'b') {
                flagb = true;
                
            } 
            else {
                flagb = false;
                break;
            }
            i = i+1;
        }
        
        return (flagb && flagc && flaga && str.length() > 2 ) == true;
    }
    
    public boolean Five() {
        System.out.println("checking a(bc)?d");
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //checking for a at the beginning
        try {
            char[] charArray = str.toCharArray();
            if(charArray[0] == 'a'){
                flaga = true;         
            }
            
            
            //checking for d at the end
            int length = (charArray.length) - 1;
            if (charArray[length] == 'd') {
                flagd = true;
            }

            //checking for (bc)?
            if (charArray[1] == 'b') {
                flagb = true;
            }
            if (charArray[2] == 'c') {
                flagc = true;
            }

            return ((flagb && flagc && flaga && flagd && (str.length() <= 4)) == true) || ((flaga && flagd && (str.length() <= 2)) == true);
        } catch (Exception e) {
            return false;
        }
    }
     public boolean Six() {
       
        System.out.println("checking ab?c");
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        try {
            //checking for a at the beginning
        char[] charArray = str.toCharArray();
        if(charArray[0] == 'a'){
            flaga = true; 
        }
        
        
        //checking for c at the end
        int length = (charArray.length) - 1;
        if (charArray[length] == 'c') {
            flagc = true;
        }

        //checking for b?
        int b=0; 
        for (int i = 1; i < str.length() - 1;) {
            if (charArray[i] == 'b') {
                flagb = true;
                
            } 
            else {
                flagb = false;
                break;
            }
            i = i+1;
        }
        
        return ((flagb && flagc && flaga && (str.length() <= 3)) == true || ((flagc && flaga && (str.length() <=2))) ==true );
        }
        catch(Exception e) {
            return false;
        }
    }
    
    
    public boolean Seven() {
        
        System.out.println("checking [a-m]*");
        boolean s = false;

        int ascii;
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        
        char[] charArray = str.toCharArray();
        int[] temp = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            ascii = (int) charArray[i];
            temp[i] = ascii;
        }
        for (int i = 0; i < temp.length; i++) {
            if ((temp[i] >= 97) && (temp[i] <= 109)) {
                s = true;

            } 
            else {
                s = false;
                break;
            }
        }

        return s == true;

    }
    
    public boolean Eight() {
        
        System.out.println("checking [^aeiou]");
        boolean flag = false;
        int ascii;
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char[] charArray = str.toCharArray();
        int[] temp = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            ascii = (int) charArray[i];
            temp[i] = ascii;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 97 && temp[i] != 101 && temp[i] != 105 && temp[i] != 111 && temp[i] != 117) {
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag == true;
    }
    
    public boolean Nine() {
        
        System.out.println("checking [^aeiou]{6}");
        boolean flag = false;
        int ascii;
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char[] charArray = str.toCharArray();
        int[] temp = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            ascii = (int) charArray[i];
            temp[i] = ascii;
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]!=97 && temp[i]!=101 && temp[i]!=105 && temp[i]!=111 && temp[i]!=117 && str.length()==6){
               flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        return flag==true; 
            
    }
}
