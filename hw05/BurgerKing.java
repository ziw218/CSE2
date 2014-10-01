//////////////////////
//Zihao Wang
//9/30
//Write a program that prompts the user
//to enter a choice of a burger, a soda, or fries. Then the program prompts the users for
//details of their choices.


import java.util.Scanner;

//first compile
//java BurgerKing.java
//run the program
//define a class

public class BurgerKing{
    //main method
    public static void main (String [] args){
        Scanner my;
        my=new Scanner(System.in);
        System.out.println("Enter a letter to indicate a choice of- ");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.println("Fries (F or f)");
            String L=my.next();//store variable
            if (L.equals ("B")||L.equals ("b")){
            
                    System.out.println("Enter A or a for 'all the fixins'");
                    System.out.println("C or c for cheese");
                    System.out.println("N or n for none of the above");
                    String B=my.next();
                    if (B.equals ("A")||B.equals ("a")){
                        
                            System.out.println("You ordered the burger with all the fixins");
                    }
                   else if (B.equals ("c")||B.equals ("C")){
                            
                            System.out.println("You ordered the burger with cheese.");
                   }
                   else if (B.equals ("N")||B.equals ("n")){
                            System.out.println("You ordered the burger with none.");
                   }
                   else {
                       System.out.println("you didn't enter A/a/C/c/N/n");
                   }
               
                    
                    }
            
            else if (L.equals ("S")||L.equals ("s")){
            
                    System.out.println("Do you want Pepsi (p or P)");
                    System.out.println("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");
                    
                    String S=my.next();
                    if (S.equals ("P")||S.equals ("p")){
                        
                            System.out.println("You ordered a Pepsi");
                    }
                   else if (S.equals ("c")||S.equals ("C")){
                            
                            System.out.println("You ordered a coke.");
                   }
                   else if (S.equals ("s")||S.equals ("S")){
                            System.out.println("You ordered a Sprite.");
                   }
                   else if (S.equals ("M")||S.equals ("m")){
                            System.out.println("You ordered a Mountain Dew.");
                   }
                   else {
                       System.out.println("you didn't enter p/c/s/m/P/C/S/M");
                   }
               
                    
                    }
                    
            else if (L.equals ("F")||L.equals ("f")){
            
                    System.out.println("Do you want a large or small order of fries (l,L,s, or S- ");
                    
                    String F=my.next();
                    if (F.equals ("L")||F.equals ("l")){
                        
                            System.out.println("You ordered large fries");
                    }
                   else if (F.equals ("s")||F.equals ("S")){
                            
                            System.out.println("You ordered small fries");
                   }
                   else {
                       System.out.println("you didn't enter L/l/S/s");
                   }
                   
            
              
                    }
                    
            else {
                System.out.println("you did not enter any of B,b,S,s,F,f");
            }
                    
            
                    
                    
                    
                    
                
               
    }
    
    
    
    
    
    
    
}