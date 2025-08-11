package myclasses;
public class BankAccount {

    public static void main(String[] args) {
        System.out.println("Hello, BankAccount");
    }

    double balance;
    public String username;
    public BankAccount(String username){
        this.username = username;
        this.balance = 0; //innit
    }
    
    public void deposit(int value){ //deposit method
        balance += value;
    }
    
    public void withdraw(int value){//withdraw method
        if(value > balance){
            System.out.println("Insufficient funds for withdrawal");
        }
        else{balance -= value;}
    }
    public void checkBalance(){ //check balance
        String balanceVal = String.format("%.2f", this.getBalance());
        String user = this.getUsername();
        System.out.println("Hello "+user+", your balance is $"+balanceVal);
    }
    public double getBalance(){ //getter
        return balance;
    }
    public String getUsername(){//getter
        return this.username;
    }

}


