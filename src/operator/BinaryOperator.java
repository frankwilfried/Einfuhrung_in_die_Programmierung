package operator;

abstract public class BinaryOperator extends  Operator{
    protected double number;
    public BinaryOperator(String name,double wert,double number) {
        super(name,wert);
        this.number = number;
    }


    public double getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getKonstruktorausdruck() {

        return konstruktorausdruck;
    }



    }
