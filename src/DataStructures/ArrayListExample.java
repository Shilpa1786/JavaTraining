package DataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(); //Creating Arraylist
        list.add("Banana"); //Adding objects to the Arraylist
        list.add("Pineapple");
        System.out.println(list);
        list.addAll(2, Collections.singleton("Apple"));
        System.out.println(list);//Printing Arraylost object

    }
}
