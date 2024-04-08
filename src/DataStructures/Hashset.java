package DataStructures;

import java.util.HashSet;
import java.util.Iterator;
//Hashset is not maintaining any order
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("ball");
        hs.add("bat");
        hs.add("racket");
        hs.add("ground");

       /*Iterator<String> iter;
       iter =hs.iterator();
       while(iter.hasNext()){
           System.out.println(iter.next());*/
        for (String cricket : hs) {
            System.out.println(cricket);
        }
    }
}

   /* public static void main(String[] args)
    {
        // your code goes here
        HashSet<String> h = new HashSet<String>();
        // Adding elements into HashSet using add()
        h.add("Geeks");
        h.add("for");
        h.add("Geek1");
        // Iterating over hash set items
        for (String i : h)
            System.out.println(i);
    }
*/




