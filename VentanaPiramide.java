import javax.swing.*;
import java.awt.event.*;

public class VentanaPiramide extends JFrame {

    JTextField base;
    JTextField altura;
    JTextField apotema;

    JLabel volumen;
    JLabel superficie;

    JButton calcular;

    public VentanaPiramide() {

        setTitle("Pirámide");
        setSize(400,350);
        setLayout(null);

        JLabel b = new JLabel("Base:");
        b.setBounds(50,40,100,30);
        add(b);

        base = new JTextField();
        base.setBounds(150,40,100,30);
        add(base);

        JLabel h = new JLabel("Altura:");
        h.setBounds(50,90,100,30);
        add(h);

        altura = new JTextField();
        altura.setBounds(150,90,100,30);
        add(altura);

        JLabel a = new JLabel("Apotema:");
        a.setBounds(50,140,100,30);
        add(a);

        apotema = new JTextField();
        apotema.setBounds(150,140,100,30);
        add(apotema);

        calcular = new JButton("Calcular");
        calcular.setBounds(120,190,120,40);
        add(calcular);

        volumen = new JLabel("Volumen:");
        volumen.setBounds(50,250,300,20);
        add(volumen);

        superficie = new JLabel("Superficie:");
        superficie.setBounds(50,280,300,20);
        add(superficie);

        calcular.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                double b = Double.parseDouble(base.getText());
                double h = Double.parseDouble(altura.getText());
                double a = Double.parseDouble(apotema.getText());

                Piramide p = new Piramide(b,h,a);

                volumen.setText(
                    "Volumen: " + p.calcularVolumen()
                );

                superficie.setText(
                    "Superficie: " + p.calcularSuperficie()
                );
            }
        });
    }
}