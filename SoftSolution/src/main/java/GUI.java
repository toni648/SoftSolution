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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame {

    public GUI() {
        super("Ablesebogen");

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


        //final JButton calc = new JButton("berechne");

        final Container con = getContentPane();
        GridLayout grid = new GridLayout(7, 2);
        grid.setHgap(50);
        JPanel panelGrid = new JPanel(grid);
        panelGrid.add(kNummer);
        panelGrid.add(kg);
        panelGrid.add(groesse);
        panelGrid.add(cm);
        panelGrid.add(BMI);
        panelGrid.add(resBmi);
        panelGrid.add(Kategorie);
        panelGrid.add(resKat);
        JPanel panelBrdLayout = new JPanel(new BorderLayout());
        panelBrdLayout.add(panelGrid, BorderLayout.WEST);
        panelBrdLayout.add(calc, BorderLayout.CENTER);
        con.add(panelBrdLayout);

        calc.addActionListener(new ActionListener() {
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
        });

        setSize(400, 100);
        setVisible(true);
    }

    private void calcBmi(final JTextField kg, final JTextField cm, final JLabel resBmi) {
        double size = Double.parseDouble(cm.getText()) / 100;
        double weight = Double.parseDouble(kg.getText());
        double bmi = weight / (size*size);
        resBmi.setText(String.format("%.2f", bmi));
        // TODO: hier Fallunterscheidung Kategorie...
    }

    private void exit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        new BmiRechner();

    }
}
