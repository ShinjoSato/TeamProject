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
 
public class friendlist extends Application
{
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        /*URL location = getClass().getResource("/fxml/friendlist.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
         
        Pane root = (Pane)fxmlLoader.load();
         
        Scene scene = new Scene(root, 450, 600);
         
        primaryStage.setScene(scene);
        primaryStage.setTitle("friend list");
        primaryStage.show();*/
    }

    /*@FXML
    protected void selectFriend(ActionEvent event) {
        System.out.println("click your friend");
    }*/
}