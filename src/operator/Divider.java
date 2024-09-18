package operator;

public class Divider extends BinaryOperator {


    public Divider(double number) {
        super(number);
    }

    @Override
    public String getName() {

         name = "Division";
        return name;
    }
    @Override
    public String getKonstruktorausdruck() {
        String Konstruktorausdruck= "Divider("+number+")";
        return Konstruktorausdruck;
    }
    private double divider;
    @Override
    public double apply(double argument) {
        toapply=argument;
        return wert= argument/number;
    }


    }

