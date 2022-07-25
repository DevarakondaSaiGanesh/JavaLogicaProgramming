import java.util.*;
public class Armstrong {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        int number = sc.nextInt(); 
         int n, remainder, result = 0;

        n = number;

        while (n != 0)
        {
            remainder = n % 10;
            result += Math.pow(remainder, 3);
            n /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
