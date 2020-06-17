public class Fraction {

    private int numerator, denominator;

    public Fraction(int _numerator, int _denominator) throws DenominatorIsZeroException{
        if(_denominator != 0){
            numerator = _numerator;
            denominator = _denominator;
        } else {
            throw new DenominatorIsZeroException("Denominator cannot be zero.");
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public boolean equals(Fraction f2){

        return numerator * f2.denominator == f2.numerator * denominator;

    }
    public String toString(){
        return numerator +"/" +denominator;
    }


}
