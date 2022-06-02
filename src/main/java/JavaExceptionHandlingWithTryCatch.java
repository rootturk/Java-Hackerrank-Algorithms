import java.util.Scanner;

public class JavaExceptionHandlingWithTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int n = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(n / d);
        }catch(Exception ex){
            if(ex.getClass().getCanonicalName()=="java.lang.ArithmeticException"){
                System.out.println("java.lang.ArithmeticException: / by zero");

            }else{
                System.out.println(ex.getClass().getCanonicalName());
            }
        }

        sc.close();
    }
}
