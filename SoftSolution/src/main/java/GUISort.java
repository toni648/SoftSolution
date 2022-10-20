import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class GUISort extends JFrame {
    public GUISort(BogenLesen bogenLesen){
        super("sortieren");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();

            }
        });
        String[] daten = {"Kundennummer", "Zaehlernummer",
                "Zaehlerart","Datum",
                "Neu eingebunden","Zaehlerstand"};
        final JComboBox<String> cb = new JComboBox<>(daten);
        final JTextField text = new JTextField();
        final Container con = getContentPane();
        final JButton button = new JButton("OK");
        GridLayout grid = new GridLayout(1,3);
        JPanel panelGrid = new JPanel(grid);
        JPanel panelBrdLayout = new JPanel(new BorderLayout());
        panelBrdLayout.add(panelGrid, BorderLayout.WEST);
        panelGrid.add(cb);
        panelGrid.add(text);
        panelGrid.add(button);
        setSize(400,100);
        setVisible(true);
        con.add(panelBrdLayout);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              BogenLesen  bl = bogenLesen.search((String)cb.getSelectedItem(),text.getText());
            new GUIedit(bl);
            }
        });
    }
            private void exit() {
                System.exit(0);
            }
}
