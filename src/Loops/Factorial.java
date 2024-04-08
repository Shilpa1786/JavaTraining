package Loops;

import java.util.Scanner;

public class Factorial {
    //5 =5*4*3*2*1
    static int fact = 1;
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial");
        fact = sc.nextInt();
    }

    int calculatefactorial(int fact) {
        for (int i = 1; i <= 5; i++) {

            fact = fact * i;

        }
        System.out.println(fact);
        return fact;
    }
    public static void main(String[] args) {

        Factorial fa = new Factorial();
        fa.getdata();
        fa.calculatefactorial(fact);

    }
}



