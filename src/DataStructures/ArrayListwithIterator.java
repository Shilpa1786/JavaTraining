package DataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListwithIterator {

    public static void main(String[] args){
        ArrayList<String> list =new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("fig");
//traversing list through ietrator
        Iterator<String> iter;
       iter =list.iterator();//Generating iterator method
        while(iter.hasNext()){ //check whether ietrator has any elements
        System.out.println(iter.next());}//Print the element and move to the next



    }
}
