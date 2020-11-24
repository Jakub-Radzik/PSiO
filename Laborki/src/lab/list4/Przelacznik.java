package lab.list4;

import java.util.logging.Logger;

public class Przelacznik {
    private String znak;
    private String typ = "Membrana";
    private String kolorNakladki = "Czarny";
    private int silaOperacyjna = 20;
    private boolean slyszalneKlikniecie = false;
    private boolean podswietlenie = false;
    private String kolorPodswietlenia = null;
    private String[] dostepneKolory = null;

    public Przelacznik(String znak, int silaOperacyjna) {
        this.znak = znak;
        this.silaOperacyjna = silaOperacyjna;
    }

    public Przelacznik(String znak, String typ, String kolorNakladki, int silaOperacyjna, boolean slyszalneKlikniecie, boolean podswietlenie, String kolorPodswietlenia, String[] dostepneKolory) {
        this.znak = znak;
        this.typ = typ;
        this.kolorNakladki = kolorNakladki;
        this.silaOperacyjna = silaOperacyjna;
        this.slyszalneKlikniecie = slyszalneKlikniecie;
        this.podswietlenie = podswietlenie;
        this.kolorPodswietlenia = kolorPodswietlenia;
        this.dostepneKolory = dostepneKolory;
    }

    public void wlaczPodswietlenie(){
        if(podswietlenie && dostepneKolory.length>0){
            kolorPodswietlenia = dostepneKolory[0];
        }
    }

    public void wylaczPodswietlenie(){
        this.kolorPodswietlenia = null;
    }

    public void zmienKolorNakladki(String kolor){
        this.kolorNakladki = kolor;
    }

    public void zmienKolorPodswietlenia(){
        if(dostepneKolory.length>0){
            try{
                for(int i = 0; i < dostepneKolory.length; i++) {
                    if(dostepneKolory[i].equals(kolorPodswietlenia)){
                        kolorPodswietlenia=dostepneKolory[i+1];
                    }
                }
            }catch (ArrayIndexOutOfBoundsException e){
                kolorPodswietlenia = dostepneKolory[0];
            }catch (Exception e){
                Logger.getLogger("main").warning("wrong with color change");
            }
        }
    }

    public String getZnak() {
        return znak;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getKolorNakladki() {
        return kolorNakladki;
    }

    public void setKolorNakladki(String kolorNakladki) {
        this.kolorNakladki = kolorNakladki;
    }

    public int getSilaOperacyjna() {
        return silaOperacyjna;
    }

    public void setSilaOperacyjna(int silaOperacyjna) {
        this.silaOperacyjna = silaOperacyjna;
    }

    public boolean isSlyszalneKlikniecie() {
        return slyszalneKlikniecie;
    }

    public void setSlyszalneKlikniecie(boolean slyszalneKlikniecie) {
        this.slyszalneKlikniecie = slyszalneKlikniecie;
    }

    public boolean isPodswietlenie() {
        return podswietlenie;
    }

    public void setPodswietlenie(boolean podswietlenie) {
        this.podswietlenie = podswietlenie;
    }

    public String getKolorPodswietlenia() {
        return kolorPodswietlenia;
    }

    public void setKolorPodswietlenia(String kolorPodswietlenia) {
        this.kolorPodswietlenia = kolorPodswietlenia;
    }

    public String[] getDostepneKolory() {
        return dostepneKolory;
    }

    public void setDostepneKolory(String[] dostepneKolory) {
        this.dostepneKolory = dostepneKolory;
    }
}
