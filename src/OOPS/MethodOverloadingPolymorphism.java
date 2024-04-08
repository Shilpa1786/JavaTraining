package OOPS;

class addr {
    int add(int a,int b) {

        return a + b;
        }



    int add(int a,int b,int c) {

        return
            a + b+ c;

    }
}

public class MethodOverloadingPolymorphism {
    public static void main(String[] args){
        addr ad = new addr();
        System.out.println("Printed addition " +ad.add(10,5));
        System.out.println("Printed addition " +ad.add(10,5,5));

    }
}
