import java.util.*;
class MoneyCount
  {
    public static void main(String[] args)
    {
       int Rs[]={2000,500,100,50,20,10,5,2,1}; 
 
     Scanner sc=new Scanner(System.in);
         System.out.println("Enter amount");
      int amount=sc.nextInt();
        int copy=amount; 
        int count=0;
 
        System.out.println("Notes      count  =   amount");
    

    System.out.println(" ");
        for(int i=0;i<9;i++) 
        {
            // counting number of notes.
            count=amount/Rs[i]; 
            if(count!=0) 
            {
                System.out.println(Rs[i] +"    "+"   :  "+count+"  =   "+Rs[i]*count);
            }
           
            amount=amount%Rs[i]; 
        
          
        }
    }
  }
