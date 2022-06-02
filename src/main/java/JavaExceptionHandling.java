import java.util.Scanner;

public class JavaExceptionHandling {
    static long power(Integer value1, Integer value2) throws Exception{
        if(value1==0 && value2==0)
            throw new Exception("n and p should not be zero.");

        if(value1<0 || value2 < 0)
            throw new Exception("n or p should not be negative.");

        return (long)Math.pow(Double.valueOf(value1), Double.valueOf(value2));
    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(JavaExceptionHandling.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
