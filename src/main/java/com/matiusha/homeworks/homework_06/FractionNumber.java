package com.matiusha.homeworks.homework_06;


import java.util.Objects;

public class FractionNumber {
    private final int nominator;
    private final int denominator;

    public FractionNumber(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public int getNominator() {
        return nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public FractionNumber divede(FractionNumber other) {
        return new FractionNumber(
                getNominator()*other.getDenominator(),
                getDenominator()*other.getNominator());
    }

    public FractionNumber multiply(FractionNumber other) {
        return new FractionNumber(
                getNominator()*other.getNominator(),
                getDenominator()*other.getDenominator());
    }

    public FractionNumber minus(FractionNumber other) {
        return new FractionNumber(
                getNominator()*other.getDenominator()-other.getNominator()*getDenominator(),
                getDenominator()*other.getDenominator());
    }

    public FractionNumber plus(FractionNumber other) {
        return new FractionNumber(
                getNominator()*other.getDenominator()+other.getNominator()*getDenominator(),
                getDenominator()*other.getDenominator());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumber that = (FractionNumber) o;
        return nominator == that.nominator &&
                denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominator, denominator);
    }

    @Override
    public String toString() {
        return nominator + "/" + denominator;
    }
}
