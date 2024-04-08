package Method;

import Exersize.CalculatorSwitchCase;
//Write a Java method named calculateArea that takes two parameters length and width of type double
// and calculates the area of a rectangle. The method should have a return type of double and should
// the calculated area.

public class AreaofRectangle {
    public double Calculatearea(double length,double width) {
        double AreaRectangle = length * width;
        System.out.println("Area of Rectangle is" +AreaRectangle);
        return AreaRectangle;

    }

    public static void main(String[] args) {
        AreaofRectangle ar =new AreaofRectangle();
        ar.Calculatearea(10,20);

    }

}
