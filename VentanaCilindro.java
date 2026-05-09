import javax.swing.*;
import java.awt.event.*;

public class VentanaCilindro extends JFrame {

    JTextField radio;
    JTextField altura;

    JLabel volumen;
    JLabel superficie;

    JButton calcular;

    public VentanaCilindro() {

        setTitle("Cilindro");
        setSize(400,300);
        setLayout(null);

        JLabel r = new JLabel("Radio:");
        r.setBounds(50,40,100,30);
        add(r);

        radio = new JTextField();
        radio.setBounds(150,40,100,30);
        add(radio);

        JLabel h = new JLabel("Altura:");
        h.setBounds(50,90,100,30);
        add(h);

        altura = new JTextField();
        altura.setBounds(150,90,100,30);
        add(altura);

        calcular = new JButton("Calcular");
        calcular.setBounds(120,140,120,40);
        add(calcular);

        volumen = new JLabel("Volumen:");
        volumen.setBounds(50,200,300,20);
        add(volumen);

        superficie = new JLabel("Superficie:");
        superficie.setBounds(50,230,300,20);
        add(superficie);

        calcular.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                double r = Double.parseDouble(radio.getText());
                double h = Double.parseDouble(altura.getText());

                Cilindro c = new Cilindro(r,h);

                volumen.setText(
                    "Volumen: " + c.calcularVolumen()
                );

                superficie.setText(
                    "Superficie: " + c.calcularSuperficie()
                );
            }
        });
    }
}