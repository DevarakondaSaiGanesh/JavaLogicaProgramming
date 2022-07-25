
import java.util.*;
class n_PrimeNumbers {
    public static void main(String[] args) {
        int i;
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
       for (i = 1; i <= num; i++) 
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
      System.out.println("\t"+i);
      }

    }
    
    }
}
