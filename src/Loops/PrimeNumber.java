package Loops;

public class PrimeNumber {
    public static void main(String[] args) {

        int m,i,flag=0;
        int n = 21;
        m = n / 2;
        for(i=2;i<=m;i++) {
            if (n % i == 0) {
                System.out.println(n + " number is not prime number");
                flag = 1;
                break;
            }
        }
             if(flag==0) {
                System.out.println(n+ " number is  prime number");

            }
        }
    }

