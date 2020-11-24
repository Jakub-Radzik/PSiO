package lab.list4;

public class Klawiatura_Membranowa extends Klawiatura{
    public Klawiatura_Membranowa(String producent, String model, String interfejs, Przelacznik[] klawisze, int cena, int miesiaceGwarancji, String kodProducenta) {
        super(producent, model, interfejs, klawisze, cena, miesiaceGwarancji, kodProducenta);
    }

    @Override
    String getStan() {
        return null;
    }
}
