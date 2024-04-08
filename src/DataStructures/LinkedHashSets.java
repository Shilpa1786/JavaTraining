package DataStructures;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[]args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("ab");
        set.add("de");
        set.add("bc");
        for(String hashset :set){
            System.out.println(set);
        }

    }

}
