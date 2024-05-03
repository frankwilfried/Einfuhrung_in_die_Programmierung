package operator;

abstract public class Operator {

    protected double number;
    protected double toapply;

    protected String name;


    public double getWert() {
        return wert;
    }

    protected double wert ;

    public Operator(double number) {
        this.wert = wert;
        this.number = number;
        this.name=name;
    }

    public String getKonstruktorausdruck() {
        return konstruktorausdruck;
    }

    protected String  konstruktorausdruck;
    public String getName() {
        return name;
    }


    public abstract double apply(double argument);

    public final String getInfo(){
      String info="<p>"+getName()+"</p><p>Beispielaufruf: new"+getKonstruktorausdruck()+".apply("+10.0+")"+"="+apply(10.0)+"</p>";
            return info ;
    }
}

