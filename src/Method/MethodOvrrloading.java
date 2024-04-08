package Method;
//method overloading program
public class MethodOvrrloading {
    static int count = 0;

    public MethodOvrrloading() {

        count++;
    }

        public int sum ( int a, int b){

            int c = a + b;
            return c;
        }


    public int sum() {
        int a = 20, b = 20;
        int c = a + b;
        System.out.println("Sum is :" + (a + b));
        return c;
    }

    public static void main(String[] args) {
        MethodOvrrloading c = new MethodOvrrloading();
        c.sum(10,20);

        int sum = c.sum();
        System.out.println("Second Sum  is:" +sum);

    }
    }


