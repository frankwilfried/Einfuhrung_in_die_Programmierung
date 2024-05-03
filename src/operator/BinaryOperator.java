package operator;

abstract public class BinaryOperator extends  Operator{

    public BinaryOperator(double number) {
        super(number);
    }


    public abstract String getKonstruktorausdruck();
}
