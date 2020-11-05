package training.train1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingereAWT implements ActionListener {

    JButton przycisk;


    public static void main(String[] args) {
        SwingereAWT apGUI = new SwingereAWT();
        apGUI.doDziela();
    }

    public void doDziela(){
        JFrame ramka = new JFrame();
        przycisk = new JButton("Kliknij mnie");
        przycisk.addActionListener(this);

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(300, 300);
        ramka.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        przycisk.setText("KLICKED");

    }



}
