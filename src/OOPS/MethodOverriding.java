package OOPS;

class Bank1 {
    int getrateofinterest() {
        return 0;

    }
}
   class SBI extends Bank1{
       @Override
       int getrateofinterest() {
           return 1;
       }
   }
   class  ICICI extends Bank1{
       @Override
       int getrateofinterest() {
           return 2;
       }
   }


public class MethodOverriding {
    public static void main(String[] args){
      SBI s =new SBI();
      ICICI i =new ICICI();
        System.out.println(s.getrateofinterest());
        System.out.println(i.getrateofinterest());

    }
}
