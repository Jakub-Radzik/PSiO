package training.swingTrain;

import javax.swing.*;
import java.awt.*;

public class TablesExample {

    JFrame f;

    public TablesExample() {
        f = new JFrame();

        f.setBackground(Color.BLACK);
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("siema");
        l1.addElement("siema");
        l1.addElement("siema");
        l1.addElement("siema");
        l1.addElement("siema");
        l1.addElement("siema");
        l1.addElement("siema");
        l1.addElement("siema");
        JList<String> list = new JList<>(l1);
        list.setBounds(100,100,75,75);
        f.add(list);

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new TablesExample();
    }
}
