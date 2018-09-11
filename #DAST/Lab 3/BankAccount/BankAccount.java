package BankAccount;
public class BankAccount 
{
    private String accountNumber;
    private double balance;
    
    public BankAccount(String acc, double bal){
        this.accountNumber = acc;
        this.balance = bal;
    }
    
    public boolean equal(BankAccount other){
        return(this.accountNumber == other.accountNumber);
    }
    
    public String getAccount(){
        return this.accountNumber;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void deposit(double amount){
        this.balance = amount + this.balance;
    }
    
    public boolean withdraw(double amount){
        boolean result;
        if(amount <= this.balance){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    public void viewAccount(){
        System.out.println("Account number " + this.accountNumber +
                            " having " + this.balance);
    }
    
}
