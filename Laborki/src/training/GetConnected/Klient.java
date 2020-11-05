package training.GetConnected;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Klient {

    public void connectTo(){

        try {
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader inStRe = new InputStreamReader(s.getInputStream());
            BufferedReader buRe = new BufferedReader(inStRe);
            String text = buRe.readLine();
            System.out.println(text);
            buRe.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Klient klient = new Klient();
        klient.connectTo();
    }
}
