package staff;

public class Employee{
  private Superior supname;
    private  static int generalOrderLimit;
    protected int oderlimit;
    private String name;
    public Employee(String name) {
        this.name = name;
        generalOrderLimit=20;
        this.oderlimit=generalOrderLimit;
    }
    public String ist_was(Object name ) {
        if (name instanceof Employee) {
          return   "Mitarbeiter";
        } else if (name instanceof Superior) {
            return "superior";
        }
        else
        return null;
    }
    public boolean mayOrder(int testoder){
        return  testoder <= oderlimit ;
    }
   public final String getInfo(){
        String info ="Ich bin"+ ist_was(name)+"name"+name+" mein Bestelllimit ist "+oderlimit+"EUR" ;
                return info ;
    }

}
