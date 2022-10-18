import java.util.ArrayList;

public class BogenLesen {
    ArrayList<Ablesebogen> bogen = new ArrayList<Ablesebogen>();

    public void createbogen(Ablesebogen abbogen){
        bogen.add(abbogen);
    }

    public ArrayList<Ablesebogen> getBogen() {
        return bogen;
    }
    public String zurückgeben(){
        String a="";
        for(int i = 0; i< bogen.size();i++){

        }
        return a;
    }
}
