package myclasses;
public class SavingsAccount extends CheckingAccount{
    double balance;
    String username;
     public SavingsAccount(String username){
    super(username);
    this.balance = 0;
    }
}