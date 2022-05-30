import java.util.Scanner;

public class Substring {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int s = scanner.nextInt();
        int e = scanner.nextInt();

       System.out.println(word.substring(s, e));
    }
}
