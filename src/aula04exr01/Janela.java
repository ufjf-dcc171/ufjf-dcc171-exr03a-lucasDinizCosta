package aula04exr01;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Janela extends JFrame implements ActionListener{
    /**
     *  TESTAR COM: x²-2x-8 = 0 ==> x1 = 4 x2 = -2
     */
    
    private final JButton botaoCalcular = new JButton("Calcular");
    private final JLabel escrito_1 = new JLabel("<HTML>Coeficientes de uma equação de<br> 2º grau: </HTML>");
    private final JLabel escrito_2 = new JLabel("a = "); //coeficiente a
    private final JLabel escrito_3 = new JLabel("b = "); //coeficiente b
    private final JLabel escrito_4 = new JLabel("c = "); //coeficiente c
    private final JLabel escrito_5 = new JLabel("raiz 1 = "); //Raiz 1
    private final JLabel escrito_6 = new JLabel("raiz 2 = "); //Raiz 2
    private final JTextField campoCoef_1;
    private final JTextField campoCoef_2;
    private final JTextField campoCoef_3;
    
    
    public Janela() throws HeadlessException{
        super("Exercicio 3 - A (Baskhara)");
        FlowLayout layout = new FlowLayout(SwingConstants.CENTER);
        layout.setAlignment(3);
        setLayout(layout);
        campoCoef_1 = new JTextField(20);
        campoCoef_2 = new JTextField(20);
        campoCoef_3 = new JTextField(20);
        botaoCalcular.addActionListener(this);
        add(escrito_1);
        add(escrito_2);
        add(campoCoef_1);
        add(escrito_3);
        add(campoCoef_2);
        add(escrito_4);
        add(campoCoef_3);
        add(botaoCalcular);
        add(escrito_5);
        add(escrito_6);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botaoCalcular){
            try{
                Double coeficiente_a = Double.parseDouble(campoCoef_1.getText());
                Double coeficiente_b = Double.parseDouble(campoCoef_2.getText());
                Double coeficiente_c = Double.parseDouble(campoCoef_3.getText());
                Double delta = (Math.pow(coeficiente_b, 2) - 4 * coeficiente_a * coeficiente_c);
                System.out.println(delta);
                Double raiz_1 = (- coeficiente_b + Math.sqrt(delta))/(2 * coeficiente_a);
                Double raiz_2 = (- coeficiente_b - Math.sqrt(delta))/(2 * coeficiente_a);
                escrito_5.setText("raiz 1 = "+ raiz_1);
                escrito_6.setText("raiz 2 = "+ raiz_2);
            
            }catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Numeros digitados invalido");
            }
        }
    }
    
    
}
