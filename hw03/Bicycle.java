///////////////////////////////
//Zihao Wang
//9/10/2014
//Bicycle 
      import java.util.Scanner;
      
public class Bicycle{
    //main method required for every java program
    public static void main(String [] args){
      Scanner myScanner;
      myScanner=new Scanner( System.in);
      System.out.print(
          "Enter the number of seconds: ");
      int secsTrip=myScanner.nextInt(); //number of seconds
      System.out.print(
          "Enter the number of counts: ");
      int countsTrip=myScanner.nextInt(); //number of counts
      double wheelDiameter=27.0,
      PI=3.14159, //
      feetPerMile=5280, 
      inchesPerFoot=12, 
      secondsPerMinute=60,
      minutesPerHour=60;
      double distanceTrip=countsTrip*wheelDiameter*PI,
// Above gives distance in inches
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI)
      distanceTripMile=distanceTrip/inchesPerFoot/feetPerMile;// Converts to distance in miles
      double avgspd=distanceTripMile/secsTrip*secondsPerMinute*minutesPerHour;//average speed of bicycle in unit of miles per hour
      System.out.printf("The distance was %.2f miles and took %.1f minutes.\n ", distanceTripMile, secsTrip/secondsPerMinute);
      System.out.printf("The average mph was %.2f\n ", avgspd);
      
        
         
    }//end of main method
    
}//end of class