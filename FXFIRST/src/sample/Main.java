package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;

public class Main extends Application {
    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Content of the scene1
        //Label label1 = new Label("This is th 1st scene");
        Button button1 = new Button("Go to scene 2");
//        button1.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                window.setScene(scene2);
//            }
//        });
        StackPane layout1 = new StackPane();
        layout1.getChildren().add(button1);
        scene1 = new Scene(layout1,350,200);
//
//        //Content of the scene2
//        Label label2 = new Label("This is th 2st scene");
//        Button button2 = new Button("Go to scene 1");
//        button2.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                window.setScene(scene1);
//            }
//        });
//        VBox layou2 = new VBox(50);
//        layou1.getChildren().addAll(label2,button2);
//        scene1 = new Scene(layou2,500,250);

        window.setScene(scene1);
        window.setTitle("Scenes");
        window.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

}
