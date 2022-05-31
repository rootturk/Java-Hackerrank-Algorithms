import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().trim();

        if(word.isEmpty()){
            System.out.println(0);
        }else {
            String regexPattern = "[ !,?._'@]+";
            String[] filteredWords = word.split(regexPattern);

            if (filteredWords.length < 400000) {
                System.out.println(filteredWords.length);
                System.out.println(String.join("\n", filteredWords));
            }
        }
    }
}
