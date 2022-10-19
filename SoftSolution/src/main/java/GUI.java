import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame{

    public GUI() {
        super("Ablesebogen");
        BogenLesen bogenLesen = new BogenLesen();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });
        final JLabel kNummer = new JLabel("Kundennummer");
        final JLabel zaehlerArt = new JLabel("Zählerart (Strom, Gas, Heizung, Wasser)");
        final JLabel zaehlerNummer = new JLabel("Zählernummer");
        final JLabel datum = new JLabel("Datum");
        final JLabel eingeb = new JLabel("neu eingebaut");
        final JLabel zaehlerStand = new JLabel("Zählerstand");
        final JLabel kommentar = new JLabel("Kommentar");

        final JTextField nr = new JTextField();
        final JTextField zart = new JTextField();
        final JTextField znr = new JTextField();
        final JTextField date = new JTextField(String.valueOf(LocalDate.now()));
        final JTextField insert = new JTextField();
        final JTextField zStand = new JTextField();
        final JTextField kommi = new JTextField();

        final JButton commitButton = new JButton("commit");
        final JButton getData = new JButton("Daten ausgeben");
        final JButton editButton = new JButton("bearbeiten");

        znr.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        zStand.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });

        //final JButton calc = new JButton("berechne");

        final Container con = getContentPane();
        GridLayout grid = new GridLayout(8, 2);
        grid.setHgap(50);
        JPanel panelGrid = new JPanel(grid);
        panelGrid.add(kNummer);
        panelGrid.add(nr);
        panelGrid.add(zaehlerArt);
        panelGrid.add(zart);
        panelGrid.add(zaehlerNummer);
        panelGrid.add(znr);
        panelGrid.add(datum);
        panelGrid.add(date);
        panelGrid.add(eingeb);
        panelGrid.add(insert);
        panelGrid.add(zaehlerStand);
        panelGrid.add(zStand);
        panelGrid.add(kommentar);
        panelGrid.add(kommi);
        panelGrid.add(commitButton);
        panelGrid.add(getData);


       JPanel panelBrdLayout = new JPanel(new BorderLayout());
        panelBrdLayout.add(panelGrid, BorderLayout.WEST);
        con.add(editButton, BorderLayout.SOUTH);

        con.add(panelBrdLayout);

        commitButton.addActionListener(new ActionListener(){    //User Story 1

            @Override
            public void actionPerformed(ActionEvent e) {


                bogenLesen.createbogen(new Ablesebogen(
                        nr.getText(), zart.getText(),znr.getText()
               ,date.getText(),insert.getText(),
                        zStand.getText(),kommi.getText()));

                nr.setText("");zart.setText("");znr.setText("");date.setText("");insert.setText("");
                zStand.setText("");kommi.setText("");

            }
        });
        getData.addActionListener(new ActionListener(){    //User Story 2

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(bogenLesen.zurückgeben());
            }
            });
        editButton.addActionListener(new ActionListener(){    //User Story 1

            @Override
            public void actionPerformed (ActionEvent e) {
                new GUIedit();
            }
        });

        setSize(600, 500);
        setVisible(true);
    }

    private void exit() {
        System.exit(0);
    }

}
