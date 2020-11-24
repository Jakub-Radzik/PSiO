package lab.list4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String keyboard = "QWERTYUIOPASDFGHJKLZXCVBNM";

        Przelacznik[] blueKhalids = new Przelacznik[keyboard.length()];
        Przelacznik[] cherryRed = new Przelacznik[keyboard.length()];
        Przelacznik[] basicMembrana = new Przelacznik[keyboard.length()];
        String[] dostepneKolory = {"Czerwony", "Niebieski", "Biały", "Zielony"};

        for (int i = 0; i < keyboard.length(); i++) {
            String keyboardChar = String.valueOf(keyboard.charAt(i));
            blueKhalids[i] = new Przelacznik(keyboardChar, "Mechaniczny", "Biały", 20, true, true, dostepneKolory[0], dostepneKolory);
            cherryRed[i] = new Przelacznik(keyboardChar, "Nożycowy", "Biały", 30, true, true, dostepneKolory[1], dostepneKolory);
            basicMembrana[i] = new Przelacznik(keyboardChar, "Membranowy", "Czarny", 10, false, false, null, null);
        }

        Klawiatura Mechanical_1 = new Klawiatura_Mechaniczna("Razer", "Attack 200", "USB", blueKhalids, 300,36,"RZ001");
        Klawiatura Scissor_2 = new Klawiatura_Mechaniczna("Hykker", "Defense 100", "USB", cherryRed, 700,12,"RZ031");
        Klawiatura Membrana_3 = new Klawiatura_Membranowa("Sharkoon", "RX 200", "USB", basicMembrana,100,24,"SHZ001");

        Obsluga_Klawiatury.testujKlawiature(Mechanical_1);
        Obsluga_Klawiatury.kliknijPrzycisk(Mechanical_1,"q");
        Obsluga_Klawiatury.zmienKolorSwiecenia(Membrana_3);

        System.out.println(Scissor_2.getMiesiaceGwarancji());
        Obsluga_Klawiatury.przedluzGwarancje(Scissor_2, 24);
        System.out.println(Scissor_2.getMiesiaceGwarancji());

    }
}
