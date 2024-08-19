package kalenders;

import java.time.LocalDateTime;

public class Kalender {
    private  String name;
    private  Termin[] termine ;
    private Terminserie [] series ;
    public  void init  (String name,Termin[] termine ){
        this.name=name;
        this.termine=termine;
    }
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public String ausgeben(){
        String info = "name " + getName() +"\n" ;
    info += "Termine:\n";
    for (int i =0 ;i< termine.length-1 ;i++)  {
                System.out.println(termine[i]);
                 System.out.println(series[i]);
             }
    info += "Terminseries:\n";
    for (int i =0 ;i< series.length-1 ;i++)  {
        System.out.println(series[i]);
    }
             return info;
}
}
