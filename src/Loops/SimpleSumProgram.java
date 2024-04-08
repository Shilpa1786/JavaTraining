package Loops;
//Addition of digits 1234
public class SimpleSumProgram {
    public static void main(String[] args) {
    /* Sum of digit 1234
    n=1234
    rem =n%10
    sum=sum+rem
    n=n/10 */
        int n = 1234, sum = 0, rem;

        while (n != 0) {
            rem = n % 10;
            sum = sum + rem; //4+3+2+1
            n = n / 10;

        }
        System.out.println("Sum of numbers are-" + sum);
    }
}

