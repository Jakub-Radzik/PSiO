package training.swingTrain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstGUI {

        JFrame f;
        JButton send;
        JButton clear;
        JTextField tf;

    public FirstGUI() {
        f = new JFrame("BUTTON EXAMPLE");
        send = new JButton("Click");
        clear = new JButton("Clear");
        tf = new JTextField();

        send.setBounds(50,50,95,30);
        clear.setBounds(50,100,100,40);
        tf.setBounds(0,10,200,30);

        send.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                consoleInfo(tf);
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
        clear.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tf.setText("");
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
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                tf.requestFocus();
            }
        });
        tf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==10) {
                    consoleInfo(tf);
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        f.add(send);
        f.add(tf);
        f.add(clear);

        f.setSize(300,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        FirstGUI app = new FirstGUI();
    }

    public static void consoleInfo(JTextField textField){
        System.out.println(textField.getText());
        textField.setText("");
    }

    class SendButton implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println(tf.getText());
            tf.setText("");
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            tf.requestFocus();

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    class ClearButton implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {
            tf.setText("");
            tf.requestFocus();
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
    }

}
