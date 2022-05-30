import java.io.*;
import java.util.*;

public class StringIntroduction {

    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(a.length() + b.length());

        System.out.println(IsGreater(a, b) ? "Yes":"No");
        System.out.println(firstCapitalizeCharacter(a) + " " + firstCapitalizeCharacter(b));
    }

    private static String firstCapitalizeCharacter(String value) {
        StringBuilder capitalizedString = new StringBuilder();
        int count = 0;

        for (String s : value.split("")) {

            if (count == 0) {
                capitalizedString.append(s.toUpperCase());
            } else {
                capitalizedString.append(s);
            }
            count++;
        }

        return capitalizedString.toString().toString();
    }

    private static boolean IsGreater(final String v1, final String v2){
        ArrayList<String> orderedStrings = new ArrayList<String>(){{
            add(v1);
            add(v2);
        }};

        Collections.sort(orderedStrings);

        return orderedStrings.get(0) == v2;

    }
}