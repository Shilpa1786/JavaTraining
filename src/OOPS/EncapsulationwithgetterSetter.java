package OOPS;

class Students {
    private int a, b;  //Though data Type is Private we are still able to fetch the limited value of a and b with getter and setter method

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

    public class EncapsulationwithgetterSetter {
        public static void main(String[] args) {
            Students s1 = new Students();
            s1.setA(10);
            System.out.println("Value of Student a1 is :-" +s1.getA());

        }
    }






