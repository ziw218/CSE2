////////////////////////////
//Zihao Wang
//9/15/2014
//print out the first four digits to the right of the decimal point

      import java.util.Scanner;
      
public class FourDigits{
    //main method required for every java program
    public static void main(String [] args){
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double x1=myScanner.nextDouble();//the place to enter a double
        int x2=(int) x1;//the whole number part of the number entered
        double x3=x1-x2;//the digit part of the number entered
        int x4=(int)(x3*10000);//multiplied by 10000
        System.out.println("The four digits are " +x4);
        
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double x5=myScanner.nextDouble();//the place to enter a double
        int x6=(int) x5;//the whole number part of the number entered
        double x7=x5-x6;//the digit part of the number entered
        int x8=(int)(x7*10000);//multiplied by 10000
        System.out.println("The four digits are " +x8);
        

        
    }//end of main method
}//end of class