import java.net.URL;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.File;
import javafx.geometry.Pos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
 
public class chat extends Application
{
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) throws Exception
    { 
        Pane root = FXMLLoader.load(getClass().getResource("/fxml/chat.fxml"));
         
        Scene scene = new Scene(root, 450, 600);
         
        primaryStage.setScene(scene);
        primaryStage.setTitle("chat view");
        primaryStage.show();
    }

    /*@FXML
    public TextArea message;

    @FXML
    public TextField keyword;

    @FXML
    public VBox talkHistory;

    @FXML
    protected void sendMessage(ActionEvent event) {
        String messageText = message.getText();
        System.out.println(messageText);
        message.setText("");

        VBox testbox = new VBox();
        testbox.setStyle("-fx-background-color: blue;");
        testbox.setAlignment(Pos.CENTER_RIGHT);

        Label test = new Label(messageText);
        test.setId("yourtalk");
        test.setStyle("-fx-text-fill: pink;");

        testbox.getChildren().add(test);
        talkHistory.getChildren().add(testbox);
    }

    @FXML
    protected void searchWord(ActionEvent event) {
        System.out.println(keyword.getText());
        keyword.setText("");
    }

    @FXML
    protected void pushEmoji(ActionEvent event) {
        System.out.println(":)");
    }*/
    
}