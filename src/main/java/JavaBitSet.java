import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine().trim().split(" ")[0]);
        BitSet b1 = new BitSet(size);
        BitSet b2 = new BitSet(size);
        BitSet[] bitsetList = new BitSet[] {b1,b2};

        while (sc.hasNextLine()){
            String[] s = sc.nextLine().trim().split(" ");
            int first = Integer.parseInt(s[1])-1;
            int second = Integer.parseInt(s[2])-1;
            switch (s[0]){
                case "AND"->
                    bitsetList[first].and(bitsetList[second]);
                case "OR"->
                    bitsetList[first].or(bitsetList[second]);
                case "FLIP"->
                    bitsetList[first].flip(second+1);
                case "XOR"->
                    bitsetList[first].xor(bitsetList[second]);
                case "SET"->
                    bitsetList[first].set(second+1);
            }

            System.out.println(bitsetList[0].cardinality() + " "+ bitsetList[1].cardinality());
        }



    }
}
