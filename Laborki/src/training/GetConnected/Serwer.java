package training.GetConnected;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Serwer {

    public void response(){
        try{
            ServerSocket gniazdoServer = new ServerSocket(4242);

            while (true){
                Socket gniazdo = gniazdoServer.accept();
                System.out.println("program idzie dalej");
                PrintWriter pisarz = new PrintWriter(gniazdo.getOutputStream());

                Random random = new Random();
                int x = random.nextInt(300);
                pisarz.println(x);
                pisarz.close();
                System.out.println("koniec wysyłania "+x);
            }

        }catch (Exception e){

        }
    }

    public static void main(String[] args) {
        Serwer serwer = new Serwer();
        serwer.response();
    }
}
