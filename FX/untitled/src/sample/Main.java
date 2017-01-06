package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene1, scene2;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        TextField textField = new TextField();
        Label label1 = new Label("Hello, ");
        Label label2 = new Label();
        HBox hBox = new HBox(label1, label2);
        VBox vBox = new VBox(textField,hBox);
        scene1 = new Scene(vBox,400,200);
        window.setScene(scene1);
        window.show();
        label2.textProperty().bind(textField.textProperty());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
