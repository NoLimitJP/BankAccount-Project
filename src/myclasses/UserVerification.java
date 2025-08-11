package myclasses;

import java.util.ArrayList;
import java.util.List;

public class UserVerification{
    private List<User> accountList; //list of user accounts
    private static String lastUser;

    public UserVerification(){ //object which can be used to verify if an account exists
        this.accountList = new ArrayList<>(); //contains all users
    }
    
    public User verify(String username,String password){//verification method
        System.out.println("Verifying user..... ");
        for(User user : this.accountList){
            if(username.equals(user.getUser()) && user.checkPass(password)){//if username matches and password is verified
                System.out.println("User verified: " + username);
                lastUser = username;
                return user; //successful log in
            }
        }
        System.out.println("Authentication Failed");
        return null; //unsuccessful log in
    }

    public boolean userInSystem(String username){
        for(User user : this.accountList){//traverse account list
            if(user.getUser().equals(username)){
                return true; //if the username is in the list
            }
        }return false; // if username is not in the list
    }

    public void addUser(User user){
           if (user != null) {//checks for null user object
            accountList.add(user);
            System.out.println("User added: " + user.getUser());
            lastUser = user.getUser();
        } else {
            System.out.println("Attempted to add null user");
        }
    }
    public void showUsers(){//displays all users' usernames
        for(User user :this.accountList){
            String thisUser = user.getUser();
            System.out.println(thisUser);
        }
    }
    public String getLast(){
        return lastUser;
    }
}
