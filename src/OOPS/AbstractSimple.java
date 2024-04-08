package OOPS;
abstract class Shapes{

    //note that we have not implemented the functionality of the method
    public abstract void draw();

}

class circle extends Shapes{
    public void draw() {
        System.out.println("shape is circle");
    }
}
class rectangle extends Shapes{
    public void draw() {
        System.out.println("Shape is rectangle");
    }
}
public class AbstractSimple {
    public static void main(String[] args){
      Shapes cr = new circle();
        cr.draw();
      Shapes rect = new rectangle();
      rect.draw();
    }

}
