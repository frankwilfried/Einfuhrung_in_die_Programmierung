package operator;

public class Adder extends  BinaryOperator {


    public Adder (double number )
    {
        super(number);
    }

    @Override
    public String getName() {
        name= "Addition";
        return name;
    }
    @Override
    public String getKonstruktorausdruck() {
        konstruktorausdruck= "Adder";
        return konstruktorausdruck;
    }

    @Override
    public double   apply(double argument) {

        return wert =argument+number;
    }


}
