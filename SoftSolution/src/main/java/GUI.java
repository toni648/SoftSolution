import jdk.vm.ci.meta.Local;

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
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame {

    public GUI() {
        super("Ablesebogen");
        final BogenLesen bogenLesen = new BogenLesen();

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
        final JTextField date = new JTextField();
        final JTextField insert = new JTextField();
        final JTextField zStand = new JTextField();
        final JTextField kommi = new JTextField();

        final JButton commitButton = new JButton("commit");


        //final JButton calc = new JButton("berechne");

        final Container con = getContentPane();
        GridLayout grid = new GridLayout(7, 2);
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


       JPanel panelBrdLayout = new JPanel(new BorderLayout());
        panelBrdLayout.add(panelGrid, BorderLayout.WEST);
        con.add(commitButton, BorderLayout.SOUTH);


        con.add(panelBrdLayout);

        commitButton.addKeyListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                String kundenNummer = nr.getText();
                int zaehlernummer = Integer.parseInt(zaehlerNummer.getText());
                String zaehlerArt = zart.getText();
                LocalDate datum = LocalDate.parse(date.getText());
                boolean neu_eingebaut = Boolean.parseBoolean(insert.getText());
                int zaehlerstand = Integer.parseInt(zStand.getText());
                String kommentar = kommi.getText();

                bogenLesen.createbogen(new Ablesebogen(
                        kundenNummer,zaehlerArt,zaehlernummer,datum, neu_eingebaut, zaehlerstand,kommentar
                ));
            }
        });

       /* calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcBmi(kg, cm, resBmi);
            }
        });
        kg.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    cm.requestFocusInWindow();
                }
            }
        });
        cm.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    calcBmi(kg, cm, resBmi);
                }
            }
        });*/

        setSize(600, 500);
        setVisible(true);
    }

    private void exit() {
        System.exit(0);
    }

}
