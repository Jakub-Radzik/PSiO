package lab.list4;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class Obsluga_Klawiatury {
    static void testujKlawiature(Klawiatura klawiatura){
        for (Przelacznik klawisz: klawiatura.getKlawisze()) {
            System.out.print(klawisz.getZnak()+" ");
        }
        System.out.println();
    }
    
    static void kliknijPrzycisk(Klawiatura klawiatura, String znak){
            boolean kliknieto = false;
            for (Przelacznik klawisz: klawiatura.getKlawisze()) {
                if (klawisz.getZnak().equals(znak.toUpperCase())){
                    System.out.println(klawisz.getZnak());
                    kliknieto = true;
                }
            }
            if (!kliknieto){
                Logger.getLogger("main").warning("Key not exist on keyboard");
            }
    }

    static void zmienKolorSwiecenia(Klawiatura klawiatura){
        try{
            String[] kolory = klawiatura.getKlawisze()[0].getDostepneKolory();
            int rand = new Random().nextInt(kolory.length);
            Arrays.stream(klawiatura.getKlawisze())
                .forEach(przelacznik ->  przelacznik.setKolorPodswietlenia(kolory[rand]));
            System.out.println("Zmieniono na "+kolory[rand]);
        }catch (NullPointerException e){
            System.out.println("Zmiana koloru jest niemożliwa");
        }
    }

    static void przedluzGwarancje(Klawiatura klawiatura, int miesiace){
        System.out.println("Przed przedłużeniem: " + klawiatura.getMiesiaceGwarancji());
        klawiatura.setMiesiaceGwarancji(klawiatura.getMiesiaceGwarancji()+miesiace);
        System.out.println("Po przedłużeniu: " + klawiatura.getMiesiaceGwarancji());
    }

    static void przedluzGwarancje(Klawiatura[] klawiatury, int miesiace){
        for (Klawiatura klawiatura: klawiatury) {
            klawiatura.setMiesiaceGwarancji(klawiatura.getMiesiaceGwarancji()+miesiace);
        }
    }
}
