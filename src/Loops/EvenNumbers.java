package Loops;

public class EvenNumbers {
    public static void main(String[] args) {
        int i = 2;

        while (i <= 100) {

            if(i%2==0){  // "%" is mod remainder always shown 0 10/2 it will return 0
                // "/"division returns quotient 10/2 it will return 5

            System.out.println( "Even numbers between 100 Number "+i);}
            else{
                System.out.println("Number is odd");
            }
            i=i+2;
        }
    }
}
