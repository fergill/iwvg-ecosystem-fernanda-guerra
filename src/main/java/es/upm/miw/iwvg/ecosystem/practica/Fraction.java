package es.upm.miw.iwvg.ecosystem.practica;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean isProper() { return (numerator < denominator); }

    public boolean isImproper() { return (numerator >= denominator); }

    public boolean isEquivalent(Fraction fraction) {
        return (numerator * fraction.getDenominator() == fraction.getNumerator() * denominator);
    }

    public void sumFractions(Fraction fraction) {
        this.numerator = numerator * fraction.getDenominator() + denominator * fraction.getNumerator();
        this.denominator =  this.denominator * fraction.getDenominator();

    }
}
