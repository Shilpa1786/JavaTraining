package Exception;

public class TryCatchFinally {
    public static void main(String[] args){

        int a=20,b=2,c;
        try {
            c = a / b;
            System.out.println("No exception");
        }
        catch(ArithmeticException e) {
        System.out.println("You will get -" +e+ " when try to devide by 0");
        }
        finally{
            System.out.println("reach to destination any how");
        }
        System.out.println("Jump outside try catch finally");

    }
}
