import java.util.*;
class SumFirstLastDigit
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number");
      int number=sc.nextInt();
      //First Digit
      int temp=number;
      while(number>10)
        {
          number=number/10;
        }
      System.out.println("First Digit : "+number);
      //Last Digit
      while(temp>=10)
        {
          temp=temp%10;
          System.out.println("Last Digit  : "+temp);
        }
      int total=number+temp;
      System.out.println("Sum of First and Last Digit number is : "+total);
    }
  }
