package training.swingTrain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Enumeration;

public class SwingCompo {
    public static void main(String[] args) {

        JFrame f = new JFrame("My Java App");
        JButton btn = new JButton("Show Selected");
        JLabel selected = new JLabel("Select and confirm");
        btn.setBounds(10,200,130,40);

        JRadioButton c1 = new JRadioButton("Java");
        JRadioButton c2 = new JRadioButton("C++");
        JRadioButton c3 = new JRadioButton("Scala");
        c1.setSelected(true);

        String[] country = {"Poland", "USA", "England"};
        JComboBox cb = new JComboBox(country);

        c1.setBounds(10,10,100,30);
        c2.setBounds(10,50,100,30);
        c3.setBounds(10,90,100,30);

        cb.setBounds(10,120,100,40);

        selected.setBounds(10,250,500,50);

        ButtonGroup bg = new ButtonGroup();
        bg.add(c1); bg.add(c2); bg.add(c3);

        f.add(btn); f.add(c1); f.add(c2); f.add(c3);
        f.add(cb); f.add(selected);

        btn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selected.setText("You selected: "+getSelectedButtonText(bg)+" and "+ cb.getItemAt(cb.getSelectedIndex()));
                JOptionPane.showMessageDialog(null, "Congratulations");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        f.setResizable(false);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static String getSelectedButtonText(ButtonGroup bg){
        for(Enumeration<AbstractButton> btns = bg.getElements();btns.hasMoreElements();){
            AbstractButton btn = btns.nextElement();
            if(btn.isSelected()){
                return btn.getText();
            }
        }
        return null;
    }

}
