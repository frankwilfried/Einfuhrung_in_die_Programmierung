package staff;

public class Superior extends Employee{
    private Superior superior;
private int oderlimit;
public Superior(String name) {
    super(name);
    this.oderlimit = generalOrderLimit;
}
   public  void setOrderLimit(int newlimit){
       oderlimit  = newlimit;

    }
    public boolean mayOrder(int testoder){
        if (testoder <= oderlimit) {
            return true;
        }
        else {
            return false;
        }
    }
    public void setSuperior(Superior superior) {
        if (superior == null) {
            this.superior = null; // Entziehen des Vorgesetzten
        } else if (superior instanceof Superior) {
            this.superior = superior;
        } else {
            this.superior=(Superior)superior;
        }
}
}



