import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

public class GUIedit2 extends JFrame {
    public GUIedit2(BogenLesen bogenLesen, int i){
        super("Bearbeiten");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });
        Ablesebogen ablesebogen= bogenLesen.getbogen(i);

        final Container con = getContentPane();
        GridLayout grid = new GridLayout(8,2);
        grid.setHgap(50);
        JPanel panelGrid= new JPanel(grid);

        final JLabel kNummer = new JLabel("Kundennummer");
        final JLabel zaehlerArt = new JLabel("Zählerart (Strom, Gas, Heizung, Wasser)");
        final JLabel zaehlerNummer = new JLabel("Zählernummer");
        final JLabel datum = new JLabel("Datum");
        final JLabel eingeb = new JLabel("neu eingebaut");
        final JLabel zaehlerStand = new JLabel("Zählerstand");
        final JLabel kommentar = new JLabel("Kommentar");

        final JTextField nr = new JTextField(ablesebogen.getKundenNummer());
        final JTextField zart = new JTextField(ablesebogen.getZaehlerArt());
        final JTextField znr = new JTextField(ablesebogen.getZaehlernummer());
        final JTextField date = new JTextField(ablesebogen.getDatum());
        final JTextField insert = new JTextField(ablesebogen.getNeu_eingebaut());
        final JTextField zStand = new JTextField(ablesebogen.getZaehlerstand());
        final JTextField kommi = new JTextField(ablesebogen.getKommentar());
        final JButton commitButton = new JButton("commit");
        final JButton deletButton = new JButton("delet");

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
        panelGrid.add(deletButton);




        JPanel panelBrdLayout = new JPanel(new BorderLayout());
        panelBrdLayout.add(panelGrid,BorderLayout.WEST);
        con.add(panelBrdLayout);

        commitButton.addActionListener(new ActionListener(){    //User Story 1

            @Override
            public void actionPerformed(ActionEvent e) {

            bogenLesen.setBogen(i,new Ablesebogen(
                    nr.getText(), zart.getText(), znr.getText()
                    , date.getText(), insert.getText(),
                    zStand.getText(), kommi.getText()));

                new GUIedit(bogenLesen);
            }
            });


        setSize(1300, 700);
        setVisible(true);
    }
    private void exit() {
        System.exit(0);
    }
    }

