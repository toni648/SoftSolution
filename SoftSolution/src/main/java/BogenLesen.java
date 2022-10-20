import java.util.ArrayList;

public class BogenLesen {
    ArrayList<Ablesebogen> bogen = new ArrayList<Ablesebogen>();
public  BogenLesen(){}
    public BogenLesen(ArrayList <Ablesebogen> bogen){
        this.bogen= bogen;

    }

    public ArrayList<Ablesebogen> getbogen(){
        return bogen;
    }
    public Ablesebogen getbogen (int i){
        return bogen.get(i);
    }
    public void deleteBogen(int i){

        bogen.remove(i);
    }

    public BogenLesen search(String kategorie, String daten){
        ArrayList<Ablesebogen> bogenLesen = new ArrayList<Ablesebogen>();
        if(kategorie == "Kundennummer")
        for(int i= 0; i < bogen.size(); i++){
            Ablesebogen ablesebogen = bogen.get(i);
            if(ablesebogen.getKundenNummer()==daten){
                bogenLesen.add(ablesebogen);
            }
            if(ablesebogen.getKundenNummer()!=daten){
                new ErrorGUI("falsch");
            }

        }
            return new BogenLesen(bogenLesen);
    }


    public void createbogen(Ablesebogen abbogen){
        bogen.add(abbogen);
    }
    public void setBogen(int i, Ablesebogen ablesebogen){
        bogen.set(i,ablesebogen);
    }

    public ArrayList<Ablesebogen> getBogen() {
        return bogen;
    }


    public String zurückgeben(int b){
        String a="";
            Ablesebogen abbogen = bogen.get(b);
            a= abbogen.getall();
        return a;
    }

}
