///////////////////////////////
//Zihao Wang
//9/10/2014
//Bicycle 

public class Bicycle{
public static void main(String [] args){
int secsTrip=480; //
int countsTrip=1561; //
double wheelDiameter=27.0,
PI=3.14159, //
feetPerMile=5280, //
inchesPerFoot=12, //
secondsPerMinute=60; //
double distanceTrip1, totalDistance;
distanceTrip=countsTrip*wheelDiameter*PI;
// Above gives distance in inches
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");
}
}