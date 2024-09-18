package kalenders;
import java.time.LocalDateTime;
public class Termin {
    private  String name;

    private int dauer ;
    private LocalDateTime start;
    private LocalDateTime ende ;
    public  void init  (String name,LocalDateTime start,LocalDateTime ende ){
        this.name=name;
        this.start=start;
        this.ende=ende;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }  public int getDauer() {
        return dauer;
    }


 public String  getInfo(){
        String info = "name " + getName() +"\n" +
                "start"+ this.start + "\n" +
                "ende "+this.ende +"\n" ;
        return info ;
 }
}
