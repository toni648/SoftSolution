import org.json.JSONObject;

public class JSONFormat {
    JSONObject jason = new JSONObject();

    public JSONObject getJason() {
        return jason;
    }

    public void setJason(JSONObject jason) {
        this.jason = jason;
    }
    public void setJason(BogenLesen bogenLesen, int i){
        Ablesebogen ablesebogen = bogenLesen.getbogen(i);
        jason.put("Kundennummer",ablesebogen.getKundenNummer());
        jason.put("Zaehlernummer", ablesebogen.getZaehlernummer());
        jason.put("Zaehlerart", ablesebogen.getZaehlerArt());
        jason.put("Datum", ablesebogen.getDatum());
        jason.put("Neu_eingebaut", ablesebogen.getNeu_eingebaut());
        jason.put("Zaehlerstand",ablesebogen.getZaehlerstand());
        jason.put("Kommentar", ablesebogen.getKommentar());
    }

}
