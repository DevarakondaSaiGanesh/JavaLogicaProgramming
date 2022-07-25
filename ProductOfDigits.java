import java.util.*;
class ProductOfDigits
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number");
      int n=sc.nextInt();
      int product=1;
      int temp=n;
      while(n>0)
        {
          temp=n%10;
          product=product*temp; 
          n=n/10;
        }
      System.out.println("Product of the digits of a Number : "+product);    
    }
  }
