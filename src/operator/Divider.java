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
        String Konstruktorausdruck= "Divider";
        return Konstruktorausdruck;
    }
    private double divider;
    @Override
    public double apply(double argument) {
        return wert= argument/divider;
    }


    }

