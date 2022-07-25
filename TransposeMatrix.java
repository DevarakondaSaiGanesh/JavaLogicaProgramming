import java.util.*;

public class TransposeMatrix {

//Define the main method
public static void main(String args[])
  {
//Declare the variables
    int len;
    int len2;
Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of rows : ");
   len=sc.nextInt();
    System.out.print("Enter number of columns : ");
    len2=sc.nextInt();
//creating a matrix  
  int original[][]={{2,3,4},{1,2,3},{4,5,6}};    
    
//creating another matrix to store transpose of a matrix  
   int  transpose[][]=new int[len][len2];  
  //Take input from user to enter rows and column values     
//Convert the square matrix into transpose
for(int i=0;i<len;i++){    
for(int j=0;j<len2;j++){    
transpose[i][j]=original[j][i];  
}    
}    
  
 
 //printing j and i instead of i and j  
for(int i=0;i<len;i++){    
for(int j=0;j<len2;j++){    
         System.out.println("Elements ["+(i+1)+","+(j+1)+"] : "+original[i][j]+" ");    
}    
   
}   
System.out.println();
System.out.println("After Transpose Matrix:");  
for(int i=0;i<len;i++){    
for(int j=0;j<len2;j++){   
  //Print the transpose matrix
System.out.print(transpose[i][j]+"       ");    
}    
System.out.println();//new line    
}    
}}  
