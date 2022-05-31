import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        StringBuilder stringBuildervarible = new StringBuilder();
        stringBuildervarible.append(word);

        var reverseWord = stringBuildervarible.reverse().toString();

        if(reverseWord.equals(word)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
