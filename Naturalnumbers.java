import java.util.*;
class Naturalnumbers
  {
    public static void main(String[] args)
    {
      int i=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=sc.nextInt();
      while(i<=n)
        {
          System.out.println(i);
          i=i+1;
        }
    }
  }
