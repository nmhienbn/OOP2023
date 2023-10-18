package Week6.B1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression a = new Square(new Numeral((int) 10));
        Expression b = new Numeral(3);
        Expression c = new Multiplication(new Numeral(4), new Numeral(3));
        Expression d = new Square(new Addition(new Subtraction(a, b), c));
        System.out.println(d);
        System.out.println(d.evaluate());
    }
}
