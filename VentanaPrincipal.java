import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame {

    JButton cilindro;
    JButton esfera;
    JButton piramide;

    public VentanaPrincipal() {

        setTitle("Figuras Geométricas");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cilindro = new JButton("Cilindro");
        cilindro.setBounds(120,40,150,40);
        add(cilindro);

        esfera = new JButton("Esfera");
        esfera.setBounds(120,100,150,40);
        add(esfera);

        piramide = new JButton("Pirámide");
        piramide.setBounds(120,160,150,40);
        add(piramide);

        cilindro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                VentanaCilindro vc = new VentanaCilindro();
                vc.setVisible(true);
            }
        });

        esfera.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                VentanaEsfera ve = new VentanaEsfera();
                ve.setVisible(true);
            }
        });

        piramide.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                VentanaPiramide vp = new VentanaPiramide();
                vp.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}