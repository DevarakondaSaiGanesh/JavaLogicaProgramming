import java.util.*;
class Palindrome
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
          sum=sum*10+temp;
          n=n/10;
        }
      if(sum==temp)
      {
        System.out.println("Palindrome number is  : "+sum);
      }
      else{
        System.out.println("This number is not a Palindrome number : "+sum);
      }
    }
  }
