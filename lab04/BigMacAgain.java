////////////////////////////
//Zihao Wang
//9/17/2014
//let users choose Big Macs they want and whether they want fries

import java.util.Scanner;

//first compile the program
//javac BigMacAgain.java
//run the program
//java BigMacAgain
//define a class
public class BigMacAgain{
    //main method required for every java program
    public static void main(String [] args){
       Scanner myScanner;
       myScanner=new Scanner(System.in);
       System.out.print("Enter the number of Big Macs: ");
      
       if(myScanner.hasNextInt()){
           int nBigMacs=myScanner.nextInt();
           if(nBigMacs>0){
             System.out.println("You ordered" +nBigMacs+"Big Macs for a cost of" +nBigMacs+"x2.22=$"+nBigMacs*2.22);
             System.out.println("Do you want an order of fries ( Y/y/N/n)? ");
             String answer=myScanner.next();
             if (answer.equals("Y")||answer.equals("y")){
                System.out.println("You ordered fries at a cost of $2.15");
                System.out.println("Your total cost of the meal is $"+ (2.22*nBigMacs+2.15));
             }
             else if (answer.equals("N")||answer.equals("n")){
                System.out.println("Your total cost of the meal is $"+ 2.22*nBigMacs);
       }
             else{
                System.out.println("You did not enter one of 'y', 'Y', 'n', 'N'");
             }
           }
           else{
               System.out.println("You did not enter an int>0");
       }
       }
     
       else{
           System.out.println("You did not enter an int");
           return; //leaves the program 
                   //the program terminates
       }
       
} // end of main method
} // end of class