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
 
public class Forgetting extends Application
{
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        /*URL location = getClass().getResource("/fxml/forgetting.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
         
        Pane root = (Pane)fxmlLoader.load();
         
        Scene scene = new Scene(root, 450, 600);
         
        primaryStage.setScene(scene);
        primaryStage.setTitle("forget your password");
        primaryStage.show();*/
    }

    /*@FXML
    public TextField username, email;

    @FXML
    protected void sendPassword(ActionEvent event) {
        System.out.println(username.getText()+", "+email.getText());
    }*/
}