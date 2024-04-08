class localvariable {
    double areaofcircle() {
        double area;
        double pi = 3.14;
        int radius = 2;
        area = pi * radius * radius;
        return area;


    }
}


public class LocalVariableAreaofCircle {
    public static void main(String[] args){
localvariable lc = new localvariable();
        System.out.println(lc.areaofcircle());
    }

    }

