package Generic;

public class CustomerClass {
    private String CustomerName ="";
    private String AccountNumber ="";
    private long AccountBalance =0;

    public CustomerClass(String name, String accountNumber, long accountBalance) {
     this.setName(name);
        this.setAccountNumber(accountNumber);
        this.setAccountBalance(accountBalance);

    }

    public String getName() {
        return CustomerName;
    }

    private void setName(String name) {
    this.CustomerName =name;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

 private void setAccountNumber(String accountNumber) {
     this.AccountNumber = accountNumber;
    }

    public long getAccountBalance() {
        return AccountBalance;
    }

private void setAccountBalance(long accountBalance) {
        this.AccountBalance=accountBalance;
    }
}
