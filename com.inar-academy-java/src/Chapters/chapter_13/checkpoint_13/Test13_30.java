package Chapters.chapter_13.checkpoint_13;

import Chapters.chapter_13.listing_13.listing13_13.Rational;

public class Test13_30 {
    public static void main(String[] args) {
        Rational r1 = new Rational(-2, 6);
        System.out.println(r1.getNumerator());
        System.out.println(r1.getDenominator());
        System.out.println(r1.intValue());
        System.out.println(r1.doubleValue());
    }
}
