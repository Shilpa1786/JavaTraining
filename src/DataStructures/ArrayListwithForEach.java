package DataStructures;

import java.util.ArrayList;

public class ArrayListwithForEach {
    public static void main(String[] args)

    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Grapes");
        list.add("Apple");
        list.add("Fig");
        list.add("Watermelon");
        //Traversing list through for-each loop
        for(String fruit:list){ //for each int i //loop counter
            System.out.println(fruit);
        }
    }
}
