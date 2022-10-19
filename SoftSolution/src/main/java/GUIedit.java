import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        for (int i = 0; i< bogenLesen.getbogen().size();i++){
            grid.setRows(i+1);
            panelGrid.add(new JLabel(bogenLesen.zurückgeben(i)));
            JButton button = new JButton("edit");
            panelGrid.add(button);
            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new GUIedit2(bogenLesen, finalI);
                    setVisible(false);
                }
            });
        }
        JButton back = new JButton("back");
        con.add(back, BorderLayout.SOUTH);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI(bogenLesen);
                setVisible(false);
            }
        });

        JPanel panelBrdLayout = new JPanel(new BorderLayout());
        panelBrdLayout.add(panelGrid,BorderLayout.WEST);
        con.add(panelBrdLayout);





        setSize(1300, 700);
        setVisible(true);
    }
    private void exit() {
        System.exit(0);
    }
}
