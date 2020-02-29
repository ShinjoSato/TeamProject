import java.net.URL;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.File;

import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
 
public class login extends Application
{
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        URL location = getClass().getResource("/fxml/login.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
         
        Pane root = (Pane)fxmlLoader.load();
         
        Scene scene = new Scene(root, 450, 600);
         
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }

    @FXML
    public TextField username, password;

    @FXML
    protected void signIn(ActionEvent event) {
        System.out.println(username.getText()+", "+password.getText());
    }

    @FXML
    protected void createAccount(ActionEvent event){
        System.out.println("create new account");
    }

    @FXML
    protected void forgetPassword(ActionEvent event) {
        System.out.println("forget your password?");
    }
}