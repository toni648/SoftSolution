import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;

public class GUIdata extends JFrame {
    public GUIdata(BogenLesen bogenLesen){
        super("URL eingeben");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });
        final Container con = getContentPane();
        GridLayout grid = new GridLayout(1,3);
        grid.setHgap(50);
        JPanel panelGrid = new JPanel(grid);
        JPanel panelBrdLayout = new JPanel(new BorderLayout());
        panelBrdLayout.add(panelGrid, BorderLayout.WEST);
        panelGrid.add(new JLabel("Url eingeben:"));
        JTextField text = new JTextField();
        panelGrid.add(text);
        JButton okButton = new JButton("ok");
        panelGrid.add(okButton);

        con.add(panelBrdLayout);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JSONFormat json= new JSONFormat();

                try {
                    FileWriter writer = new FileWriter(text.getText());
                    for (int i = 0; i<bogenLesen.getbogen().size();i++){
                        writer.write(json.jsonString(bogenLesen,i));
                        setVisible(false);
                    }
                    writer.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        setSize(350, 100);
        setVisible(true);
    }
    private void exit() {
        System.exit(0);
    }
}
