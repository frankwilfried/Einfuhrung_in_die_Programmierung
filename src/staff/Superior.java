package staff;

public class Superior extends Employee{
    private Superior superior;

    private  static int generalOrderLimit=20;
public Superior(String name) {
    super(name);

}

   public  void setOrderLimit(int newlimit){
       oderlimit  = newlimit;

    }

    public static void setGeneralOrderLimit(int newgeneralOrderLimit) {
        generalOrderLimit= newgeneralOrderLimit;

    }

    public void setSuperior(Superior superior) {
        if (superior == null) {
            this.superior = null;
        } else if (superior instanceof Superior) {
            this.superior = superior;
        } else {
            this.superior=(Superior)superior;
        }
}
}



