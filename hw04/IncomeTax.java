////////////////////////////////
//Zihao Wang
//9/23/2014
//prompts the user to enter an int that gives the thousands of dollars of income and then writes out the amount of tax on the income


import java.util.Scanner;

//first compile the program
//javac IncomeTax.java
//run the program
//java IncomeTax
//define a class
public class IncomeTax{
    //main method required for every java program
    public static void main(String [] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter an int giving the number of thousands- ");
        
        if(myScanner.hasNextInt()){
            int Income=myScanner.nextInt();
            if(Income>0){
                if(Income<20){
                    System.out.println("The tax rate on $" +Income+"000 is 5.0%, and the tax is $" +Income*10*5.0);
                }
                else if (Income>=20 && Income<40){
                    System.out.println("The tax rate on $" +Income+"000 is 7.0%, and the tax is $" +Income*10*7.0);
                }
                else if (Income>=40 && Income<78){
                    System.out.println("The tax rate on $" +Income+"000 is 12.0%, and the tax is $" +Income*10*12.0);
                }
                else if (Income>=78){
                    System.out.println("The tax rate on $" +Income+"000 is 14.0%, and the tax is $" +Income*10*14.0);
                }
            }
            else{
                System.out.println("You did not enter a positive int");
            }
        }
        
        
}
}