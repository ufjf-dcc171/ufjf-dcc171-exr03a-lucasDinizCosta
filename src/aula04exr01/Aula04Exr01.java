package aula04exr01;

import javax.swing.JFrame;

public class Aula04Exr01 {

    public static void main(String[] args) {
        Janela j = new Janela();
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(265, 600);
        j.setVisible(true);
    }

}
