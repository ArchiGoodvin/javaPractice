package InQuery;

import Database.DataBaseException;
import Database.DataInOut;
import Database.IncorrectTitleException;
import Database.Record;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by User on 02.08.2016.
 */
public class Controller implements Initializable {
    @FXML Label queryMessage;
    @FXML TextField queryTextBox;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void handleOk(){
            Record record = new Record(queryTextBox.getText(),"");
            try {
                DataInOut.addRecord(record);
                FXMLLoader loader = Main.loader;
                sample.Controller controller =
                        loader.<sample.Controller>getController();
                controller.refreshRecList();
                Stage stage = (Stage) queryMessage.getScene().getWindow();
                stage.close();
            } catch (IncorrectTitleException e) {
                System.out.println("Not added");
            } catch (DataBaseException e) {
                e.printStackTrace();
            }

    }
    public void initData(String message){
        queryMessage.setText(message);
    }


}
