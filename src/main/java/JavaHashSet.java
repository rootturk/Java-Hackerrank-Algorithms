import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        String[] left = new String[t];
        String[] right = new String[t];

        for (int i=0;i<t;i++){
            left[i] = scanner.next();
            right[i] = scanner.next();
        }

        Set<String> pairList = new HashSet<>();

        for (int i=0;i<t;i++){
            pairList.add(left[i] + "_" + right[i]);
            System.out.println(pairList.size());
        }
    }
}
