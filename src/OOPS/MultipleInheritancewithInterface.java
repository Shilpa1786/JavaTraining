package OOPS;

class Printables{
    void print()
    {
        System.out.println("Printablemethod");
    }
}
interface Showable{
    void print();
}
class multiinheritance extends Printables implements Showable{
    public void print(){
        System.out.println("This is an example of multiple inheritance");
    }
}
public class MultipleInheritancewithInterface{

public static void main(String[] args){
    multiinheritance test =new multiinheritance();
            test.print();
    Printables pr =new Printables();
    pr.print();

}
}
