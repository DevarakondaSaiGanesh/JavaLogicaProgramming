import java.util.*;
class ElectricityBill
  {
    public static void main(String[] args)
    { 
        // declare and initialize variable units  
        int units;  
        // variable to calculate electricity bill to pay  
        double billToPay = 0;  
        double surcharge = 0.2;


       Scanner sc = new Scanner(System.in);  
  
        System.out.println("Enter number of units for calculating electricity bill.");  
        units = sc.nextInt();  
        // check whether units are less than 50  
        if(units <=50)  
        {  
            billToPay = units * 0.50;  
        
        }  
        // check whether the units are less than 150 
        else if(units>50&&units<150){  
            billToPay = 50*0.50+(units-50)*0.75;  
          
        }
          //check whether the units are less than 250
        else if(units>150&&units < 250){  
            billToPay = 50 * 0.50 +100 * 0.75+ (units - 150) * 1.20;  
          
        } 
          
        // check whether the units are greater than 250
        else if(units > 250)  
        {  
            billToPay = 50 * 0.50 + 100 * 0.75+ 100 * 1.20 + (units - 250) * 1.50;  
          
        }  
       surcharge=billToPay*(0.2);
      double totalbill=surcharge+billToPay;
        System.out.println("The electricity bill for " +units+ " is : " +totalbill);   
    }   
} 
