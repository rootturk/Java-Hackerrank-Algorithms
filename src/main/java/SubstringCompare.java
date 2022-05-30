import java.util.*;

public class SubstringCompare {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int subStrLen = scanner.nextInt();

        Set<String> subStrs = new HashSet<>();

        for (int k = 0; k < subStrLen; k++) {
            for (int i = k; (i + subStrLen) < word.length() + 1; i += subStrLen) {
                System.out.println(k + " " + i + " " + (i + subStrLen));
                subStrs.add(word.substring(i, i + subStrLen));
            }
        }

        List<String> strings = new ArrayList<>(subStrs);
        Collections.sort(strings);
        System.out.println(strings.get(0));
        System.out.println(strings.get(strings.size() - 1));
    }
}
