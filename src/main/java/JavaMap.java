import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        int phoneCount = Integer.parseInt(scanner.nextLine());
        Map<String, String> addressNoteBook = new HashMap<>();

        for (int i = 0; i < phoneCount; i++) {
            addressNoteBook.put(scanner.nextLine(), scanner.nextLine());
        }

        while(scanner.hasNextLine()){
            String name = scanner.nextLine();
            if (addressNoteBook.containsKey(name)) {
                System.out.println(name + "=" + addressNoteBook.get(name));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
