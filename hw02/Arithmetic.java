////////////////////////////////////////
//  Zihao Wang
//  9/7/2014
//  Doing arithmetic about shopping at Walmart

//  first compile a the program
//     javac Arithmetic.java
//  run the program
//     java Arithmetic

//  define a class
public class Arithmetic{
    
//  add main method
  public static void main(String[] args){
    
//  our input data

      int nSocks=3;//  Number of pairs of socks
      double sockCost$=2.58;//  Cost per pair of socks
//  ('$' is part of the variable name)
      int nGlasses=6;//  Number of drinking glasses
      double glassCost$=2.29;//  Cost per glass
      int nEnvelopes=1;//  Number of boxes envelopes
      double envelopeCost$=3.25;//cost per box of envelopes
      double taxPercent=0.06;//taxes rate

//  Expected output
      double totalsockcost, totalglasscost, totalenvelopecost, totaltaxes, totalcostbeforetax, totalactuallypaid;
//  print out the output data.
    totalsockcost=nSocks*sockCost$;//the total cost of socks
    System.out.println("Total cost of socks is " +totalsockcost+" dollars");
    totalglasscost=nGlasses*glassCost$;// the total cost of glasses
    System.out.println("Total cost of glasses is "+totalglasscost+" dollars");
    totalenvelopecost=nEnvelopes*envelopeCost$;//the total cost of envelopes
    System.out.println("Total cost of envelopes is "+totalenvelopecost+" dollars");
    totaltaxes=(totalsockcost+totalglasscost+totalenvelopecost)*taxPercent;//the cost of total taxes
    System.out.println("Total cost of taxes is "+totaltaxes+" dollars");
    totalcostbeforetax=totalsockcost+totalglasscost+totalenvelopecost;// the total cost of three things
    System.out.println("Total cost before taxing is "+totalcostbeforetax+ "dollars");
    totalactuallypaid=totalcostbeforetax+totaltaxes;//total cost
    System.out.println("Total cost is "+totalactuallypaid+ "dollars");
 
  }
}