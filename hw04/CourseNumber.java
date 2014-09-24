////////////////////////////////////
//Zihao Wang
//9/23/2014
//The semester during which a course is offered at Lehigh is given by a 6 digit
//number. The first four digits give the year, and the last two digits give the semester: 10
//spring, 20 summer 1, 30 summer 2, and 40 fall. Write a program that reads in a 6 digit
//number, makes sure that it adheres to the above description, and then prints out the
//semester and year.


import java.util.Scanner;

//first compile the program
//javac Month.java
//run the program
//java Month
//define a class
public class CourseNumber{
    //main method required for every java program
    public static void main(String [] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter a six digit number giving the course semester- ");
        
        if (myScanner.hasNextInt()){
            int NO= myScanner.nextInt();//INSERT NUMBER
            if (NO<=201440 && NO>=186510){
                int NY, NS;
                NY=(int)NO/100;//NUMBER OF YEARS
                NS=(int)(NO-NY*100);//NUMBER OF SEMESTERS
                if (NS==10){
                     System.out.println("The course was offered in the Spring semester of" +NY);
                }
                else if (NS==20){
                     System.out.println("The course was offered in the Summer 1 semester of" +NY);
                }
                else if (NS==30){
                     System.out.println("The course was offered in the Summer 2 semester of" +NY);
                }
                else if (NS==40){
                     System.out.println("The course was offered in the Fall semester of" +NY);
                }
                else if (NS!=10&&NS!=20&&NS!=30&&NS!=40){
                     System.out.println(+NS+ " is not a legitimate semester");
                }
            }
                
                
                
            
            else {
                System.out.println("The number was outside the range [186510,201440]");
                return;
                
            }
        }
            
        else {
            System.out.println("Error");
            return;
        }
        }//end of main method
}//end of class