class Alphabets
  {
    public static void main(String[] args)
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter small or CAPITAL");
      String alphabets=sc.nextLine();
      // letters alphabets;
      //   alphabets=letters.CAPITAL;
       // String alphabets="CAPITAL";
      switch(alphabets)
        {
          case "small":
            for(ch='a';ch<='z';ch++)  
            {
             System.out.print(ch);
            }
            break;
          case "CAPITAL":
             for(ch='A';ch<='Z';ch++)  
            {
             System.out.print(ch);
            }
            break;
          default:
            System.out.println("Enter valid input");
        }
    }
  }
