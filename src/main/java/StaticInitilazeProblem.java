import java.util.Scanner;

public class StaticInitilazeProblem {
    private static boolean flag =false;
    private static int H,B;
    static {
        Scanner scanner = new Scanner(System.in);

        B = scanner.nextInt();
        H = scanner.nextInt();

        if(B<=0 || H<=0){
         System.out.print("java.lang.Exception: Breadth and height must be positive");
        }else if (B<=100 || H <= 100){
            flag = true;
        }

    }
    public static void main(String... arg){
        if(flag){
            Scanner scanner = new Scanner(System.in);
            int B = scanner.nextInt();
            int H = scanner.nextInt();

            int area = B * H;

            System.out.println(area);
        }
    }
}

