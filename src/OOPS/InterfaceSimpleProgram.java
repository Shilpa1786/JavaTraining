package OOPS;

interface Printable {
    void print();
}
class A6 implements Printable{
    @Override
    public void print() {
        System.out.println("Hello");
    }
}

public class InterfaceSimpleProgram {
    public static void main(String[] args){
        A6 pr1 = new A6();
        pr1.print();

    }
}

