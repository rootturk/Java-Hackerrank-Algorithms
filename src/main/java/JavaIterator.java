import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<3;i++){
            mylist.add(i);
        }

        mylist.add("###");
        for(int i=0;i<1;i++){
            mylist.add("Hello");
            mylist.add("Java");
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }

    }

    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){

            Object element = it.next();

            if(element instanceof String)


                break;
        }
        return it;

    }
}
