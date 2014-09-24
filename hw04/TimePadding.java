////////////////////////////////
//Zihao Wang
//9/23/2014
//a program that has the user enter an positive integer giving the number
//of seconds that have passed during the day and then displays the time in conventional
//form.


import java.util.Scanner;

//first compile the program
//javac IncomeTax.java
//run the program
//java IncomeTax
//define a class
public class TimePadding{
    //main method required for every java program
    public static void main(String [] args){
        Scanner my;
        my=new Scanner(System.in);
        System.out.println("Enter the time in seconds: ");
        
        if (my.hasNextInt()) {
            int sec=my.nextInt();
            int h1, h2, sec1, sec2;
            if (sec<=86400&&sec>=0){
            if (sec<3600) {    
                sec1=sec%60;//calculate the seconds
                min=(sec-sec1)/60;
                if(min<10&&sec1>=100 ) {
                    System.out.println("The time is 00:0" +min+":0"+sec1);
                }
                else if(sec1<10&&min>=100 ) {
                    System.out.println("The time is 00:" +min+":"+"0"+sec1);
                }
                else if(sec1<10&&min<100 ) {
                    System.out.println("The time is 00:0" +min+":"+"0"+sec1);
                }
                else  {
                    System.out.println("The time is 00:"+min+":"+sec1);
                }//no 0
            }// the first hour
            else{
                h1=sec%3600;
                h2=h1%60;
                hr=(sec-h1)/3600;// Hours
                min=(h1-h2)/60;//minutes
                sec1=h2;
                if (hr<10&&min>=10&&sec1>=10) {
                    System.out.println("The time is 0"+hr+":"+min+":"+sec1);
                }//hr<10,min and sec >=10
                else if (hr<10&&min<10&&sec1>=10) {
                    System.out.println("The time is 0"+hr+":0"+min+":"+sec1);
                }//all things <10
                else if (hr<10&&min<10&&sec1<10) {
                    System.out.println("The time is 0"+hr+":0"+min+":0"+sec1);
                }// hour<10, MIN>=10, SEC<10
                else if (hr<10&&min>=10&&sec1<10) {
                    System.out.println("The time is 0"+hr+":"+min+":0"+sec1);
                }//hour>=10, MIN<10, SEC>=10
                else if (hr>=10&&min<10&&sec1>=10) {
                    System.out.println("The time is "+hr+":0"+min+":0"+sec1);
                }//hour>=10, MIN>=10, SEC<10
                else if (hr>=10&&sec1<10&&min>=10) {
                    System.out.println("The time is "+hr+":"+min+":0"+sec1);
                }//hour>=10, MIN<10, SEC>=10
                else if (hr>=10&&sec1<10&&min<10) {
                    System.out.println("The time is "+hr+":0"+min+":0"+sec1);
                }//hour>=0, MIN<10, SEC<10
                else {
                    System.out.println("The time is "+hr+":"+min+":"+sec1);
                }//no zero
            }//rest hours
            }//end of range testing
            
            }//ebd of integer test
            
                
                
                
                
            }//end of method
}//end of class
            
       
       
       
       
       
       
       
       
       
       
       
       
       
        
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    











