import java.util.*;
class StrongNumber  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a NUmber : ");
        int n=sc.nextInt();
        int temp;
        int remainder;
        int fact=0;
        temp=n;
        while(temp>0)
        {
            int sum=1;
            
            remainder=temp%10;
            int i=1;
            while(i<=remainder)
            {
                
                sum=sum*i;
                i=i+1;
            }
            fact=0+sum;
            temp=temp/10;
          
        }
        if(fact==n)
        {
           System.out.println(n+"Yes , it's a strong number");   
        }
       else
        {
         System.out.println("Not a Strong number");
       }
    }
}
