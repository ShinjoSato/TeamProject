import java.net.URL;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class NewAccount extends Application
{
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        URL location = getClass().getResource("/fxml/newaccount.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
         
        Pane root = (Pane)fxmlLoader.load();
         
        Scene scene = new Scene(root, 450, 600);
         
        primaryStage.setScene(scene);
        primaryStage.setTitle("create new account");
        primaryStage.show();
    }

    @FXML
    public TextField email, username, password;

    @FXML
    protected void createAccount(ActionEvent event) {
        System.out.println(email.getText()+", "+username.getText()+", "+password.getText());
    }
}