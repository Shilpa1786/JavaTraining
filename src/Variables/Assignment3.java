package Variables;
//Assignment 3: Static Variable
//Create a class called MathUtils with a static variable PI that holds the value of Pi (3.14159).
// Write a method to calculate and return the circumference of
// a circle using the formula 2 * PI * radius
public class Assignment3 {
    public static final double pi = 3.14159;
    public static int radius;
    public static double circum;

    double circumference() {
        radius = 2;
        circum = 2 * pi * radius;
        return circum;

    }

    public static void main(String[] arg) {
  /*    radius=40;
        System.out.println(circum);*/
        Assignment3 st = new Assignment3();
        System.out.println("Circumference is " + st.circumference());//called the method

    }
}


