import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIedit extends JFrame {
    public GUIedit(BogenLesen bogenLesen){
        super("Bearbeiten");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });
    final Container con = getContentPane();
    GridLayout grid = new GridLayout(0,2);
    grid.setHgap(50);
    JPanel panelGrid= new JPanel(grid);
        for (int i = 0; i> bogenLesen.bogen.size();i++){
            grid.setRows(i);
            panelGrid.add(new JLabel(bogenLesen.zurückgeben()));
            panelGrid.add(new JButton("edit"));
        }
        JPanel panelBrdLayout = new JPanel(new BorderLayout());
        panelBrdLayout.add(panelGrid,BorderLayout.WEST);
        con.add(panelBrdLayout);





        setSize(600, 500);
        setVisible(true);
    }
    private void exit() {
        System.exit(0);
    }
}
