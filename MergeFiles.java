import java.io.*;
public class MergeFiles {
   public static void main(String[] args) throws IOException {
      PrintWriter my_pw = new PrintWriter("path to third .txt file");

      BufferedReader my_br = new BufferedReader(new FileReader("path to first .txt file"));

      String my_line = my_br.readLine();

      while (my_line != null) 
      {
         my_pw.println(my_line);
         my_line = my_br.readLine();
      }

      my_br = new BufferedReader(new FileReader("path to second .txt file"));

      my_line = my_br.readLine();

      while(my_line != null) 
      {
         my_pw.println(my_line);
         my_line = my_br.readLine();
      }

      my_pw.flush();
      my_br.close();
      my_pw.close();
      System.out.println("The first two files have been merged into the third file successfully.");
   }
}
