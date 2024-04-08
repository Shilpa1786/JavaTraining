package Variables;

public class diffStaticandLocal {
    static int a =10;
    void fun(){
        int b =10;
        System.out.println(a+ " " +b);
        ++a ;++b;
    }
    public static void main(String[] args){
        diffStaticandLocal diff = new diffStaticandLocal();
        diff.fun();
        diff.fun();
        diff.fun();

    }

}
