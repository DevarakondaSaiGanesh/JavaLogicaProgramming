public class PerfectNumbers {

    public static void main(String[] args) {
       
        for (int num = 1; num <= 1000; num++) {
            isItPerfectNumber(num);
        }
    }

    public static void isItPerfectNumber(int num) {
        int factor = 1;
        String factors = "Factors: ";
        int total = 0;
        while (factor < num) {
            if (num % factor == 0) {
                total += factor;
                factors += factor + " ";
            }
            factor++;
        }
        if (total == num) {
            System.out.printf("%s is perfect number\n", num);
            System.out.print(factors + "\n");
        }
    }
}


