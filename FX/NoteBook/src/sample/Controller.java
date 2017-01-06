package sample;

import Database.DataInOut;
import Database.Record;
import InQuery.InputQuery;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {
    @FXML ListView listView;
    @FXML TextArea textArea;
    @FXML Button delButton;
    Record clickedItem;
    private static int counter = 1;
    public ListView getListView() {
        return listView;
    }

    private static ObservableList<Record> titlesList = FXCollections.observableArrayList();
    public static ObservableList<Record> getTitlesList() {
        return titlesList;
    }
    public void createListItem(){
        new InputQuery().textQuery("Добавить","Заголовок записи:");
    }
    public void refreshRecList(){
        System.out.println("Refreshed list:");
        System.out.println("____________");
        ArrayList<Record> wholeData= DataInOut.getWholeData();
        for(Record rec: wholeData){
            System.out.println(rec.getId()+": "+rec.getTitle());
        }
    }
    public void listViewItemClicked(){
        clickedItem = (Record) listView.getSelectionModel().getSelectedItem();
        if (clickedItem != null)
        textArea.setText(clickedItem.getText());
    }
    public void delButAction(){
        Record selectedItem = (Record) listView.getSelectionModel().getSelectedItem();
        if (selectedItem != null){
            DataInOut.removeRecord(selectedItem);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(getTitlesList());
        textArea.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(final ObservableValue<? extends String> observable, final String oldValue, final String newValue) {
                if (!listView.getSelectionModel().isEmpty())
                clickedItem.setText(textArea.getText());
            }
        });
//        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
//            System.out.println("Selected item: " + newValue);
//        });
    }
}
