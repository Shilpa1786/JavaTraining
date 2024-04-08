package genericandTypeCasting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generic {
    public static void main(String[] args) {

        //Normal Program with instance of object

        List list = new ArrayList();
        list.add(10);
        list.add("20");
        System.out.println(list);
        //1) Type-safety: We can hold only a single type of objects in generics.
        // It doesn?t allow to store other objects.

        //With Generics, it is required to specify the type of object we need to store.
        //it will not take any other value than specified datatype
        List<Integer> lis = new ArrayList<Integer>();
        lis.add(10);
        lis.add(11);
        lis.add(12);
        lis.add(13);
        //System.out.println("All list values are-" +lis);
        Iterator<Integer> itr = lis.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
