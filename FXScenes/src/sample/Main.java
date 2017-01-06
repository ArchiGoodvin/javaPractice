package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene1, scene2;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        //Content of scene1
        Label label1 = new Label("This is the 1st scene");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(event -> window.setScene(scene2));
        VBox layout1 = new VBox(30);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1, 400, 200);
        //Content of scene2
        Label label2 = new Label("This is the 2st scene");
        Button button2 = new Button("Go to scene 1");
        button2.setOnAction(event -> window.setScene(scene1));
        VBox layout2 = new VBox(30);
        Button button3 = new Button("New window");
        button3.setOnAction(event -> {
            Label label2_1 = new Label("Empty window");
            StackPane layout2_1 = new StackPane(label2_1);
            Scene scene2_1 = new Scene(layout2_1,200,300);
            Stage stage2 = new Stage();
            stage2.setScene(scene2_1);
            stage2.initModality(Modality.APPLICATION_MODAL);
            stage2.showAndWait();
        });
        layout2.getChildren().addAll(label2,button2,button3);
        scene2 = new Scene(layout2, 400, 200);
        scene2.getStylesheets().add("viper.css");
        window.setScene(scene1);
        window.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
