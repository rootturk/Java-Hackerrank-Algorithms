import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<List<String>> numberList = new ArrayList<>();

        for (int i =0;i<count;i++){
            numberList.add(Arrays.asList(scanner.nextLine().split(" ")));
        }

        int numberOfQuery = Integer.parseInt(scanner.nextLine()) ;

        for(int k=0;k<numberOfQuery;k++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(numberList.get(x-1).get(y));
            }catch (IndexOutOfBoundsException ex){
                System.out.println("ERROR!");
            }
        }

        scanner.close();
        System.out.println(numberList);
    }
}
