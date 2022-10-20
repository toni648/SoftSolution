import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ErrorGUI extends JFrame {
    public ErrorGUI(String inhalt){

        super("Errormeldung");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });

        final Container con = getContentPane();
        con.setLayout(new BorderLayout());
        final JLabel meldung = new JLabel(inhalt);
        final JButton okButton = new JButton("OK");

        con.add(meldung, BorderLayout.NORTH);
        con.add(okButton, BorderLayout.CENTER);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
            }
        });

        setSize(200, 100);
        setVisible(true);

    }
    private void exit(){

        System.exit(0);
    }
}
