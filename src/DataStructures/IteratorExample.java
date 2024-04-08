package DataStructures;

import javax.swing.text.Element;
import java.util.Iterator;
import java.util.Stack;

public class IteratorExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //Syntax of Stack
        for (int i = 0; i < 6; i++)
        {
            stack.push(i * i);
        }
            //Creating iterator named iter
            Iterator<Integer> iter;
            iter = stack.iterator();
            //Ietrating elements of the set
            while (iter.hasNext()) {
                int NextElement = iter.next();
                System.out.print(NextElement + " ");
            }
        }

}
