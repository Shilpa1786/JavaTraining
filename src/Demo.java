public class Demo {
    public static void main(String[] args) {

        int i = 10;
        float j = 2.5F;
        char k = 'C';
        int a = 20;
        int b = 30;

        System.out.println("integer value" + i);
        System.out.println("Float value" + j);
        System.out.println("Char value" + k);

        Demo obj = new Demo();
        obj.add(a, b);

    }

    public void add(int a, int b) {
        int c = a + b;
        System.out.println(c);

    }

       /* System.out.println(i);
        System.out.println("First Java Program");
        //Demo obj =new Demo();
        //obj.display();
    }
        private void display()
        {
            System.out.println("Inside display method.");
        }

//Try Variable
    //Addition with operaators
//Addition program debug flow
        */
}




