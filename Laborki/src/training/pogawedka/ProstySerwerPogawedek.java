import java.io.*;
import java.net.*;
import java.util.*;
public class ProstySerwerPogawedek {
    ArrayList strumienieWyjsciowe;
    public class ObslugaKlientow implements Runnable {
        BufferedReader czytelnik;
        Socket gniazdo;
        public ObslugaKlientow(Socket clientSocket) {
            try {
                gniazdo = clientSocket;
                InputStreamReader isReader = new InputStreamReader(gniazdo.getInputStream());
                czytelnik = new BufferedReader(isReader);
            } catch(Exception ex) {ex.printStackTrace();}
        } // koniec konstruktora
        public void run() {
            String wiadomosc;
            try {
                while ((wiadomosc = czytelnik.readLine()) != null) {
                    System.out.println("Odczytano: " + wiadomosc);
                    rozeslijDoWszystkich(wiadomosc);
                } // koniec ptli
            } catch(Exception ex) {ex.printStackTrace();}
        } // koniec metody
    } // koniec klasy wewntrznej

    public static void main (String[] args) {
        new ProstySerwerPogawedek().doRoboty();
    }
    public void doRoboty() {
        strumienieWyjsciowe = new ArrayList();
        try {
            ServerSocket serverSock = new ServerSocket(5000);
            while(true) {
                Socket gniazdoKlienta = serverSock.accept();
                PrintWriter pisarz = new PrintWriter(gniazdoKlienta.getOutputStream());
                strumienieWyjsciowe.add(pisarz);
                Thread t = new Thread(new ObslugaKlientow(gniazdoKlienta));
                t.start();
                System.out.println("mamy po czenie");
            }
        } catch(Exception ex) {
            ex.printStackTrace ();
        }
    } // koniec metody
    public void rozeslijDoWszystkich(String message) {
        Iterator it = strumienieWyjsciowe.iterator();
        while(it.hasNext()) {
            try {
                PrintWriter pisarz = (PrintWriter) it.next();
                pisarz.println(message);
                pisarz.flush();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        } // koniec ptli
    } // koniec metody
} // koniec klasy