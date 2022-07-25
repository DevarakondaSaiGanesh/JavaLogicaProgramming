class N_EvenNumbers
{
public static void main(String[] args)
{
   int i=1;
   int n=100;
   int sum=0;
   while(i<=n)
   {
     if(i%2==0)
     {
      sum=sum+i;  
     }
     i++;
   }
  System.out.println("Sum of all even numbers : "+sum);

}
}
