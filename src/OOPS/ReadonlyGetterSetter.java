package OOPS;

//user just need to read the values we can use getmethod notthe set metter out of getter setter
class Studentsgetter {
    private int a = 10, b;  //Though data Type is Private we are still able to fetch the limited value of a and b with getter and setter method
//here above we default set some values
    public int getA() {
        return a;
    }

}

public class ReadonlyGetterSetter {
    public static void main(String[] args) {
        Studentsgetter s1 = new Studentsgetter();
        System.out.println("Value of Student a1 is :-" + s1.getA());
    }
}
