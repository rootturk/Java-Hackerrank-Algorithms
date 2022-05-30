import java.util.Scanner;

public class EndOfFile {
    public static void main(String... arg){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNext()){
            System.out.println(count + " "+ scanner.next());
            count++;
        }
    }
}
