package operator;



public class Factorial extends Operator {


    public Factorial(double number) {

        super(number);
    }

    @Override
    public String getName() {
        String name = "Fakultät";
        return name;
    }
@Override
    public String getKonstruktorausdruck() {
        String Konstruktorausdruck= "Factorial";
        return Konstruktorausdruck;
    }
    @Override
    public double apply(double argument) {
        toapply=argument;
        if (argument == 1){
        return wert=  1 ;
    }
        else {
            return wert =argument * apply(argument - 1);
        }
}


}
