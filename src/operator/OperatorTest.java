package operator;

public class OperatorTest {
    public static void main(String[] args) {

        Operator op = new Adder(5);
        System.out.println(op.getInfo());
        op = new Divider(5);
        System.out.println(op.getInfo());
        op = new Factorial(0);
        System.out.println(op.getInfo());
    }
}
