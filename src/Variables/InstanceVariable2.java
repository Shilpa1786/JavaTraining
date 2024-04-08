package Variables;

public class InstanceVariable2 {
    public int radius;
    public double lenth;
    public boolean bool;
    protected double breadth;

    public static void main(String[] args){
        InstanceVariable2 iv = new InstanceVariable2();
        //assign values to instance variable
        iv.lenth =10.2;
        iv.breadth=5;
        double area;
        area= iv.lenth* iv.breadth;
        System.out.println( "Area of rectangle "+area);
        System.out.println(iv.lenth);
        System.out.println(iv.bool);
        System.out.println(iv.radius);
        System.out.println(iv);


//Second program calculate the perimeter
        InstanceVariable2 peri =new InstanceVariable2();
        peri.perimeter();

    }

    //method of perimeter
    void perimeter(){
        lenth=10;
        breadth=20;
   double perimeter;
   perimeter =lenth*breadth;
        System.out.println("Perimeter of Rectangle is =" +perimeter);

    }
}
