////////////////////////////////
//Zihao Wang
//9/23/2014
//prompts the user to enter an integer for the month (1 for
//January, 2 for February, etc.) and then displays the number of days in the month).


import java.util.Scanner;

//first compile the program
//javac Month.java
//run the program
//java Month
//define a class
public class Month{
    //main method required for every java program
    public static void main(String [] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter an int giving the number of the month (1-12)- ");

        if(myScanner.hasNextInt()){
          int Month=myScanner.nextInt();
          if (Month>0 && Month<13){ 
            if(Month==1){
                System.out.println("The month has 31 days");
                }
            else if (Month==2){
                System.out.print("Enter an int giving the year- ");
                
                  int Year=myScanner.nextInt();
                    
                   if (Year%4!=0 || Year%400!=0 ){
                    System.out.println("The month has 28 days");
                }
                   else {
                    System.out.println("The month has 29 days");
                }
            }
            else if (Month==3){
                    System.out.println("The month has 31 days");
                }
            else if (Month==4){
                    System.out.println("The month has 30 days");
                }
            else if (Month==5){
                    System.out.println("The month has 31 days");
                }
            else if (Month==6){
                    System.out.println("The month has 30 days");
                }
            else if (Month==7){
                    System.out.println("The month has 31 days");
                }  
            else if (Month==8){
                    System.out.println("The month has 31 days");
                }
            else if (Month==9){
                    System.out.println("The month has 30 days");
                }
            else if (Month==10){
                    System.out.println("The month has 31 days");
                }
            else if (Month==11){
                    System.out.println("The month has 30 days");
                }    
            else if (Month==12){
                    System.out.println("The month has 31 days");
                }    
          }
          else{
              System.out.println("You did not enter an int between 1 and 12");
          }
        }
        
}
}









