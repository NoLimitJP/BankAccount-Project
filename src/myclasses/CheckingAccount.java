package myclasses;
public class CheckingAccount extends BankAccount {
    double balance;
    String username;
    public CheckingAccount(String username){
        super(username);
        this.balance = 0;
    }

    public void transferTo(BankAccount account, int amount){ //can transfer to any BankAccount Instance
        if(account instanceof BankAccount){//checks if the object is a bankaccount object
            if(this.getBalance()>= amount){
        this.withdraw(amount);
        account.deposit(amount);
    }
    else{
        System.out.println("Tranfer Failed: Insufficient Funds");
    }
        }
        else{
            System.out.println("Incorrect Type");
        }
    }

    public void transferFrom(BankAccount account, int amount){
        if(account instanceof BankAccount){if(account.getBalance()>= amount){//checks if the object is a bankaccount object
            account.withdraw(amount);//performs method from parent class
            this.deposit(amount);
        }
        else{System.out.println("Transfer Failed: Insufficient Funds");}
    }
    }



}
