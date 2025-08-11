package myclasses;


public class User {
    private String username;//instance variables
    private String password;

    public User(String username, String password){//constructor
                this.username = username;//innit
                this.password = password;//innit
            }
            

    public boolean checkPass(String otherPassword){ //password verification
        return this.password.equals(otherPassword);
        }

    public String getUser(){ //getter
        return this.username;
    }


}
     



