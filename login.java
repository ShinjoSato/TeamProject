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
 
public class login extends Application{
    private static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) throws Exception {
        /*this.primaryStage = primaryStage;
        makeScene("/fxml/login.fxml", "Login");*/
    }

    /*public void makeScene(String fxmlfile, String title) throws Exception {
        URL location = getClass().getResource(fxmlfile);
        FXMLLoader fxmlLoader = new FXMLLoader(location);

        Scene scene = new Scene((Pane)fxmlLoader.load(), 450, 600);
        
        this.primaryStage.setScene(scene);
        this.primaryStage.setTitle(title);
        this.primaryStage.show();
    }*/

    /*@FXML
    public TextField username, password;

    @FXML
    protected void signIn(ActionEvent event) {
        System.out.println(username.getText()+", "+password.getText());
    }

    @FXML
    protected void createAccount(ActionEvent event) throws Exception{
        System.out.println("create new account");
        //makeScene("/fxml/NewAccount.fxml", "create account");
    }

    @FXML
    protected void forgetPassword(ActionEvent event) throws Exception{
        System.out.println("forget your password?");
        makeScene("/fxml/forgetting.fxml", "forget your password?");
    }*/
}