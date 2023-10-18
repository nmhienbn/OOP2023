public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Constructor.
     */
    Solution() {
        this.denominator = 1;
        this.numerator = 0;
    }

    /**
     * Constructor.
     */
    Solution(int numerator, int denominator) {
        if (denominator == 0) {
            this.denominator = 1;
            this.numerator = 0;
        } else {
            this.denominator = denominator;
            this.numerator = numerator;
        }
    }

    /**
     * Set denominator.
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            return;
        }
        this.denominator = denominator;
    }

    /**
     * Get denominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Set numerator.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Get numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    private int gcd(int a, int b) {
        if (b % a == 0) {
            return a < 0 ? -a : a;
        }
        return gcd(b % a, a);
    }

    /**
     * Reduce fraction.
     */
    public Solution reduce() {
        int tmp = gcd(numerator, denominator);
        numerator /= tmp;
        denominator /= tmp;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        return this;
    }

    /**
     * Add fraction.
     */
    public Solution add(Solution other) {
        int dem = denominator * other.denominator;
        int num = numerator * other.denominator + denominator * other.numerator;
        denominator = dem;
        numerator = num;
        return this.reduce();
    }

    /**
     * Subtract fraction.
     */
    public Solution subtract(Solution other) {
        int dem = denominator * other.denominator;
        int num = numerator * other.denominator - denominator * other.numerator;
        denominator = dem;
        numerator = num;
        return this.reduce();
    }

    /**
     * Multiply fraction.
     */
    public Solution multiply(Solution other) {
        denominator *= other.denominator;
        numerator *= other.numerator;
        return this.reduce();
    }

    /**
     * Divide fraction.
     */
    public Solution divide(Solution other) {
        if (other.denominator == 0) {
            return this;
        }
        denominator *= other.numerator;
        numerator *= other.denominator;
        return this.reduce();
    }

    /**
     * Check if obj = fraction.
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return denominator * other.numerator == numerator * other.denominator;
        }
        return false;
    }
}