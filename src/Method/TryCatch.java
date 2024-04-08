package Method;

import java.text.ParseException;

//Try-Catch Block:
//Write a Java program that reads two integers from the user and calculates their division.
// Handle the ArithmeticException that may occur if the second integer is zero.
public class TryCatch {
    public static void main(String args[]) {
        String str = "shilpa";
        try {


            int a = Integer.parseInt(str);
            System.out.println("String shilpa covertto integer=" + a);
        }
        catch(NumberFormatException n){
            System.out.println("String " +str+ " will not be converted");
        }
    }
}





