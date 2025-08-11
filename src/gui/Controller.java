package gui;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import myclasses.*;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Controller {
    @FXML
    private Parent root;
    @FXML
    private Scene scene;
    @FXML
    private Label label;
    @FXML
    private TextField userField;
    @FXML
    private Button logInButton;
    @FXML
    private Button signUpButton;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    public void initialize() {
        String javaVersion = "Java 22";
    }
    //Action event methods Below

    //login method
    @FXML
    private void logIn(ActionEvent event){
        String username = userField.getText();
        String password = passwordField.getText();
        UserVerification userVerification = new UserVerification();
        if(userVerification.userInSystem(username)) {
            System.out.println("User found");
            User user = userVerification.verify(username, password);
            if(user != null) {
                root = FXMLLoader.load(getClass().getResource("ui.fxml"));
                scene = signUpButton.getScene();
                scene.setRoot(root);
            }
                else{
                    System.out.println("Invalid Credentials");
                }
}
}

//Sign Up method; takes you to the sign up page
    @FXML
    private void signUp(ActionEvent event){
       try {
          root = FXMLLoader.load(getClass().getResource("signup.fxml"));
          scene = signUpButton.getScene();
          scene.setRoot(root);
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

}
