import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String wordOne = scanner.nextLine();

            if (isValid(wordOne)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }

    private static final String zeroTo255
            = "(\\d{1,2}|(0|1)\\"
            + "d{2}|2[0-4]\\d|25[0-5])";

    // Regex for a digit from 0 to 255 and
    // followed by a dot, repeat 4 times.
    // this is the regex to validate an IP address.
   private static String regex
            = zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255;

    private static final Pattern pattern = Pattern.compile(regex);

    public static boolean isValid(final String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
