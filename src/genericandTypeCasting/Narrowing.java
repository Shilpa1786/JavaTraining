package genericandTypeCasting;

public class Narrowing {
    public static void main(String[] args){
        double d = 166.567;
        long l =(long)d;// converting double datatype in to long datatype
        int i =(int)l; //converting long data type in to integer
        System.out.println("Before conversion:" +d);
        System.out.println("After conversion:" +l);
        System.out.println("After conversion into type:" +i);
    }
}
