import java.util.*;
class MultiplicationTable
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter What table do you want in digits(1to1000)");
      int table=sc.nextInt();
      System.out.println("Enter how many numbers of the table do you have(1to1000)");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          System.out.println(table+"  x  "+i+"   =  "+table*i);

        }
    }
  }
