package com.mycompany.bakerysystem;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.regex.*;
import javafx.application.Platform;

public class PrimaryController {
    
    @FXML
    private TextField emailTextField;
    
    @FXML
    private PasswordField passwordTextField;
    
    @FXML Button loginButton;
    @FXML Button createAccountButton;
    @FXML Button restaurantWorkerButton;
    
    

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void checkLoginCredentials(){
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if(!emailTextField.getText().isBlank() || !passwordTextField.getText().isBlank()){
            
        String email = emailTextField.getText();
        
        Matcher matcher = pattern.matcher(email);
        int count = 0;
        while(matcher.matches() == false){
            count++;
            if(count == 3){
                
            }
            
        }
        
        
        System.out.println(email +" : "+ matcher.matches()+"\n"); 
        String password = passwordTextField.getText();
        System.out.println(password);
        }else{
            
        }
    }
}
