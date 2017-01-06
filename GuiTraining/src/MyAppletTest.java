import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by User on 06.03.2016.
 */
public class MyAppletTest extends Applet {
    @Override
    public void init() {

        JButton button1 = new JButton("Click");
        button1.setSize(100, 30);
       this.add(button1);

    }
}
