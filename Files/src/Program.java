import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by User on 05.07.2015.
 */
public class Program {
    static PrintWriter out;

    public static void main(String... args){

        try {
            out = new PrintWriter(new FileWriter("file.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
