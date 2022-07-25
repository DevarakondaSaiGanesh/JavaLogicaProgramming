import java.util.*;
class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int i;
        int count;
       int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int end=sc.nextInt();
       for (i = 1; i <= end; i++) 
    {
     count = 0;
       
     for (int j = 2; j <= i / 2; j++) 
     {

 
        if (i % j == 0) 
        {
          count++;
          break;
        }
     }


      
      if (count == 0) 
      {
       temp=temp+i;
        System.out.print("\t"+i);
      }
      

    }
    System.out.println(" = "+temp);
    }
}
