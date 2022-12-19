package server;

import java.util.UUID;

public class Kunde {
    UUID id;
    String name;
    String vorname;

    public Kunde() {
    }

    public Kunde(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}
