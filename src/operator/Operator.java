package operator;

abstract public class Operator {
    protected String name;
    protected double wert ;

    public Operator(String name, double wert) {
        this.wert = wert;
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
      String info="<p>"+getName()+"</p><p>Beispielaufruf: new"+getKonstruktorausdruck()+"="+wert+"</p>";
            return info ;
    }
}

