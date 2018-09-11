package BankAccount;
public class BankApplication 
{
    public static void main(String[] args)
    {
        
        BankAccount myAccount = new BankAccount("11223344", 200);
        
        myAccount.viewAccount();
        
        myAccount.deposit(150);
        
        myAccount.viewAccount();
        
        if(myAccount.withdraw(300)){
            System.out.println("successfully withdraw " + 300);
        }else{
            System.out.println("withdraw operation has been rejected");
        }
        
        BankAccount otherAccount = new BankAccount("00224455", 500);
        
        if(myAccount == otherAccount){
            System.out.println("Duplicate Account");
        }else{
            System.out.println("The two accounts are different");
        }
        
    }
    
}
