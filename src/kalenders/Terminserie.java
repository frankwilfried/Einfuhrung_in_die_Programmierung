package kalenders;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;

public class Terminserie {
    private  String name;
    private  Termin[] termine ;
    private LocalDateTime start;
    private LocalDateTime ende ;
public  void init  (String name,Termin[] termine ){
    this.name=name;
    this.termine=termine;
}
    public Termin getTermine(int index ) {

            return termine[index];

    }
    public int gibAnzahl(){

    return termine.length;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
