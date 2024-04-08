public class OperatorsProgram {
    public static void main(String[] args) {

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";      //String values
        short r = -5000;             //Short
        long l = 100000L;            //Long
        double d1 = 12.3;
        int a = 10;
        int b = 20;


        OperatorsProgram Op = new OperatorsProgram();
        Op.add(a,b);
    }


    public void add(int a, int b) {
        int c = a + b;
        int d = a * b;
        System.out.println(c);
        System.out.println(d);
    }
}

