import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller extends Application{
	private static Stage primaryStage;

	@Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        makeScene("/fxml/login.fxml", "Login");
    }

	public void makeScene(String fxmlfile, String title) throws Exception {
        URL location = getClass().getResource(fxmlfile);
        FXMLLoader fxmlLoader = new FXMLLoader(location);

        Scene scene = new Scene((Pane)fxmlLoader.load(), 450, 600);
        
        this.primaryStage.setScene(scene);
        this.primaryStage.setTitle(title);
        this.primaryStage.show();
    }

    // -----
    // The below is "Login.java".
    // -----
    @FXML
    public TextField username, password;

    @FXML
    protected void signIn(ActionEvent event) throws Exception{
        System.out.println(username.getText()+", "+password.getText());
        makeScene("/fxml/friendlist.fxml", "friend list");
    }

    @FXML
    protected void moveToNewaccount(ActionEvent event) throws Exception{
        System.out.println("create new account");
        makeScene("/fxml/NewAccount.fxml", "create account");
    }

    @FXML
    protected void forgetPassword(ActionEvent event) throws Exception{
        System.out.println("forget your password?");
        makeScene("/fxml/forgetting.fxml", "forget your password?");
    }

    // The below is "NewAccount.java"
    @FXML
    public TextField email/*, username, password*/;

    @FXML
    protected void createAccount(ActionEvent event) {
        System.out.println(email.getText()+", "+username.getText()+", "+password.getText());
    }

    @FXML
    protected void backToLogin(ActionEvent event) throws Exception {
        System.out.println("Login");
        makeScene("/fxml/login.fxml", "Login");
    }

    // -----
    // The below is "Forgetting.java."
    // -----
    /*@FXML
    public TextField username, email;*/

    @FXML
    protected void sendPassword(ActionEvent event) throws Exception {
        System.out.println(username.getText()+", "+email.getText());
    }

    /*@FXML
    protected void backToLogin(ActionEvent event) throws Exception {
        System.out.println("Login");
        makeScene("/fxml/login.fxml", "Login");
    }*/

    // -----
    // The below is "friendlist.java".
    // -----
    @FXML
    protected void selectFriend (ActionEvent event) throws Exception {
        System.out.println("click your friend");
        makeScene("/fxml/chat.fxml", "Friend name");
    }

    // -----
    // The below is "chat.java"
    // -----
    @FXML
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

        VBox testbox = new VBox();
        testbox.setStyle("-fx-background-color: blue;");
        testbox.setAlignment(Pos.CENTER_RIGHT);

        Label test = new Label(":)");
        test.setId("yourtalk");
        test.setStyle("-fx-text-fill: pink;");

        testbox.getChildren().add(test);
        talkHistory.getChildren().add(testbox);
    }
}