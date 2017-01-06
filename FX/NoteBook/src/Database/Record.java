package Database;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

/**
 * Created by User on 02.08.2016.
 */
public class Record {
private static int numOfRec = 0;
private int id;
private String title;
private String text;


    public static void incNumOfRec(){
        numOfRec++;
    }
    public static void decNumOfRec(){
        numOfRec--;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static int getNumOfRec() {
        return numOfRec;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Record(String title, String text) {
        this.id = numOfRec;
        this.title = title;
        this.text = text;
    }

    @Override
    public String toString() {
        return title;
    }
}
