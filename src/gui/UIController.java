package javafx;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import myclasses.UserVerification;
import myclasses.CheckingAccount;

public class UIController {
    @FXML
    private Text balanceText;
    @FXML
    private Parent root;
    @FXML
    private Scene scene;
    @FXML
    private Label welcomeLabel;
    @FXML
    private Button logOutButton;

    private String username;

    @FXML
    public void initialize() {
        UserVerification userVerification = new UserVerification();  //new instance of UserVerification object
        username = userVerification.getLast();                      //access static method to access last user which is updated via log in or sign up 
        CheckingAccount myAccount = new CheckingAccount(username);  //new Checking account object(In the future consider making it optional for a savings account)
        balanceText.setText("" + myAccount.getBalance());         //display account balance to the application from backend to FXML file
    }

    @FXML
    private void logOut(ActionEvent event) {                    //logout button action
        try {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));   //create root
            scene = logOutButton.getScene();                      //get current scene and root
            scene.setRoot(root);//change the current scene and root to the root we created which should update the UI
        } catch (Exception e) {
            e.printStackTrace();// print stack trace if anything goes wrong in this process
        }
    }

}
