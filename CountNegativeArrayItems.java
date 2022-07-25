import java.util.Scanner;

public class CountNegativeArrayItems {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Size, i, count = 0;
		int[] count_NegArr = new int[10];
		
		sc = new Scanner(System.in);
		
		System.out.print("\nPlease Enter the CNT NEG Array size  : ");
		Size = sc.nextInt();
		
		System.out.format("\nEnter CNT NEG Array %d elements : ", Size);
		for(i = 0; i < Size; i++) 
		{
			count_NegArr[i] = sc.nextInt();
		}
	
		for(i = 0; i < Size; i++) 
		{
			if(count_NegArr[i] < 0) {
				count++;
			}
		}
		System.out.println("\nThe Total Number of Negative Array Items = " + count);
	}
}
