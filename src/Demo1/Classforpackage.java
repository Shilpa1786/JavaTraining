package Demo1;

public class Classforpackage {

    public void m1() {
        System.out.println("m1 of Classforpackage");
    }


    public static void main(String[] args) {
        Classforpackage cp = new Classforpackage();
        {
            cp.m1();
        }
    }
}
