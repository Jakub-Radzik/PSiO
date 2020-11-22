package training.swingTrain;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OptionExample{
    JFrame f;

    public OptionExample() {
        f = new JFrame();
        f.addWindowListener(new windowCloseEvent());
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }



    class windowCloseEvent  extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            int a = JOptionPane.showConfirmDialog(f,"Are you sure?");

            if(a==JOptionPane.YES_OPTION){
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        }
    }


    public static void main(String[] args) {
        new OptionExample();
    }
}
