package Week6.B1;

public class Division extends BinaryExpression {

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + left + " / " + right + ")";
    }

    @Override
    public double evaluate() {
        if (right.evaluate() == 0)
            throw new java.lang.ArithmeticException("Lỗi chia cho 0");
        return left.evaluate() / right.evaluate();
    }
}
