package Chapters.chapter_13.listing_13.listing13_13;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1;

    /**
     * Construct a rational with default properties
     */
    public Rational() {
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);

        int gcd = 1;

        for (int k = 1; k <= n1 / 2 && k <= n2 / 2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return this.numerator;
    }

    public long getDenominator() {
        return this.denominator;
    }

    /**
     * Add a rational number to this rational
     */
    public Rational add(Rational secondRational) {
        long n = this.numerator * secondRational.getDenominator() +
                this.denominator * secondRational.getNumerator();
        long d = this.denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /**
     * Subtract a rational from this rational
     */
    public Rational subtract(Rational secondRational) {
        long n = this.numerator * secondRational.getDenominator() -
                this.denominator * secondRational.getNumerator();
        long d = this.denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /**
     * Multiply a rational number by this rational
     */

    public Rational multiply(Rational secondRational) {
        long n = this.numerator * secondRational.getNumerator();
        long d = this.denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /**
     * Divide a rational number by this rational
     */

    public Rational divide(Rational secondRational) {
        long n = this.numerator * secondRational.getDenominator();
        long d = this.denominator * secondRational.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (this.denominator == 1) {
            return numerator + "";
        } else {
            return this.numerator + "/" + this.denominator;
        }
    }

    @Override
    public boolean equals(Object other) {
        if ((this.subtract((Rational) other)).getNumerator() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return this.numerator * 1.0 / this.denominator;
    }
    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if(this.subtract(o).getNumerator() > 0) {
            return 1;
        } else if (this.subtract(o).getNumerator() < 0) {
            return -1;
        } else
            return 0;
    }
}
