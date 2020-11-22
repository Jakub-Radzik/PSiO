interface Polecenie {
    public void wykonaj();
    public void cofnij();
}


/* obiekt wywolujacy */
class Trener {
    private Polecenie mode;
    public void setMode(Polecenie polecenie){
        mode = polecenie;
    }

    public void rozkaz(){
        mode.wykonaj();
    }

    public void cofnij(){
        mode.cofnij();
    }
}


/* odbiorca */
class Zawodnik {
    private String id;
    public Zawodnik(String id){
        this.id = id;
    }

    public void zacznijBiegac(){
        System.out.println("zawodnik " + id + " biega" );
    }

    public void przestanBiegac(){
        System.out.println("zawodnik " + id + " przestal biegac" );
    }

    public void zacznijPlywac(){
        System.out.println("zawodnik " + id + " plywa" );
    }

    public void przestanPlywac(){
        System.out.println("zawodnik " + id + " przestal plywac" );
    }

    public void zacznijCwiczyc(){
        System.out.println("zawodnik " + id + " cwiczy" );
    }

    public void przestanCwiczyc(){
        System.out.println("zawodnik " + id + " przestal cwiczyc" );
    }
}


/* Polecenie */
class Bieganie implements Polecenie {
    private Zawodnik zawodnik;  //obiekt wykonujacy
    public Bieganie (Zawodnik zawodnik){
        this.zawodnik = zawodnik;
    }

    public void wykonaj(){
        zawodnik.zacznijBiegac();
    }

    public void cofnij(){
        zawodnik.przestanBiegac();
    }
}


/* Polecenie */
class Plywanie implements Polecenie{
    private Zawodnik zawodnik;  //obiekt wykonujacy
    public Plywanie(Zawodnik zawodnik){
        this.zawodnik = zawodnik;
    }

    public void wykonaj(){
        zawodnik.zacznijPlywac();
    }

    public void cofnij(){
        zawodnik.przestanPlywac();
    }
}


/* Polecenie */
class Cwiczenie implements Polecenie {
    private Zawodnik zawodnik;  //obiekt wykonujacy
    public Cwiczenie(Zawodnik zawodnik){
        this.zawodnik = zawodnik;
    }

    public void wykonaj(){
        zawodnik.zacznijCwiczyc();
    }

    public void cofnij(){
        zawodnik.przestanCwiczyc();
    }

}


/* Polecenie */
class PelnyTrening implements Polecenie{
    Polecenie[] tab;

    public PelnyTrening( Polecenie[]tab){
        this.tab = tab;
    }

    public void wykonaj(){
        for(Polecenie temp : tab){
            temp.wykonaj();
        }
    }

    public void cofnij(){
        for(Polecenie temp : tab){
            temp.cofnij();
        }
    }
}

public class Main {
    public static void main(String[]args){
        Trener trener = new Trener();
        Zawodnik z1 = new Zawodnik("Kowalski");
        Zawodnik z2 = new Zawodnik("Nowak");
        Zawodnik z3 = new Zawodnik("Brzeczyszczykiewicz");
        Zawodnik myZ = new Zawodnik("Radzik");

        Bieganie bieganie = new Bieganie(z1);
        Plywanie plywanie = new Plywanie(z2);

        Bieganie radzikBieg = new Bieganie(myZ);
        Plywanie radzikPlywanie = new Plywanie(myZ);


        trener.setMode(radzikBieg);
        trener.rozkaz();
        trener.setMode(radzikPlywanie);
        trener.rozkaz();
        trener.cofnij();

        System.out.println();

        Polecenie []tab = { new Cwiczenie(myZ), new Bieganie(myZ), new Plywanie(myZ)};
        PelnyTrening pelnyTrening = new PelnyTrening(tab);
        trener.setMode(pelnyTrening);
        trener.rozkaz();
    }
}