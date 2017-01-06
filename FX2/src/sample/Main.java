package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    boolean isClicked = false;
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane layout = new StackPane();
        primaryStage.setScene(new Scene(layout, 300, 275));
        button= new Button("Click me");
        button.setOnAction(event ->   {

                if(isClicked) {
                    button.setText("Click me");
                    isClicked = false;
                }
                else{
                    button.setText("I was Clicked");
                    isClicked = true;
                }


        });
        layout.getChildren().add(button);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
