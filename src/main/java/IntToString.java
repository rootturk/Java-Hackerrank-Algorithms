import java.util.Scanner;

public class IntToString {
    public static void main(String... arg){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String s = String.valueOf(n);

        if(n == Integer.parseInt(s)){
            System.out.println("Good Job");
        }else{
            System.out.println("Wrong answer");
        }

    }
}
