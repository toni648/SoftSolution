import java.util.Date;

public class Ablesebogen {
    String kundenNummer;
    int zählernummer;
    Date datum;
    boolean neu_eingebaut;
    int zählerstand;
    String kommentar;

    public Ablesebogen(String kundenNummer, int zählernummer, Date datum, boolean neu_eingebaut, int zählerstand, String kommentar) {
        this.kundenNummer = kundenNummer;
        this.zählernummer = zählernummer;
        this.datum = datum;
        this.neu_eingebaut = neu_eingebaut;
        this.zählerstand = zählerstand;
        this.kommentar = kommentar;
    }

    public String getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(String kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public int getZählernummer() {
        return zählernummer;
    }

    public void setZählernummer(int zählernummer) {
        this.zählernummer = zählernummer;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public boolean isNeu_eingebaut() {
        return neu_eingebaut;
    }

    public void setNeu_eingebaut(boolean neu_eingebaut) {
        this.neu_eingebaut = neu_eingebaut;
    }

    public int getZählerstand() {
        return zählerstand;
    }

    public void setZählerstand(int zählerstand) {
        this.zählerstand = zählerstand;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }
}
