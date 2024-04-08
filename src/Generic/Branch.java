package Generic;

import java.util.ArrayList;

public class Branch {
    private ArrayList<CustomerClass> customers = new ArrayList<>();

    private String BranchName = "";
    private final long DepositAmount = 200;

    public Branch(String branchname) {
        this.setBranchName(branchname);

    }

    public String getBranchName() {
        return BranchName;
    }

    private void setBranchName(String branchname) {
        this.BranchName = branchname;
    }


    public void createNewCustomer(String customerName, String accountNumber, long accountBalance) {
        CustomerClass customerClass =this.getCustomer(customerName);
        if(customerClass==null) {
            {if(accountBalance<DepositAmount){
                System.out.println("Deposit amount entered is less than" +DepositAmount +"Please enter more amount");
            }else{
                System.out.println("Amount entered is aligned with" +DepositAmount +"You can create new account");
            }
            }
            CustomerClass newCustomer = new CustomerClass(customerName, accountNumber, accountBalance);
            customers.add(newCustomer);
            System.out.println("Total Customers= " +String.valueOf(customers.size()));
            System.out.println(customerName + "Customer Added to the customer list");
        }else{
            System.out.println("customer is already exist");
        }

    }
    public CustomerClass getCustomer(String customerName) {
        int size = customers.size();
        if(size!=0){
        for(int i = 0; i < size; i++) {
            if(customers.get(i).getName().equals(customerName)) ;
            {
                System.out.println(customers.get(i).getName() + "Found Customers");
                return customers.get(i);

            }
            }
        }
        return null;
    }


    }
