import java.time.LocalDate;

public class Ablesebogen {
    String kundenNummer;
    String zaehlernummer;
    String zaehlerArt;
    String datum;
    String neu_eingebaut;
    String zaehlerstand;
    String kommentar;

    public Ablesebogen(String kundenNummer, String zaehlernummer, String zaehlerArt, String datum, String neu_eingebaut, String zaehlerstand, String kommentar) {
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

    public String getZaehlernummer() {
        return zaehlernummer;
    }

    public void setZaehlernummer(String zaehlernummer) {
        this.zaehlernummer = zaehlernummer;
    }

    public String getZaehlerArt() {
        return zaehlerArt;
    }

    public void setZaehlerArt(String zaehlerArt) {
        this.zaehlerArt = zaehlerArt;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getNeu_eingebaut() {
        return neu_eingebaut;
    }

    public void setNeu_eingebaut(String neu_eingebaut) {
        this.neu_eingebaut = neu_eingebaut;
    }

    public String getZaehlerstand() {
        return zaehlerstand;
    }

    public void setZaehlerstand(String zaehlerstand) {
        this.zaehlerstand = zaehlerstand;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }
    public String getall(){
        String a ="Kundennummer:" + kundenNummer +" Zaehlernummer:"+ zaehlernummer +" Zaehlerart:"+ zaehlerArt +
                " Datum:"+ datum +"neu eingebunden:"+ neu_eingebaut +" Zaehlerstand:"+ zaehlerstand +"Kommentar:"+ kommentar;
        return a;
    }
}
