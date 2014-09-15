////////////////////////////////
//Zihao Wang
//9/15/2014
//A crude estimate of the cube root of the number 
     import java.util.Scanner;
     
public class Root{
    //main method required for every java program
    public static void main(String [] args){
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        System.out.print("Enter a double, and I print its cube root- ");
        double x=myScanner.nextDouble();//the place to enter a double
        double guess1=x/3,
        guess2=(guess1*guess1*guess1+x)/(3*guess1*guess1),
        guess3=(guess2*guess2*guess2+x)/(3*guess2*guess2),
        guess4=(guess3*guess3*guess3+x)/(3*guess3*guess3),
        guess5=(guess4*guess4*guess4+x)/(3*guess4*guess4),
        guess6=(guess5*guess5*guess5+x)/(3*guess5*guess5);
//after 4 more times repeating guesses, I print it out
        System.out.println("The cube root is"+guess6+":");
        System.out.println(guess6+"*"+guess6+"*"+guess6+"="+guess6*guess6*guess6);
        
        
        
    }//end of main method
}//end of class