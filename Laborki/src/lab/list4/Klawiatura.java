package lab.list4;

abstract public class Klawiatura {
    String producent;
    String model;
    String interfejs = "USB";
    Przelacznik[] klawisze;
    int cena;
    int miesiaceGwarancji = 24;
    String kodProducenta;

    public Klawiatura(String producent, String model, String interfejs, Przelacznik[] klawisze, int cena, int miesiaceGwarancji, String kodProducenta) {
        this.producent = producent;
        this.model = model;
        this.interfejs = interfejs;
        this.klawisze = klawisze;
        this.cena = cena;
        this.miesiaceGwarancji = miesiaceGwarancji;
        this.kodProducenta = kodProducenta;
    }

    @Override
    public String toString() {
        return producent + model;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInterfejs() {
        return interfejs;
    }

    public void setInterfejs(String interfejs) {
        this.interfejs = interfejs;
    }

    public Przelacznik[] getKlawisze() {
        return klawisze;
    }

    public void setKlawisze(Przelacznik[] klawisze) {
        this.klawisze = klawisze;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getMiesiaceGwarancji() {
        return miesiaceGwarancji;
    }

    public void setMiesiaceGwarancji(int miesiaceGwarancji) {
        this.miesiaceGwarancji = miesiaceGwarancji;
    }

    public String getKodProducenta() {
        return kodProducenta;
    }

    public void setKodProducenta(String kodProducenta) {
        this.kodProducenta = kodProducenta;
    }

    abstract String getStan();
}
