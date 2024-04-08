package Exception;
//Try-Catch Block:
//Write a Java program that reads two integers from the user and calculates their division.
// Handle the ArithmeticException that may occur if the second integer is zero.
public class Arithmaticoperation {
    public static void main(String args[]){
        int a=2,b=0,c;
        try {
            c = a / b;
            System.out.println(c);
            System.out.println("ArithmeticException");
        }
        catch (ArithmeticException ae){
            System.out.println("Number cannot be devided by 0 else always recieve  "+ae);
        }
    }
}
