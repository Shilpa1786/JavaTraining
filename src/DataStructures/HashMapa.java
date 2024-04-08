package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapa {
    public static void main(String[]args){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Grapes");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Watermelon");
        System.out.println("Iterating hashmap....");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
