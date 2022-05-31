import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i =0; i<count;i++){
            String wordOne = scanner.nextLine().trim();
            try {
               Pattern.compile(wordOne);
               System.out.println("Valid");
            }catch (Exception ex){
                System.out.println("Invalid");
            }
        }
    }
}
