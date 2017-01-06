package InQuery;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by User on 02.08.2016.
 */
public class InputQuery {

    public void textQuery(String title, String message){
        Parent root = null;
        //Parent root = FXMLLoader.load(getClass().getResource("inputQuery.fxml"));
        try {
            //Creating a scene
            //root = FXMLLoader.load(getClass().getResource("inputQuery.fxml")); <-----

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "inputQuery.fxml"
                    )
            );
//            Scene queryScene = new Scene(root);
//
//            //Creating a Stage
//            Stage queryWindow = new Stage();

            Stage queryWindow = new Stage();
            queryWindow.setScene(
                    new Scene(
                            (Parent) loader.load()
                    )
            );

            InQuery.Controller controller =
                    loader.<InQuery.Controller>getController();
            queryWindow.setTitle(title);
            controller.initData(message);

            queryWindow.initModality(Modality.APPLICATION_MODAL);
            queryWindow.setResizable(false);
            queryWindow.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
