import java.time.LocalDate;
import java.util.Date;

public class Ablesebogen {
    String kundenNummer;
    int zaehlernummer;
    String zaehlerArt;
    LocalDate datum;
    boolean neu_eingebaut;
    int zaehlerstand;
    String kommentar;

    public Ablesebogen(String kundenNummer,String zaehlerArt, int zählernummer, LocalDate datum, boolean neu_eingebaut, int zaehlerstand, String kommentar) {
        this.kundenNummer = kundenNummer;
        this.zaehlernummer = zaehlernummer;
        this.zaehlerArt = zaehlerArt;
        this.datum = datum;
        this.neu_eingebaut = neu_eingebaut;
        this.zaehlerstand = zaehlerstand;
        this.kommentar = kommentar;
    }


    public String getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(String kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public int getZaehlernummer() {
        return zaehlernummer;
    }

    public void setZaehlernummer(int zaehlernummer) {
        this.zaehlernummer = zaehlernummer;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public boolean isNeu_eingebaut() {
        return neu_eingebaut;
    }

    public void setNeu_eingebaut(boolean neu_eingebaut) {
        this.neu_eingebaut = neu_eingebaut;
    }

    public int getZaehlerstand() {
        return zaehlerstand;
    }

    public void setZaehlerstand(int zaehlerstand) {
        this.zaehlerstand = zaehlerstand;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }
}
