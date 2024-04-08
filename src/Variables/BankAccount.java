package Variables;
//Assignment2
//Instance Variable
//Create a class called BankAccount with instance variables for account number,
// account holder name, and balance. Write methods to deposit and withdraw money from the account,
// as well as a method to display the account details
public class BankAccount {
    public String accountnumber;
    public String AccountholderName;
    public double balance;
    public double amount;

 public void setaccountdetails(String acholder,String acnumber,Double bal)
 {
     this.AccountholderName = acholder;
     this.accountnumber = acnumber;
     this.balance =bal;
 }
    double deposit(){
        balance = balance+ amount;
        return balance;
    }

  double withdraw(){
        balance = balance-amount;
        return balance;

    }
public void displaydetails()
{
    System.out.println(AccountholderName+""+accountnumber+""+balance);

}

public static void main(String[] args){
    BankAccount b =new BankAccount(); //Instance created
    b.amount=40.00;  //values Assigned
    b.balance=100;
    b.setaccountdetails("ShilpaJ ","12a ",4000.25);
    b.displaydetails();
    b.setaccountdetails("Arti ","12B ",6000.25);
    b.displaydetails();


    System.out.println("Deposited amount is " +b.deposit()); //get result
    b.amount =10;
    b.balance=200;
    System.out.println("withdrawn amount is " +  b.withdraw());

}
}
