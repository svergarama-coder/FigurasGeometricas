import javax.swing.*;
import java.awt.event.*;

public class VentanaEsfera extends JFrame {

    JTextField radio;

    JLabel volumen;
    JLabel superficie;

    JButton calcular;

    public VentanaEsfera() {

        setTitle("Esfera");
        setSize(400,300);
        setLayout(null);

        JLabel r = new JLabel("Radio:");
        r.setBounds(50,50,100,30);
        add(r);

        radio = new JTextField();
        radio.setBounds(150,50,100,30);
        add(radio);

        calcular = new JButton("Calcular");
        calcular.setBounds(120,110,120,40);
        add(calcular);

        volumen = new JLabel("Volumen:");
        volumen.setBounds(50,180,300,20);
        add(volumen);

        superficie = new JLabel("Superficie:");
        superficie.setBounds(50,210,300,20);
        add(superficie);

        calcular.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                double r = Double.parseDouble(radio.getText());

                Esfera es = new Esfera(r);

                volumen.setText(
                    "Volumen: " + es.calcularVolumen()
                );

                superficie.setText(
                    "Superficie: " + es.calcularSuperficie()
                );
            }
        });
    }
}