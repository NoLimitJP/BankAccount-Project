package gui;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import jdk.jshell.execution.LoaderDelegate;
import myclasses.*;

public class SignUpController{
    @FXML
    private Parent root;
    @FXML
    private Scene scene;
    @FXML
    private TextField userField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    private Button signUpButton;
    @FXML
    public void initialize() {
       
    }

    @FXML
    private void createAccount(ActionEvent event){
        String username = userField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        if (password.equals(confirmPassword)) {
            User user = new User(username, password);
            UserVerification userVerification = new UserVerification();
            userVerification.addUser(user);
                try {
                    root = FXMLLoader.load(getClass().getResource("ui.fxml"));
                    scene = signUpButton.getScene();
                    scene.setRoot(root);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        System.out.println("User added successfully");
    }else{System.out.println("Something isn't right. try again");}
}

}
