package genericandTypeCasting;

import java.util.ArrayList;
import java.util.List;

//Normal Typecasting
public class TypeCastAndGeneric {
    public static void main(String[] args) {
       /* List list = new ArrayList();
        list.add("hello");
        list.set(0,"Shilpa");
        String s =(String) list.get(0);
        String s1 =(String) list.get(0);
        System.out.println(s);
        System.out.println(s1);*/

        //generic we dont have to type cast

        List<String> list = new ArrayList<>();
        list.add("String shilpa");
        System.out.println(list);


    }

}
