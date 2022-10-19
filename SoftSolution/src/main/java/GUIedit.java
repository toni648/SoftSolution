import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIedit extends JFrame {
    public GUIedit(){
        super("Bearbeiten");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });



        for(int i = 0; i>GUI)



        setSize(600, 500);
        setVisible(true);
    }
    private void exit() {
        System.exit(0);
    }
}
