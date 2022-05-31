import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringAnagrams {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        String wordOne = scanner.next();
        String wordTwo = scanner.next();

        scanner.close();

        String[] arrayOne = wordOne.toLowerCase().split("");
        String[] arrayTwo = wordTwo.toLowerCase().split("");

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        if (String.join("", arrayOne).equalsIgnoreCase(String.join("", arrayTwo))) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
