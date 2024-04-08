package Generic;

public class GenericMethod {

    public static void main(String[] args) {

        //Check whether customer is added already or not
        Branch branch1 =new Branch("Airoli");
       // branch1.createNewCustomer("A00","A001",200);
      //  System.out.println(branch1.getCustomer("A00").getAccountNumber() +" and this is the account number of customer");
      //  branch1.createNewCustomer("A02","A002",201);
        branch1.createNewCustomer("A03","A003",202);
        branch1.createNewCustomer("A04","A004",202);
       System.out.println(branch1.getCustomer("A03").getAccountNumber() +" and this is the account number of customer");




       /* CustomerClass custclass = new CustomerClass("Vishal","123f5",101);
        System.out.println(custclass.getAccountNumber());
        System.out.println(custclass.getAccountBalance());
        System.out.println(custclass.getName());

        Branch br =new Branch("Kotak",100);
        System.out.println(br.getBranchName());
        System.out.println(br.getDepositAmount());*//*
        Branch br =new Branch("BannA");
   //  br.createNewCustomer("A","001A", 2000);
        //br.createNewCustomer("A2","001A", 2000);


        CustomerClass custclass =br.getCustomer("A2");
        System.out.println(custclass.getAccountNumber());
        System.out.println(custclass.getAccountBalance());
        System.out.println(custclass.getName());*/

}

 }





