////////////////////////////////
//Zihao Wang
//10/1
//Write a program that has three boolean variables to each of which the value
//of true or false is randomly assigned. Then, at random, combine the three variables with
//random choices of && and || and stores the result.

import java.util.Scanner;

//first compile 
//java BoolaBoola.java
//run the program
//define a class

public class BoolaBoola{
    public static void main (String [] args){
        Scanner my;
        my=new Scanner(System.in);
        boolean A,B,C,result;
        int Ran1,Ran2;
        String D,E;
        Ran1=(int)(Math.random()*2); 
        A=
        (Ran1==0)?true:false;
        
        B=
        (Ran1==0)?true:false;
        
        C=
        (Ran1==0)?true:false;
        
        Ran2=(int)(Math.random()*4);
        switch(Ran2){
            case 0:
                result=A||B||C;
                D="||";
                E="||";
            break;
            case 1:
                result=A||B&&C;
                D="||";
                E="&&";
            break;
            case 2:
                result=A&&B&&C;
                D="&&";
                E="&&";
            break;
            default:
                result=A&&B||C;
                D="&&";
                E="||";
            break;
           
        }
     
        System.out.print("Does "+A+" "+D+" "+B+" "+E+" "+C+" have the value true(t/T) or false(f/F)? -");
    
        String ans=my.next();//store variable
        
        int length=ans.length();
        switch(length){
            case 1: 
                char Zihao=ans.charAt(0);
                switch(Zihao){
                    case 'f':
                       if  (result==false){
                           System.out.println("correct");
                        
                       }
                       else {
                           System.out.println("wrong!");
                       }
                    break;
                    case 'F'  :
                        if  (result==false){
                           System.out.println("correct");
                        
                       }
                       else {
                           System.out.println("wrong!");
                       }
                    break;
                    case 'T':
                        if  (result==true){
                           System.out.println("correct");
                        
                       }
                       else {
                           System.out.println("wrong!");
                       }
                    break;
                    case 't':
                        if  (result==true){
                           System.out.println("correct");
                        
                       }
                       else {
                           System.out.println("wrong!");
                       }
                    break;
                    default:
                           System.out.println("Wrong! Try again.");
                    break;
                }
            break;
                
            
            default:
            System.out.println("You do not enter a single letter.");
            break;
        }
              
         
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}