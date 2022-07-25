import java.util.*;
class GrossSalary
  {
    public static void main(String[] args)
    {

      double basic;
      double gross;
      double da;
      double hra;

    /* Input basic salary of employee */
    System.out.println("Enter basic salary of an employee: ");
      Scanner sc=new Scanner(System.in);
       basic=sc.nextDouble();


    /* Calculate D.A and H.R.A according to specified conditions */
    if(basic <= 10000)
    {
        da  = basic * 0.8;
        hra = basic * 0.2;
    }
    else if(basic <= 20000)
    {
        da  = basic * 0.9;
        hra = basic * 0.25;
    }
    else
    {
        da  = basic * 0.95;
        hra = basic * 0.3;
    }

    /* Calculate gross salary */
    gross = basic + hra + da;

    System.out.println("GROSS SALARY OF EMPLOYEE = "+gross);

    }
}
