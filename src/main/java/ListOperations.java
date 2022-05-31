import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        int listSize = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        int opSize = Integer.parseInt(scanner.nextLine());

        for(int i =0;i<opSize;i++){
            String operationName = scanner.nextLine();
            if(operationName.equals("Insert")){
                var index = scanner.nextInt();
                var value = scanner.nextInt();
                list.add(index, String.valueOf(value));
            }else if(operationName.equals("Delete")){
                var index = scanner.nextInt();
                list.remove(index);
            }
            if(scanner.hasNextLine())
                scanner.nextLine();
        }

        System.out.println(String.join(" ", list));
    }
}
