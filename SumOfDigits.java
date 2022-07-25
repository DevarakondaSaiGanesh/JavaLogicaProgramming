import java.util.*;
class SumOfDigits
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number");
      int n=sc.nextInt();
      int sum=0;
      int temp=n;
      while(n>0)
        {
          temp=n%10;
          sum=sum+temp;
          n=n/10;
        }
      System.out.println("Sum of the digits of a Number : "+sum);    }
  }
