package Variables;

public class Assignment1 {

    double  itemprice1()
    {
        double price =20.10;
        int qty=4;
        double cost;
        return cost =price*qty;
    }
    double  itemprice2()
    {
        double price =30;
        int qty=2;
        double cost;
        return cost =price*qty;
    }
public static void main(String[] args){
    Assignment1 a= new Assignment1();
    System.out.println("Item Price Calculated as " +a.itemprice1());
    System.out.println("Item Price Calculated as " +a.itemprice2());//local variable aren't called rather methods can e called

}

}
