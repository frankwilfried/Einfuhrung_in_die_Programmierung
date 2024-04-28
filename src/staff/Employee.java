package staff;

public class Employee{
    static int generalOrderLimit;
    private String name;
    public Employee(String name) {
        this.name = name;

    }


    public static void setGeneralOrderLimit(int newgeneralOrderLimit) {
        generalOrderLimit= generalOrderLimit;

    }


   public final String getInfo(){
        String info ="Ich bin"+ name + "mein "+   +" ist "+  + "mein Bestelllimit ist "++"EUR" ;
                return info ;
    }

}
