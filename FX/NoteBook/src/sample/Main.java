package sample;

import Database.Record;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    public static FXMLLoader loader;

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        loader = new FXMLLoader(
                getClass().getResource(
                        "sample.fxml"
                )
        );
        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.setScene(new Scene((Parent) loader.load()));
        primaryStage.setHeight(500);
        primaryStage.setWidth(700);
        primaryStage.show();
        //Start of the code
        String result = new String();

        System.out.println(result);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
