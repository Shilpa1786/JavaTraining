package genericandTypeCasting;

class Mygen<T>{
    int obj;

    void add(int obj){ this.obj =obj;}
    int get(){ return obj;}
}
public class GenericClass {
    public static void main(String[] args) {
    Mygen<Integer> mg =new Mygen<Integer>();
    mg.add(20);
    mg.add(30);

    System.out.println(mg.get()); //print 30 as latest value


   // mg.add("shilpa") will not take string at all as kept integer
    }


}
