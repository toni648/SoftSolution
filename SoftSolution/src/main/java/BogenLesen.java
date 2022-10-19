import java.util.ArrayList;

public class BogenLesen {
    ArrayList<Ablesebogen> bogen = new ArrayList<Ablesebogen>();

    public ArrayList<Ablesebogen> getbogen(){
        return bogen;
    }
    public Ablesebogen getbogen (int i){
        return bogen.get(i);
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


    public String zurückgeben(){
        String a="";
        for(int i = 0; i< bogen.size();i++){
            Ablesebogen abbogen = bogen.get(i);
            a= a+abbogen.getall();
        }
        return a;
    }
}
