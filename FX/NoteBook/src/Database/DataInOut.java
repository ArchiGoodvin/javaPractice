package Database;

import java.util.ArrayList;

import static Database.Data.data;

/**
 * Created by User on 08.08.2016.
 */
public class DataInOut {
    public static void addRecord(Record record) throws DataBaseException{

        if (record.getTitle().trim().length() == 0){
            throw new IncorrectTitleException("Only spaces in title");
        }
        else{
            System.out.println("Record was crated. Title: "+record.getTitle()+" id: "+record.getId());
            record.setId(Record.getNumOfRec());
            Record.incNumOfRec();
            data.add(record);
            sample.Controller.getTitlesList().addAll(record);

        }

    }
    public static void removeRecord(Record record){
        Record.decNumOfRec();
        sample.Controller.getTitlesList().remove(record);
        data.remove(record);
        System.out.println("Record was removed");

    }
    public static ArrayList<Record> getWholeData(){
        return Data.data;
    }
}
