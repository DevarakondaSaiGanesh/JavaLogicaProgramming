import java.util.Scanner;


public class MobileNumber 
{

//Define the main method
public static void main(String[] args)
  {
//Declare the variable
String mobileNum=" ";
    String k="";
    long temp1,temp2;
    int i,j;
    long sum=0;
//Use the scanner class to provide mobileNum at execution time


Scanner scanner = new Scanner(System.in);
System.out.println("Enter Your phone number (10 digits)");
mobileNum = scanner.nextLine();


//Verify if the mobile number is equal to 10 digits or not
//If the mobile number is equal to 10 digits then extract the last 4 digits else print error message
    
    if(mobileNum.length()==10)
    {
      
      long num=Long.parseLong(mobileNum);
      temp1=num;
      for(i=1;i<=4;i++)
        {
          temp1=num%10;
          sum=sum*10+temp1;
          num=num/10;
        }
      temp2=sum;
      for(j=1;j<=4;j++)
        {
          temp2=sum%10;
          k=k+temp2;
          sum=sum/10;
        }
      //Print the result
//System.out.println("Mobile number ends with ******"+variablename);
      System.out.println("Mobile number ends with ******"+k);
    
      }
    else
    {
      System.out.println("Enter 10 digit vaild Mobile number");
      
    
    }
  
  }
    
}
